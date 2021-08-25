import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class E15_23 extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WIDTH = 400;
        final double HEIGHT = 400;

        StackPane pane = new StackPane();

        ChangeListener<Number> redraw = (observable, oldValue, newValue) -> {
            pane.getChildren().clear();
            drawPolygon(pane, pane.getWidth(), pane.getHeight());
        };

        pane.widthProperty().addListener(redraw);
        pane.heightProperty().addListener(redraw);

        drawPolygon(pane, WIDTH, HEIGHT);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("E15_23");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void drawPolygon(StackPane pane, double width, double height) {
        Polygon sign = new Polygon();
        sign.setFill(Color.RED);
        double angle = 45 / 2.0;
        for (int i = 0; i < 8; i++, angle += 45) {
            double x = width / 2 + width / 2 * Math.cos(Math.toRadians(angle));
            double y = height / 2 + height / 2 * Math.sin(Math.toRadians(angle));
            sign.getPoints().addAll(x, y);
        }

        Text stop = new Text("STOP");
        stop.setFont(Font.font("Times New Roman", width / 5));
        stop.setStroke(Color.WHITE);
        stop.setFill(Color.WHITE);
        pane.getChildren().addAll(sign, stop);

    }

}
