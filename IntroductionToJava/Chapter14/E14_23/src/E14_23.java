import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E14_23 extends Application {
    public static void main(String[] args) throws Exception {
        if (args.length != 0) {
            System.out.println(
                    "Usage: java E14_23 centerX1, centerY1, width1, height1, centerX2, centerY2, width2, height2");
            System.exit(1);

            //java E14_23 200 200 40 40 250 250 70 70
        }

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        List<Double> args = getDoubleList(getParameters().getRaw());

        Rectangle r1 = getRectangle(args.get(0), args.get(1), args.get(2), args.get(3));
        Rectangle r2 = getRectangle(args.get(4), args.get(5), args.get(6), args.get(7));

        Pane rectPane = new Pane();
        rectPane.getChildren().addAll(r1, r2);

        Text text = new Text();
        if (contains(r1, r2) || contains(r2, r1)) {
            text.setText("One rectangle is contained in another");
        } else if (overlaps(r1, r2)) {
            text.setText("The rectangles overlap");
        } else {
            text.setText("The rectangles do not overlap");
        }

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20));
        pane.setVgap(20);
        pane.addColumn(0, rectPane, text);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_23");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private static Rectangle getRectangle(double centerX, double centerY, double width, double height) {
        double x = centerX - (width / 2);
        double y = centerY - (height / 2);

        Rectangle r = new Rectangle(x, y, width, height);
        r.setFill(Color.TRANSPARENT);
        r.setStroke(Color.BLACK);

        return r;
    }

    private static List<Double> getDoubleList(List<String> list) {
        List<Double> d = new ArrayList<>();
        for (String s : list) {
            d.add(Double.parseDouble(s));
        }
        return d;
    }

    private static double[][] getCornerPoints(Rectangle r) {
        double[][] corners = new double[4][2];
        corners[0][0] = r.getX();
        corners[0][1] = r.getY();
        corners[1][0] = r.getX() + r.getWidth();
        corners[1][1] = r.getY();
        corners[2][0] = r.getX() + r.getWidth();
        corners[2][1] = r.getY() + r.getHeight();
        corners[3][0] = r.getX();
        corners[3][1] = r.getY() + r.getHeight();
        return corners;
    }

    private static boolean overlaps(Rectangle r1, Rectangle r2) {

        if (r1.getY() < r2.getY() - r2.getHeight() || r1.getY() - r1.getHeight() > r2.getY()
                || r1.getX() > r2.getX() + r2.getWidth() || r1.getX() + r1.getWidth() < r2.getX()) {
            return false;
        }
        return true;
    }

    private static boolean contains(Rectangle r1, Rectangle r2) {
        double[][] corners = getCornerPoints(r2);
        for (int i = 0; i < 4; i++) {
            if (!r1.contains(corners[i][0], corners[i][1])) {
                return false;
            }
        }
        return true;
    }

}
