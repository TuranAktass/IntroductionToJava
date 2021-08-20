import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_16 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double RADIUS = 10;
        final double c1X = 40;
        final double c1Y = 40;
        final double c2X = 120;
        final double c2Y = 150;

        Pane pane = new Pane();
        pane.setPrefSize(400, 400);

        Circle c1 = new Circle(c1X, c1Y, RADIUS);
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);

        Circle c2 = new Circle(c2X, c2Y, RADIUS);
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);

        Line line = new Line();
        line.setStartX(c1X);
        line.setEndX(c2X);
        line.setStartY(c1Y);
        line.setEndY(c2Y);

        Text text = new Text(getMidX(line), getMidY(line), findDistance(line) + "");

        c1.setOnMouseDragged(e -> {
            c1.setCenterX(e.getX());
            c1.setCenterY(e.getY());
            line.setStartX(c1.getCenterX());
            line.setStartY(c1.getCenterY());
            text.setX(getMidX(line));
            text.setY(getMidY(line));
            text.setText(findDistance(line) + "");
        });

        c2.setOnMouseDragged(e -> {
            c2.setCenterX(e.getX());
            c2.setCenterY(e.getY());
            line.setEndX(c2.getCenterX());
            line.setEndY(c2.getCenterY());
            text.setX(getMidX(line));
            text.setY(getMidY(line));
            text.setText(findDistance(line) + "");
        });

        pane.getChildren().addAll(line, text, c1, c2);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_16");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private double findDistance(Line line) {
        double x1 = line.getStartX();
        double y1 = line.getStartY();
        double x2 = line.getEndX();
        double y2 = line.getEndY();

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    private double getMidX(Line line) {
        return (line.getStartX() + line.getEndX()) / 2;
    }

    private double getMidY(Line line) {
        return (line.getStartY() + line.getEndY()) / 2;
    }
}