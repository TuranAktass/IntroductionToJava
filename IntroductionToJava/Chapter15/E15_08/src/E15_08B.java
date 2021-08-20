import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_08B extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);

        Text mouseLocation = new Text("");
        pane.getChildren().add(mouseLocation);

        pane.setOnMousePressed(e -> {
            mouseLocation.setText("(" + e.getX() + ", " + e.getY() + ")");
            mouseLocation.setX(e.getX());
            mouseLocation.setY(e.getY());
        });

        pane.setOnMouseDragged(e -> {
            mouseLocation.setText("(" + e.getX() + ", " + e.getY() + ")");
            mouseLocation.setX(e.getX());
            mouseLocation.setY(e.getY());
        });

        pane.setOnMouseReleased(e -> {
            mouseLocation.setText("");
            mouseLocation.setX(0);
            mouseLocation.setY(0);
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_08B");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
