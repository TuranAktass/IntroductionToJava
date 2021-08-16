import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class E14_11 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        SmileyPane pane = new SmileyPane(200);
        pane.setPadding(new Insets(20));

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_11");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String args[]) {
        Application.launch(args);
    }

}

class SmileyPane extends StackPane {

    public SmileyPane(double radius) {
        Pane pane = new Pane();

        // creating a circle head
        Circle head = new Circle(radius, radius, radius);
        head.setFill(Color.WHITE);
        head.setStroke(Color.BLACK);

        // Make an arc for the mouth
        Arc mouth = new Arc(radius, radius + radius / 2.7, radius / 2, radius / 5, 180, 180);
        mouth.setType(ArcType.OPEN);
        mouth.setFill(Color.WHITE);
        mouth.setStroke(Color.BLACK);

        // Make a three-sided polygon for the nose
        double factor = 5;
        double topX = radius;
        double topY = radius - radius / factor;
        double leftX = topY;
        double leftY = radius + radius / factor;
        double rightX = leftY;
        double rightY = leftY;
        Polygon nose = new Polygon(topX, topY, leftX, leftY, rightX, rightY);
        nose.setFill(Color.WHITE);
        nose.setStroke(Color.BLACK);

        // Eye Whites
        Ellipse leftEyeWhite = new Ellipse(radius - radius / 3, radius - radius / 3, radius / 5, radius / 8);
        leftEyeWhite.setFill(Color.WHITE);
        leftEyeWhite.setStroke(Color.BLACK);

        Ellipse rightEyeWhite = new Ellipse(radius + radius / 3, radius - radius / 3, radius / 5, radius / 8);
        rightEyeWhite.setFill(Color.WHITE);
        rightEyeWhite.setStroke(Color.BLACK);

        // Eye Pupils
        Circle leftEyePupil = new Circle(leftEyeWhite.getCenterX(), leftEyeWhite.getCenterY(),
                leftEyeWhite.getRadiusX() / 2);
        leftEyePupil.setFill(Color.BLACK);

        Circle rightEyePupil = new Circle(rightEyeWhite.getCenterX(), rightEyeWhite.getCenterY(),
                rightEyeWhite.getRadiusX() / 2);
        rightEyePupil.setFill(Color.BLACK);

        
        StackPane rightEyePane = new StackPane();
        rightEyePane.getChildren().addAll(rightEyeWhite, rightEyePupil);
        rightEyePane.setLayoutX(radius + radius / 3);
        rightEyePane.setLayoutY(radius - radius / 3);

        StackPane leftEyePane = new StackPane();
        leftEyePane.getChildren().addAll(leftEyeWhite, leftEyePupil);
        leftEyePane.setLayoutX(radius / 3);
        leftEyePane.setLayoutY(radius - radius / 3);

        pane.getChildren().addAll(head, nose, mouth, rightEyePane, leftEyePane);
        getChildren().add(pane);
    }
}