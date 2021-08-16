import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class E14_07 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        GridPane pane = new GridPane();

        for(int i = 0; i < 10; i++){
            for(int k = 0; k < 10; k++){
                int rand = (int)(Math.random() * 2);
                TextField textField = new TextField();
                
                textField.setText(rand + "");
                textField.setPrefSize(30, 30);
                pane.add(textField, i , k);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_07");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}
