import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_13 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double centerX = 100;
        final double centerY = 60;
        final double WIDTH = 100;
        final double HEIGHT = 40;

        Rectangle rectangle = new Rectangle(centerX, centerY, WIDTH, HEIGHT);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        pane.getChildren().add(rectangle);

        pane.setOnMouseMoved(e -> {
            pane.getChildren().remove(1, pane.getChildren().size());
            StringBuilder sb = new StringBuilder();
            if (rectangle.contains(e.getX(), e.getY())) {
                sb.append("Mouse point is inside the rectangle");
            } else {
                sb.append("Mouse point is outside the rectangle");
            }

            Text text = new Text(e.getX(), e.getY(), sb.toString());
            pane.getChildren().add(text);
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_13");
        primaryStage.setScene(scene);
        primaryStage.show();

        rectangle.requestFocus();

    }
}
