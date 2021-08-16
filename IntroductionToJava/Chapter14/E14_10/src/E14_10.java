import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class E14_10 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        cylinder pane = new cylinder(200, 200 / 2.5);
        pane.setPadding(new Insets(20));

        Scene scene = new Scene(pane);
        primaryStage.setTitle("e14_10");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}

class cylinder extends StackPane {
    public cylinder(double xRadius, double yRadius) {
        Pane pane = new Pane();

        //ellipse at the top of the cylinder
        Arc topArc = new Arc(xRadius, yRadius, xRadius, yRadius, 0, 360);
        topArc.setFill(Color.WHITE);
        topArc.setStroke(Color.BLACK);

        //half of the bottom ellipse
        Arc bottomArc = new Arc(xRadius, yRadius + yRadius * 5, xRadius, yRadius, 180, 180);
        bottomArc.setFill(Color.WHITE);
        bottomArc.setStroke(Color.BLACK);

        //dashed side of the bottom ellipse
        Arc bottomArcDashed = new Arc(xRadius, yRadius + yRadius * 5, xRadius, yRadius, 0, 180);
        bottomArcDashed.setFill(Color.WHITE);
        bottomArcDashed.setStroke(Color.BLACK);
        bottomArcDashed.getStrokeDashArray().addAll(6.0, 21.0);

        //The lines in the right side and left side of the ellipse
        Line leftLine = new Line(0, yRadius, 0, yRadius + yRadius * 5);
        leftLine.setStroke(Color.BLACK);

        Line rightLine = new Line(xRadius * 2, yRadius, xRadius * 2,yRadius + yRadius * 5);
        rightLine.setStroke(Color.BLACK);

        pane.getChildren().addAll(topArc, bottomArc, leftLine, rightLine, bottomArcDashed);

        getChildren().add(pane);
    }

}
