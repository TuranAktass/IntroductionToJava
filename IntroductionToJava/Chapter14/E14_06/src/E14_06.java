import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class E14_06 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();

        for(int i = 0; i < 8; i++){
            boolean isWhite = (i % 2 == 0) ? true : false;

            for(int k = 0; k < 8; k++){
                Rectangle rectangle = new Rectangle(0,0,32,32);
                rectangle.setFill(isWhite ? Color.WHITE : Color.BLACK);
                isWhite = !isWhite;
                pane.add(rectangle , i , k);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_06");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
