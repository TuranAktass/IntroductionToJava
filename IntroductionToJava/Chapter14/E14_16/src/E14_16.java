import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class E14_16 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final int WIDTH = 100;
        final int HEIGHT = 100;

        Pane pane = new Pane();

        Line hLine1 = new Line(0, HEIGHT / 3, WIDTH, HEIGHT / 3);
        hLine1.setStroke(Color.BLUE);
        hLine1.endXProperty().bind(pane.widthProperty());
        hLine1.startYProperty().bind(pane.heightProperty().divide(3));
        hLine1.endYProperty().bind(pane.heightProperty().divide(3));

        Line hLine2 = new Line(0, HEIGHT - HEIGHT / 3, WIDTH, HEIGHT - HEIGHT / 3);
        hLine2.setStroke(Color.BLUE);
        hLine2.endXProperty().bind(pane.widthProperty());
        hLine2.startYProperty().bind(pane.heightProperty().divide(3).add(pane.heightProperty().divide(3)));
        hLine2.endYProperty().bind(pane.heightProperty().divide(3).add(pane.heightProperty().divide(3)));

        Line vLine1 = new Line(WIDTH / 3, 0, WIDTH / 3, HEIGHT);
        vLine1.setStroke(Color.RED);
        vLine1.endYProperty().bind(pane.heightProperty());
        vLine1.startXProperty().bind(pane.widthProperty().divide(3));
        vLine1.endXProperty().bind(pane.widthProperty().divide(3));

        Line vLine2 = new Line(WIDTH - WIDTH / 3, 0, WIDTH - WIDTH / 3, HEIGHT);
        vLine2.setStroke(Color.RED);
        vLine2.endYProperty().bind(pane.heightProperty());
        vLine2.startXProperty().bind(pane.widthProperty().divide(3).add(pane.widthProperty().divide(3)));
        vLine2.endXProperty().bind(pane.widthProperty().divide(3).add(pane.widthProperty().divide(3)));

        pane.getChildren().addAll(vLine1, vLine2, hLine1, hLine2);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("E14_16");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
