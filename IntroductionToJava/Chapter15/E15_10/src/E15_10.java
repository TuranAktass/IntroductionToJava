import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_10 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
            final double WIDTH = 400;
            final double HEIGHT = 400;

            Pane pane = new Pane();
            pane.setPrefSize(WIDTH, HEIGHT);
            StringBuilder sb = new StringBuilder();

            pane.setOnKeyPressed(e->{
                if(e.getCode() == KeyCode.ENTER){
                    pane.getChildren().clear();
                    Text txt = new Text(WIDTH / 4, HEIGHT / 2, sb.toString());
                    pane.getChildren().add(txt);
                    sb.delete(0,sb.length());
                } else{
                    sb.append(e.getText());
                }
            });

            Scene scene = new Scene(pane);
            primaryStage.setTitle("E15_10");
            primaryStage.setScene(scene);
            primaryStage.show();

            pane.requestFocus();
    }
}
