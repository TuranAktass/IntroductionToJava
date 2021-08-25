import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_19 extends Application {
    int count = 1;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double RADIUS = 10;
        final double WINDOW = 500;
        long startTime = System.currentTimeMillis();

        Pane pane = new Pane();
        pane.setPrefSize(WINDOW, WINDOW);

        Circle circle = new Circle(Math.random() * WINDOW, Math.random() * WINDOW, RADIUS);
        circle.setFill(Color.color(Math.random(), Math.random(), Math.random(), 1.0));
        circle.setStroke(Color.BLACK);
        circle.setOnMouseClicked(e -> {
            if (count == 20) {
                pane.getChildren().clear();
                long totalTime = System.currentTimeMillis() - startTime;
                Text time = new Text(0, WINDOW / 2, String.format("Time spend is " + totalTime + " milliseconds"));
                pane.getChildren().add(time);
            } else {
                circle.setCenterX(Math.random() * WINDOW);
                circle.setCenterY(Math.random() * WINDOW);
                circle.setFill(Color.color(Math.random(), Math.random(), Math.random(), 1.0));
                count++;
            }
        });

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_19");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
