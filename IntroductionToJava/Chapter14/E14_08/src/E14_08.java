import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class E14_08 extends Application{
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        
        ArrayList<Image> deck = new ArrayList<Image>();

        for(int i = 1; i <= 54; i++){
            deck.add(new Image("file:image/card/" + i + ".png"));
        }
        
        int counter = 0;

        for(int i = 0; i < 6; i++){
            for(int k = 0; k < 9; k++){ 
                ImageView card = new ImageView(deck.get(counter));
                pane.add(card, k , i);
                counter++;
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_08");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
