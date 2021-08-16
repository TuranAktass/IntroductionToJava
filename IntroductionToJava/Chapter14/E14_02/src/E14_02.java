import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class E14_02 extends Application{

    @Override
    public void start(Stage primaryStage){
        GridPane pane = new GridPane();

        for(int i = 0; i <= 2; i++){
            for(int k = 0; k <= 2; k++){
                int rand = (int)(Math.random()*3);

                if(rand == 0){
                    continue;
                } else {
                    String isX = (rand == 1) ? "file:images/x.gif" : "file:images/o.gif";

                    Image img = new Image(isX);
                    ImageView imgView = new ImageView(img);

                    imgView.setFitHeight(75);
                    imgView.setFitWidth(75);

                    pane.add(imgView, i , k);
                }
            }
        }
                
        Scene scene = new Scene(pane, 225 , 225);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
