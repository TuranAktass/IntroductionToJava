import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class E15_33 extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPrefSize(400,400);

        MachineFX machine = new MachineFX(400, 400);
        pane.getChildren().add(machine);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_33");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}