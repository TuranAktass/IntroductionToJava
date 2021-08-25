import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_21 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WIDTH = 400;
        final double HEIGHT = 400;
        final double RADIUS = 150;

        Pane pane = new Pane();

        Circle[] points = new Circle[3];
        Line[] lines = new Line[3];
        Text[] labels = new Text[3];

        Circle circle = new Circle(WIDTH / 2, HEIGHT / 2, RADIUS);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);

        pane.getChildren().add(circle);

        for (int i = 0; i < 3; i++) {
            Circle point = new Circle(RADIUS / 20);
            double randomAngle = Math.random() * 2 * Math.PI;
            double x = circle.getCenterX() + RADIUS * Math.cos(randomAngle);
            double y = circle.getCenterY() + RADIUS * Math.sin(randomAngle);

            point.setCenterX(x);
            point.setCenterY(y);
            point.setOnMouseDragged(e -> {
                double angle = Math.atan2(e.getY() - circle.getCenterY(), e.getX() - circle.getCenterX());
                Circle c = (Circle) e.getSource();
                c.setCenterX(circle.getCenterX() + RADIUS * Math.cos(angle));
                c.setCenterY(circle.getCenterY() + RADIUS * Math.sin(angle));
                angle = getAngle(lines[1], lines[2], lines[0]);
                labels[0].setText("" + angle);
                angle = getAngle(lines[2], lines[1], lines[0]);
                labels[1].setText("" + angle);
                angle = getAngle(lines[0], lines[2], lines[1]);
                labels[2].setText("" + angle);
            });

            points[i] = point;
        }

        for (int i = 0; i < 3; i++) {
            int next = i == 2 ? 0 : i + 1;
            Line line = new Line();
            line.startXProperty().bind(points[i].centerXProperty());
            line.startYProperty().bind(points[i].centerYProperty());
            line.endXProperty().bind(points[next].centerXProperty());
            line.endYProperty().bind(points[next].centerYProperty());
            lines[i] = line;
        }

        // create three Text objects to display the angles
        for (int i = 0; i < 3; i++) {
            Text text = new Text();
            text.xProperty().bind(points[i].centerXProperty());
            text.yProperty().bind(points[i].centerYProperty().subtract(RADIUS / 20));
            labels[i] = text;
        }

        pane.getChildren().addAll(points[0], points[1], points[2], lines[0], lines[1], lines[2], labels[0], labels[1],
                labels[2]);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("E15_21");
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
