import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class E14_20 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WINDOW = 400;

        double startX = Math.random() * WINDOW;
        double startY = Math.random() * WINDOW;
        double endX = Math.random() * WINDOW;
        double endY = Math.random() * WINDOW;

        Pane arrowPane = new Pane();
        drawArrowLine(startX, startY, endX, endY, arrowPane);

        StackPane pane = new StackPane();
        pane.getChildren().add(arrowPane);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_20");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {
        double slope = (startY - endY) / (startX - endX);
        double lineAngle = Math.atan(slope);

        double arrowAngle = startX > endX ? Math.toRadians(45) : -Math.toRadians(225);

        Line line = new Line(startX, startY, endX, endY);

        double lineLength = Math.sqrt(Math.pow(startX - endX, 2) + Math.pow(startY - endY, 2));
        double arrowLength = lineLength / 10;

        Line arrow1 = new Line();
        arrow1.setStartX(line.getEndX());
        arrow1.setStartY(line.getEndY());
        arrow1.setEndX(line.getEndX() + arrowLength * Math.cos(lineAngle - arrowAngle));
        arrow1.setEndY(line.getEndY() + arrowLength * Math.sin(lineAngle - arrowAngle));

        Line arrow2 = new Line();
        arrow2.setStartX(line.getEndX());
        arrow2.setStartY(line.getEndY());
        arrow2.setEndX(line.getEndX() + arrowLength * Math.cos(lineAngle + arrowAngle));
        arrow2.setEndY(line.getEndY() + arrowLength * Math.sin(lineAngle + arrowAngle));

        pane.getChildren().addAll(line, arrow1, arrow2);
    }
}
