import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_06 extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        final String msg1 = "Java is Fun!";
        final String msg2 = "Java is Powerful!";

        Text txt = new Text(msg1);

        StackPane pane = new StackPane();
        pane.setPrefSize(400,400);
        pane.getChildren().add(txt);

        pane.setOnMouseClicked(e->{
            if(txt.getText().equals(msg1)){
                txt.setText(msg2);
            } else{
                txt.setText(msg1);
            }
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_06");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}