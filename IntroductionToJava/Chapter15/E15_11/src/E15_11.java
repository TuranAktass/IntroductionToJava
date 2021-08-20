import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class E15_11 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        final double WIDTH = 400;
        final double HEIGHT = 400;
        final double RADIUS = WIDTH / 16;

        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);

        Circle circle = new Circle(WIDTH / 2, HEIGHT / 2, RADIUS);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        circle.setOnKeyPressed(e->{
            
            switch(e.getCode()){
                case UP:
                    circle.setCenterY(circle.getCenterY() - 10);
                    break;
                case DOWN:
                    circle.setCenterY(circle.getCenterY() + 10);
                    break;
                case RIGHT:
                    circle.setCenterX(circle.getCenterX() + 10);
                    break;
                case LEFT:
                    circle.setCenterX(circle.getCenterX() - 10);
                    break;
                
                default:
                    break;
            }
        });

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_11");
        primaryStage.setScene(scene);
        primaryStage.show();

        circle.requestFocus();
    }
}
