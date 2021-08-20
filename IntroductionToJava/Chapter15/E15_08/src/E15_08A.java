import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_08A extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);

        Text mousePosition = new Text("");

        pane.setOnMouseClicked(e->{
            mousePosition.setText("(" + e.getX() + ", " + e.getY() + ")");
            mousePosition.setX(e.getX());
            mousePosition.setY(e.getY());
        });

        pane.getChildren().add(mousePosition);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_08");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
