import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_14 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        pane.setPrefSize(400, 400);

        Polygon polygon = new Polygon(40, 20, 70, 40, 60, 80, 45, 45, 20, 60);
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);

        pane.getChildren().add(polygon);

        pane.setOnMouseMoved(e -> {
            pane.getChildren().remove(1, pane.getChildren().size());
            StringBuilder sb = new StringBuilder();

            if (polygon.contains(e.getX(), e.getY())) {
                sb.append("Mouse point is inside the polygon");
            } else {
                sb.append("Mouse point is outside the polygon");
            }

            Text text = new Text(e.getX(), e.getY(), sb.toString());
            pane.getChildren().add(text);

        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_14");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
