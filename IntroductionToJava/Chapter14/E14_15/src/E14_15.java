import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E14_15 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StopSign pane = new StopSign(200);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_15");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

class StopSign extends StackPane {
    StopSign(double canvasSize) {

        Polygon oct = new Polygon();
        oct.setFill(Color.RED);
        oct.setStroke(Color.BLACK);

        ObservableList<Double> list = oct.getPoints();

        double centerX = canvasSize / 2;
        double radius = canvasSize;

        for (int i = 0; i <= 8; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            list.add(centerX - radius * Math.sin(2 * i * Math.PI / 8));
        }

        oct.setRotate(45 / 2.0);

        Text stop = new Text("STOP");
        stop.setFont(Font.font("Times New Roman", radius / 2));
        stop.setFill(Color.WHITE);

        getChildren().addAll(oct, stop);

    }
}
