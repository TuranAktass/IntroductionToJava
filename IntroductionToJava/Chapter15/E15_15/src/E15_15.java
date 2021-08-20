import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class E15_15 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);

        pane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                Circle circle = new Circle(e.getX(), e.getY(), 5);
                circle.setStroke(Color.BLACK);
                circle.setFill(Color.WHITE);
                pane.getChildren().add(circle);
                circle.setOnMouseClicked(f -> {
                    pane.getChildren().remove(f.getSource());
                });

            }
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_15");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
