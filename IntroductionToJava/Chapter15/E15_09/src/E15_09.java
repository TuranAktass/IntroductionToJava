import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class E15_09 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final double WIDTH = 400;
        final double HEIGHT = 400;
        double[] position = { WIDTH / 2, HEIGHT / 2 };

        Pane pane = new Pane();
        pane.setPrefSize(400, 400);

        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(position[0], position[1]);
        polyline.setStroke(Color.BLACK);

        polyline.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    polyline.getPoints().addAll(position[0], position[1] -= 10);
                    break;
                case DOWN:
                    polyline.getPoints().addAll(position[0], position[1] += 10);
                    break;
                case RIGHT:
                    polyline.getPoints().addAll(position[0] += 10, position[1]);
                    break;
                case LEFT:
                    polyline.getPoints().addAll(position[0] -= 10, position[1]);
                    break;
                default:
                    break;
            }

        });

        pane.getChildren().add(polyline);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("E15_09");
        primaryStage.setScene(scene);
        primaryStage.show();

        polyline.requestFocus();
    }
}
