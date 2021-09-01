import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class E15_26 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final double WIDTH = 400;
        final double HEIGHT = 400;
        final double RADIUS = 150;

        Pane pane = new Pane();

        Arc arc = new Arc(WIDTH / 2, HEIGHT / 2, RADIUS, RADIUS, 225, 90);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);
        arc.setType(ArcType.OPEN);

        Circle circle = new Circle(RADIUS / 20);

        PathTransition pt = new PathTransition(Duration.millis(5000), arc, circle);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();

        FadeTransition ft = new FadeTransition(Duration.millis(5000), circle);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        pane.getChildren().addAll(arc, circle);
        pane.setOnMousePressed(e -> {
            pt.pause();
            ft.pause();

        });
        pane.setOnMouseReleased(e -> {
            pt.play();
            ft.play();
        });

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("E15_24");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
