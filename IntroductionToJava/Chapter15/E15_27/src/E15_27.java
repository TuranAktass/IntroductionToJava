import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class E15_27 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WINDOW = 400;

        Pane pane = new Pane();
        pane.setPrefSize(WINDOW, WINDOW);

        Text text = new Text(0, WINDOW / 2, "Programming is Fun!");

        Line line = new Line(0, WINDOW / 2, WINDOW, WINDOW / 2);
        line.setStroke(Color.TRANSPARENT);

        PathTransition pt = new PathTransition(Duration.millis(5000), line, text);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(false);
        pt.play();

        pane.getChildren().addAll(text, line);

        pane.setOnMousePressed(e -> pt.pause());
        pane.setOnMouseReleased(e -> pt.play());

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_27");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
