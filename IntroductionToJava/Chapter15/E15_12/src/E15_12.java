import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_12 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double centerX = 100;
        final double centerY = 60;
        final double RADIUS = 50;

        Pane pane = new Pane();
        pane.setPrefSize(600,120);

        Circle circle = new Circle(centerX, centerY, RADIUS);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        pane.getChildren().add(circle);

        pane.setOnMouseMoved(e -> {
            pane.getChildren().remove(1, pane.getChildren().size());
            StringBuilder sb = new StringBuilder();
            if (circle.contains(e.getX(), e.getY())) {
                sb.append("Mouse point is inside the circle");
            } else {
                sb.append("Mouse point is outside the circle");
            }
            Text text = new Text(e.getX(), e.getY(), sb.toString());
            pane.getChildren().add(text);
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_12");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
