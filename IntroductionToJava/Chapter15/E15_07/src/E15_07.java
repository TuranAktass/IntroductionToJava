import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class E15_07 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WINDOW = 400;
        Pane pane = new Pane();
        pane.setPrefSize(WINDOW, WINDOW);

        Circle circle = new Circle(WINDOW / 2, WINDOW / 2, WINDOW / 4);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        pane.getChildren().add(circle);

        circle.setOnMousePressed(e -> {
            circle.setFill(Color.BLACK);
        });

        circle.setOnMouseReleased(e->{
            circle.setFill(Color.WHITE);
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_07");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
