import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class E14_04 extends Application{
    public static void main(String[] args) throws Exception {
       Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(20,20,20,20));
        Scene scene = new Scene(pane);

        for(int i = 0; i < 5; i++){
            Text text = new Text("Java");
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC , 22));
            text.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            text.setRotate(90);
            pane.getChildren().add(text);
        }

        primaryStage.setTitle("E14_04");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

}
