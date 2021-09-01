import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class E15_29 extends Application {
    static double currentX = 0;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WIDTH = 400;
        final double HEIGHT = 100;

        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(10), e -> {
            drawCar(currentX, HEIGHT, pane);
        });

        Timeline timeline = new Timeline(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        pane.setOnMousePressed(e -> timeline.pause());
        pane.setOnMouseReleased(e -> timeline.play());

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    timeline.setRate(timeline.getRate() + 0.5);
                    break;
                case DOWN:
                    if (timeline.getRate() <= 0) {
                        timeline.setRate(0);
                        break;
                    } else {
                        timeline.setRate(timeline.getRate() - 0.5);
                        break;
                    }
                default:
                    break;
            }
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_29");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }

    public void drawCar(double x, double y, Pane pane) {
        pane.getChildren().clear();

        if (currentX > pane.getWidth()) {
            currentX = 0;
        }
        Rectangle carBody = new Rectangle(x, y - 20, 50, 10);
        carBody.setFill(Color.BLUEVIOLET);

        Circle leftWheel = new Circle(x + 15, y - 5, 5);
        leftWheel.setFill(Color.BLACK);

        Circle rightWheel = new Circle(x + 35, y - 5, 5);
        rightWheel.setFill(Color.BLACK);

        Polygon p = new Polygon(x + 10, y - 20, x + 20, y - 30, x + 30, y - 30, x + 40, y - 20);
        p.setFill(Color.BLUE);

        pane.getChildren().addAll(carBody, leftWheel, rightWheel, p);
        currentX++;
    }
}

class Car extends Pane {

    public Car(double x, double y) {

    }

}
