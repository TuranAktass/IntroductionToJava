import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class E15_18 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WINDOW = 600;
        final double rectH = 120;
        final double rectW = 120;
        Pane pane = new Pane();
        pane.setPrefSize(WINDOW, WINDOW);

        Rectangle rect = new Rectangle(WINDOW / 2, WINDOW / 2, rectW, rectH);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);

        rect.setOnMouseDragged(e -> {
            rect.setX(e.getX() - rectW / 2);
            rect.setY(e.getY() - rectH / 2);
        });

        pane.getChildren().add(rect);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_18");
        primaryStage.setScene(scene);
        primaryStage.show();

        rect.requestFocus();
    }
}
