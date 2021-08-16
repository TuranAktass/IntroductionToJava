import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class E14_01 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image img1 = new Image("img1.gif");
        Image img2 = new Image("img2.gif");
        Image img3 = new Image("img3.gif");
        Image img4 = new Image("img4.gif");

        ImageView imgView1 = new ImageView(img1);
        ImageView imgView2 = new ImageView(img2);
        ImageView imgView3 = new ImageView(img3);
        ImageView imgView4 = new ImageView(img4);

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(2,2,2,2));

        pane.add(imgView1, 0 , 0);
        pane.add(imgView2, 1, 0);
        pane.add(imgView3, 0 , 1);
        pane.add(imgView4, 1, 1);
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Exercise 14_01");
        primaryStage.setScene(scene);
        primaryStage.show();

        
    }

    public static void main(String args[]){
        Application.launch(args);
    }
}