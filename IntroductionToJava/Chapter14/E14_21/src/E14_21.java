import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E14_21 extends Application{
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WINDOW = 400;

        double circle1X = Math.random() * WINDOW;
        double circle1Y = Math.random() * WINDOW;

        double circle2X = Math.random() * WINDOW;
        double circle2Y = Math.random() * WINDOW;

        Circle circle1 = new Circle(circle1X, circle1Y, 15);
        circle1.setFill(Color.BLACK);

        Circle circle2 = new Circle(circle2X, circle2Y, 15);
        circle2.setFill(Color.BLACK);

        Line line = new Line(circle1X, circle1Y, circle2X, circle2Y);
        line.setStroke(Color.BLACK);
        
        double distance = Math.sqrt(Math.pow(circle2X - circle1X, 2) + Math.pow(circle2Y - circle1Y , 2));
        Text distanceText = new Text(Math.abs(circle2X + circle1X) / 2 , Math.abs(circle2Y + circle1Y) / 2 , " " + distance);

        Pane pane = new Pane();
        pane.getChildren().addAll(circle1, circle2,line,distanceText);
        pane.setPrefSize(WINDOW,WINDOW);

        Scene scene = new Scene(pane);

        primaryStage.setTitle("E14_21");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}
