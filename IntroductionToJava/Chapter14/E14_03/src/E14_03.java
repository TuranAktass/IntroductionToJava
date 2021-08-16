import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class E14_03 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Scene scene = new Scene(pane);

        ArrayList <Image> cards = new ArrayList();

        for(int i = 1; i <= 52; i++){
            Image card = new Image("file:image/card/" + i + ".png");
            cards.add(card);
        }

        Collections.shuffle(cards);

        for(int i = 0; i < 3; i++){
            ImageView cardView = new ImageView(cards.get(i));
            pane.getChildren().add(cardView);
        }
        
        primaryStage.setTitle("E14_03");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    public static void main(String args[]){
        Application.launch(args);
    }

}