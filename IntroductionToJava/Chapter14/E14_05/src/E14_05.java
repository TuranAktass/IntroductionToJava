import java.time.format.TextStyle;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E14_05 extends Application{
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double SIZE = 400;
        final double RADIUS = SIZE / 2;
        String[] text = "WELCOME TO JAVA ".split("");

        Pane letters = new Pane();

        for(int i = 0; i < text.length; i++){
            double angle = (2 * i * Math.PI) / text.length;
            double x = RADIUS + RADIUS * Math.cos(angle);
            double y = RADIUS + RADIUS * Math.sin(angle);

            Text letter = new Text(x, y ,text[i]);
            letter.setRotate(90 + Math.toDegrees(angle));
            letter.setFont(Font.font("Times New Roman" , RADIUS / 8));
            letters.getChildren().add(letter);
        }

        StackPane pane = new StackPane();
        pane.getChildren().add(letters);
        pane.setPadding(new Insets(20));
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane);

        primaryStage.setTitle("E14_05");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}
