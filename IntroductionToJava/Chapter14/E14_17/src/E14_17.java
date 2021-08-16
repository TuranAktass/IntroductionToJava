import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class E14_17 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WINDOW = 600;

        Arc base = new Arc(WINDOW / 5, WINDOW, WINDOW / 6, WINDOW / 15, 0, 180);
        base.setType(ArcType.OPEN);
        base.setFill(Color.WHITE);
        base.setStroke(Color.BLACK);

        Line stand = new Line();
        stand.setStartX(base.getCenterX());
        stand.setStartY(base.getCenterY() - base.getRadiusY());
        stand.setEndX(stand.getStartX());
        stand.setEndY(WINDOW - WINDOW);

        Line top = new Line();
        top.setStartX(stand.getEndX());
        top.setStartY(top.getEndY());
        top.setEndX(top.getStartX() + WINDOW / 2);
        top.setEndY(stand.getEndY());

        Line hook = new Line();
        hook.setStartX(top.getEndX());
        hook.setStartY(top.getEndY());
        hook.setEndX(hook.getStartX());
        hook.setEndY(WINDOW / 10);

        double headRadius = WINDOW / 12;

        Circle head = new Circle(headRadius);
        head.setCenterX(hook.getStartX());
        head.setCenterY(hook.getEndY() + head.getRadius());
        head.setFill(Color.WHITE);
        head.setStroke(Color.BLACK);

        double armLength = WINDOW / 4;

        Line leftArm = new Line();
        leftArm.setStartX(head.getCenterX());
        leftArm.setStartY(head.getCenterY());
        leftArm.setEndX(head.getCenterX() + armLength * Math.cos(Math.toRadians(135)));
        leftArm.setEndY(head.getCenterY() + armLength * Math.sin(Math.toRadians(45)));

        Line rightArm = new Line();
        rightArm.setStartX(head.getCenterX());
        rightArm.setStartY(head.getCenterY());
        rightArm.setEndX(head.getCenterX() + armLength * Math.cos(Math.toRadians(45)));
        rightArm.setEndY(head.getCenterY() + armLength * Math.sin(Math.toRadians(45)));

        double bodyLength = WINDOW / 2.5;

        Line body = new Line();
        body.setStartX(head.getCenterX());
        body.setStartY(head.getCenterY());
        body.setEndX(body.getStartX());
        body.setEndY(body.getStartY() + bodyLength);

        double legLength = WINDOW / 4;

        Line leftLeg = new Line();
        leftLeg.setStartX(body.getEndX());
        leftLeg.setStartY(body.getEndY());
        leftLeg.setEndX(leftLeg.getStartX() + legLength * Math.cos(Math.toRadians(135)));
        leftLeg.setEndY(leftLeg.getStartY() + legLength * Math.sin(Math.toRadians(135)));

        Line rightLeg = new Line();
        rightLeg.setStartX(body.getEndX());
        rightLeg.setStartY(body.getEndY());
        rightLeg.setEndX(rightLeg.getStartX() + legLength * Math.cos(Math.toRadians(45)));
        rightLeg.setEndY(rightLeg.getStartY() + legLength * Math.sin(Math.toRadians(45)));

        Pane hangman = new Pane();
        hangman.getChildren().addAll(base, stand, top, hook, leftArm, rightArm, body, head, leftLeg, rightLeg);

        StackPane pane = new StackPane();
        pane.setPadding(new Insets(20));
        pane.getChildren().add(hangman);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_17");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
