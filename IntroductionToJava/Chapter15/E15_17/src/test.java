/*
  Write a program that enables the user to add and remove points in a two-
  dimensional plane dynamically. A minimum bounding rectangle is updated as
  the points are added and removed. Assume the radius of each point is 10
  pixels.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import javafx.event.EventHandler;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.Collections;

public class test extends Application {
  @Override
  public void start(Stage primaryStage) {
    final double WIDTH = 500.0;
    final double HEIGHT = 500.0;
    final double RADIUS = 10.0;
    ArrayList<Double> xPoints = new ArrayList<>();
    ArrayList<Double> yPoints = new ArrayList<>();

    Pane pane = new Pane();

    Scene scene = new Scene(pane, WIDTH, HEIGHT);
    primaryStage.setTitle("E15_17");
    primaryStage.setScene(scene);
    primaryStage.show();

    EventHandler<MouseEvent> removePoint = e -> {
      if (e.getButton().equals(MouseButton.SECONDARY)) {
        Circle c = (Circle)e.getSource();
        xPoints.remove(c.getCenterX());
        yPoints.remove(c.getCenterY());
        pane.getChildren().remove(e.getSource());
        removeRect(pane.getChildren());
        if (xPoints.size() > 0 && yPoints.size() > 0) {
          Rectangle r = getRect(xPoints, yPoints, RADIUS);
          pane.getChildren().add(r);
          r.toBack();
        }
      }
    };

    EventHandler<MouseEvent> addPoint = e -> {
      if (e.getButton().equals(MouseButton.PRIMARY)) {
        xPoints.add(e.getX()); Collections.sort(xPoints);
        yPoints.add(e.getY()); Collections.sort(yPoints);
        Rectangle r = getRect(xPoints, yPoints, RADIUS);
        Circle c = new Circle(e.getX(), e.getY(), RADIUS);
        c.setFill(Color.WHITE);
        c.setStroke(Color.BLACK);
        c.setOnMouseClicked(removePoint);
        removeRect(pane.getChildren());
        pane.getChildren().addAll(c, r);
        r.toBack();
      }
    };

    pane.setOnMouseClicked(addPoint);
  }

  public static Rectangle getRect(ArrayList<Double> xPoints,
    ArrayList<Double> yPoints, double radius) {
    double minX = xPoints.get(0) - radius;
    double minY = yPoints.get(0) - radius;
    double maxX = xPoints.get(xPoints.size() - 1) + radius;
    double maxY = yPoints.get(yPoints.size() - 1) + radius;
    Rectangle r = new Rectangle(minX, minY, maxX - minX, maxY - minY);
    r.setFill(Color.TRANSPARENT);
    r.setStroke(Color.BLACK);
    return r;
  }

  public static void removeRect(ObservableList<Node> list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) instanceof Rectangle) {
        list.remove(i);
        break;
      }
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
