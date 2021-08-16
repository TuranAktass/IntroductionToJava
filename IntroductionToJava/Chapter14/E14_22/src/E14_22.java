import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E14_22 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final double WINDOW = 400;

        double circle1X = Math.random() * WINDOW;
        double circle1Y = Math.random() * WINDOW;

        double circle2X = Math.random() * WINDOW;
        double circle2Y = Math.random() * WINDOW;

        Circle circle1 = new Circle(circle1X, circle1Y, 15);
        Circle circle2 = new Circle(circle2X, circle2Y, 15);

        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);

        Text t1 = new Text(circle1X, circle1Y, "1");
        Text t2 = new Text(circle2X, circle2Y , "2");

        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
        line.setStroke(Color.BLACK);

        Pane pane = new Pane();
        pane.setPadding(new Insets(20));
        pane.getChildren().addAll(line, circle1, circle2,t1,t2);
        pane.setPrefSize(WINDOW, WINDOW);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_22");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
