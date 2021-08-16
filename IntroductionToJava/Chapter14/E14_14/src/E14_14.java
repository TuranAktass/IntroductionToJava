import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class E14_14 extends Application{
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        RectanguloidPane pane = new RectanguloidPane(200);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_14");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}

class RectanguloidPane extends StackPane{

    public RectanguloidPane(double side){

        Pane pane = new Pane();
        
        Rectangle rect1 = new Rectangle(side / 10, 10, side, side);
        rect1.widthProperty().bind(widthProperty().subtract(side / 10));
        rect1.heightProperty().bind(heightProperty().subtract(side / 2));
        rect1.setFill(Color.TRANSPARENT);
        rect1.setStroke(Color.BLACK);

        Rectangle rect2 = new Rectangle(0,side / 3,side,side);
        rect2.widthProperty().bind(widthProperty().subtract(side / 10));
        rect2.heightProperty().bind(heightProperty().subtract(side / 2));
        rect2.setFill(Color.TRANSPARENT);
        rect2.setStroke(Color.BLACK);

        Line line1 = new Line(rect2.getX(), rect2.getY(), rect1.getX(), rect1.getY());

        Line line2 = new Line();
        line2.setStartX(rect2.getX());
        line2.setEndX(rect1.getX());
        line2.startYProperty().bind(rect2.yProperty().add(rect2.heightProperty()));
        line2.endYProperty().bind(rect1.yProperty().add(rect1.heightProperty()));

        Line line3 = new Line();
        line3.setStartY(rect2.getY());
        line3.setEndY(rect1.getY());
        line3.startXProperty().bind(rect2.xProperty().add(rect2.widthProperty()));
        line3.endXProperty().bind(rect1.xProperty().add(rect1.widthProperty()));

        Line line4 = new Line();
        line4.startXProperty().bind(rect2.xProperty().add(rect2.widthProperty()));
        line4.startYProperty().bind(rect2.yProperty().add(rect2.heightProperty()));
        line4.endXProperty().bind(rect1.xProperty().add(rect1.widthProperty()));
        line4.endYProperty().bind(rect1.yProperty().add(rect1.heightProperty()));

        pane.getChildren().addAll(line1,line2,line3,line4,rect1, rect2);
        getChildren().add(pane);

    }
}
