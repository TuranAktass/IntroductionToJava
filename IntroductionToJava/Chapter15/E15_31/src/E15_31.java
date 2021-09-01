import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class E15_31 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WIDTH = 400;
        final double HEIGHT = 400;

        Pane pane = new Pane();

        Circle c1 = new Circle(WIDTH / 2, 40, 5);

        Circle c2 = new Circle(20);

        Arc arc = new Arc();
        arc.setCenterX(WIDTH / 2);
        arc.setCenterY(HEIGHT / 5 * 3);
        arc.setRadiusX(WIDTH / 2 - 20);
        arc.setRadiusY(HEIGHT - (HEIGHT - 80));
        arc.setStartAngle(180);
        arc.setFill(Color.TRANSPARENT);
        // arc.setStroke(Color.RED);
        arc.setLength(180);
        arc.setType(ArcType.OPEN);

        Line line = new Line();
        line.startXProperty().bind(c1.centerXProperty());
        line.startYProperty().bind(c1.centerYProperty());
        line.endXProperty().bind(c2.translateXProperty());
        line.endYProperty().bind(c2.translateYProperty());

        PathTransition pt = new PathTransition(Duration.millis(1000), arc, c2);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();

        pane.getChildren().addAll(line, c1, c2);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("E15_31");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
