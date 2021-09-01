import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class E15_32 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WIDTH = 300;
        final double HEIGHT = 300;

        ClockPane clock = new ClockPane();

        BorderPane pane = new BorderPane();

        Button btnStop = new Button("Stop");
        Button btnStart = new Button("Start");

        HBox btnPane = new HBox();
        btnPane.setAlignment(Pos.CENTER);
        btnPane.getChildren().addAll(btnStop, btnStart);

        btnStart.setOnAction(e -> clock.start());
        btnStop.setOnAction(e -> clock.stop());

        pane.setCenter(clock);
        pane.setBottom(btnPane);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("E15_32");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
