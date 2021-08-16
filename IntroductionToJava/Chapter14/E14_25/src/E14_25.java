import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class E14_25 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final double WINDOW = 400;
        final double RADIUS = 170;

        Pane pane = new Pane();
        pane.setPrefSize(WINDOW, WINDOW);

        Circle circle = new Circle(WINDOW / 2, WINDOW / 2, RADIUS);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.TRANSPARENT);

        Pane container = new Pane();
        drawPolygon(circle, getRandomPoints(5, circle), container);
        pane.getChildren().add(container);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_25");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public List<Point2D> getRandomPoints(int numberOfPoints, Circle circle) {
        ArrayList<Point2D> list = new ArrayList<Point2D>();

        for (int i = 0; i < numberOfPoints; i++) {
            double randomAngle = Math.random() * 360;
            double x = circle.getCenterX() + circle.getRadius() * Math.cos(Math.toRadians(randomAngle));
            double y = circle.getCenterY() + circle.getRadius() * Math.sin(Math.toRadians(randomAngle));
            list.add(new Point2D(x, y));
        }

        return list;
    }

    private void drawPolygon(Circle circle, List<Point2D> points, Pane pane) {
        int numberOfPoints = points.size();

        sortPoints(points, new Point2D(circle.getCenterX(), circle.getCenterY()));

        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        
        ObservableList<Double> list = polygon.getPoints();
        for(int i = 0; i < numberOfPoints; i++){
            list.add(points.get(i).getX());
            list.add(points.get(i).getY());
        }

        pane.getChildren().addAll(circle, polygon);
    }

    private static void sortPoints(List<Point2D> points, Point2D center) {
        boolean changed;
        int numberOfPoints = points.size();

        do {
            changed = false;
            for (int i = 0; i < numberOfPoints - 1; i++) {
                if (comparePoints(points.get(i + 1), points.get(i), center)) {
                    Point2D temp = points.get(i);
                    points.set(i, points.get(i + 1));
                    points.set(i + 1, temp);
                    changed = true;
                }
            }
        } while (changed);
    }

    private static boolean comparePoints(Point2D a, Point2D b, Point2D center) {
        if (a.getX() - center.getX() >= 0 && b.getX() - center.getX() < 0) {
            return true;
        }
        if (a.getX() - center.getX() < 0 && b.getX() - center.getX() >= 0) {
            return false;
        }
        if (a.getX() - center.getX() == 0 && b.getX() - center.getX() == 0) {
            if (a.getY() - center.getY() >= 0 || b.getY() - center.getY() >= 0) {
                return a.getY() > b.getY();
            }

            return b.getY() > a.getY();
        }

        double det = (a.getX() - center.getX()) * (b.getY() - center.getY())
                - (b.getX() - center.getX()) * (a.getY() - center.getY());
        if (det < 0) {
            return true;
        }
        if (det > 0) {
            return false;
        }

        // points a and b are on the same line from the center
        // check which point is closer to the center
        double d1 = (a.getX() - center.getX()) * (a.getX() - center.getX())
                + (a.getY() - center.getY()) * (a.getY() - center.getY());
        double d2 = (b.getX() - center.getX()) * (b.getX() - center.getX())
                + (b.getY() - center.getY()) * (b.getY() - center.getY());
        return d1 > d2;
    }
}
