import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E15_17 extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();

        Pane instructionPane = new Pane();
        Rectangle instructionRect = new Rectangle();
        Text instructionText = new Text(25, 25, "INSTRUCTION\nAdd: Left Click\nRemove Right Click");

        instructionRect.setFill(Color.TRANSPARENT);
        instructionRect.setStroke(Color.BLACK);
        instructionRect.setWidth(150);
        instructionRect.setHeight(75);
        instructionRect.setX(10);
        instructionRect.setY(10);

        instructionPane.getChildren().addAll(instructionRect, instructionText);

        Pane rightPane = new Pane();
        rightPane.setPrefSize(400, 400);

        ArrayList<Double> xPoints = new ArrayList<Double>();
        ArrayList<Double> yPoints = new ArrayList<Double>();

        rightPane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                xPoints.add(e.getX());
                Collections.sort(xPoints);
                yPoints.add(e.getY());
                Collections.sort(yPoints);

                Rectangle rect = getRectangle(xPoints, yPoints);

                Circle circle = new Circle(e.getX(), e.getY(), 10);
                circle.setFill(Color.WHITE);
                circle.setStroke(Color.BLACK);

                removeRect(rightPane.getChildren());
                rightPane.getChildren().addAll(rect, circle);
                rect.toBack();


                circle.setOnMouseClicked(f -> {
                    if (f.getButton() == MouseButton.SECONDARY) {
                         Circle c = (Circle)f.getSource();
                        removeRect(rightPane.getChildren());
                        xPoints.remove(c.getCenterX());
                        yPoints.remove(c.getCenterY());
                        rightPane.getChildren().remove(f.getSource());
                        removeRect(rightPane.getChildren());

                        if(xPoints.size() > 0 && yPoints.size() > 0){
                            Rectangle r = getRectangle(xPoints, yPoints);
                            rightPane.getChildren().add(r);
                            r.toBack();
                        }
                    }
                });
            }
        });

        pane.setLeft(instructionPane);
        pane.setRight(rightPane);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_17");
        primaryStage.setScene(scene);
        primaryStage.show();

        rightPane.requestFocus();
    }

    private Rectangle getRectangle(ArrayList<Double> xList, ArrayList<Double> yList) {
        double startX = xList.get(0) - 10;
        double startY = yList.get(0) - 10;
        double endX = xList.get(xList.size() - 1) + 10;
        double endY = yList.get(yList.size() - 1) + 10;

        Rectangle rectangle = new Rectangle(startX, startY, endX - startX , endY - startY);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);

        return rectangle;
    }

    public static void removeRect(ObservableList<Node> observableList) {
        for (int i = 0; i < observableList.size(); i++) {
            if (observableList.get(i) instanceof Rectangle) {
                observableList.remove(i);
                break;
            }
        }
    }
}