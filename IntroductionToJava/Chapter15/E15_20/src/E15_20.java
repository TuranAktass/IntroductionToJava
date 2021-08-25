import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_20 extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        final double WIDTH = 400;
        final double HEIGHT = 400;
        final double RADIUS = 10;

        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);

        Circle a = new Circle(100, 300, RADIUS);
        Circle b = new Circle(200, 200, RADIUS);
        Circle c = new Circle(300, 300, RADIUS);

        Text tA = new Text("A");
        Text tB = new Text("B");
        Text tC = new Text("C");

        Line a_b = new Line();
        Line a_c = new Line();
        Line b_c = new Line();

        EventHandler<MouseEvent> dragCircle = e -> {
            if (e.getButton().equals(MouseButton.PRIMARY)) {
                Circle circle = (Circle) e.getSource();
                circle.setCenterX(e.getX());
                circle.setCenterY(e.getY());
                double angle = getAngle(b_c, a_c, a_b);
                tA.setText("" + angle);
                angle = getAngle(a_c, b_c, a_b);
                tB.setText("" + angle);
                angle = getAngle(a_b, a_c, b_c);
                tC.setText("" + angle);

            }
        };

        a.setOnMouseDragged(dragCircle);
        b.setOnMouseDragged(dragCircle);
        c.setOnMouseDragged(dragCircle);

        // line between a and b
        a_b.startXProperty().bind(a.centerXProperty());
        a_b.startYProperty().bind(a.centerYProperty());
        a_b.endXProperty().bind(b.centerXProperty());
        a_b.endYProperty().bind(b.centerYProperty());

        // line between b and c
        b_c.startXProperty().bind(b.centerXProperty());
        b_c.startYProperty().bind(b.centerYProperty());
        b_c.endXProperty().bind(c.centerXProperty());
        b_c.endYProperty().bind(c.centerYProperty());

        // line between a and c
        a_c.startXProperty().bind(a.centerXProperty());
        a_c.startYProperty().bind(a.centerYProperty());
        a_c.endXProperty().bind(c.centerXProperty());
        a_c.endYProperty().bind(c.centerYProperty());

        tA.xProperty().bind(a.centerXProperty());
        tA.yProperty().bind(a.centerYProperty().subtract(RADIUS));
        tB.xProperty().bind(b.centerXProperty().subtract(RADIUS));
        tB.yProperty().bind(b.centerYProperty().subtract(RADIUS));
        tC.xProperty().bind(c.centerXProperty().subtract(RADIUS));
        tC.yProperty().bind(c.centerYProperty().subtract(RADIUS));

        pane.getChildren().addAll(a_c, a_b, b_c, a, b, c, tA, tB, tC);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("E15_20");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static double getAngle(Line x, Line y, Line z) {
        double a = distance(x);
        double b = distance(y);
        double c = distance(z);
        return Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
    }

    public static double distance(Line line) {
        double x1 = line.getStartX();
        double y1 = line.getStartY();
        double x2 = line.getEndX();
        double y2 = line.getEndY();
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

}