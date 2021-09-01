import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class E15_28 extends Application {
    boolean isSpinningLeft = true;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final double WIDTH = 400;
        final double HEIGHT = 400;
        final double CENTER_X = WIDTH / 2;
        final double CENTER_Y = HEIGHT / 2;
        final double RADIUS = 150;

        Pane fanPane = new Pane();
        HBox buttonPane = new HBox();
        BorderPane pane = new BorderPane();

        Arc[] fans = new Arc[4];

        pane.setPrefSize(WIDTH, HEIGHT);
        pane.setCenter(fanPane);
        pane.setBottom(buttonPane);

        Circle fanCircle = new Circle(CENTER_X, CENTER_Y, RADIUS);
        fanCircle.setFill(Color.TRANSPARENT);
        fanCircle.setStroke(Color.BLACK);

        for (int i = 0, sa = 0; i < 4; i++, sa += 90) {
            Arc arc = new Arc(CENTER_X, CENTER_Y, RADIUS - 10, RADIUS - 10, sa, 45);
            arc.setType(ArcType.ROUND);
            fans[i] = arc;
            fanPane.getChildren().add(arc);
        }

        fanPane.getChildren().addAll(fanCircle);

        Button btnPause = new Button("PAUSE");
        Button btnResume = new Button("RESUME");
        Button btnReverse = new Button("REVERSE");

        buttonPane.getChildren().addAll(btnPause, btnResume, btnReverse);

        EventHandler<ActionEvent> spinFan = e -> {
            int increment = isSpinningLeft ? 1 : -1;
            for (int i = 0; i < fans.length; i++) {
                double prevStartAngle = fans[i].getStartAngle();
                fans[i].setStartAngle(prevStartAngle + increment);
            }
        };

        KeyFrame kf = new KeyFrame(Duration.millis(1), spinFan);

        Timeline tl = new Timeline(kf);
        tl.setCycleCount(Timeline.INDEFINITE);
        tl.play();

        btnPause.setOnAction(e -> tl.pause());
        btnResume.setOnAction(e -> tl.play());
        btnReverse.setOnAction(e -> isSpinningLeft = !isSpinningLeft);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_28");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
