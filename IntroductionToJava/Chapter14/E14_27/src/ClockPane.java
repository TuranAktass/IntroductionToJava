import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends StackPane {

    public ClockPane(int hour, int minute, int second) {

        final int WINDOW = 400;
        final int RADIUS = WINDOW / 2;

        Pane pane = new Pane();
        pane.setPrefSize(400, 400);

        Circle circle = new Circle(RADIUS, RADIUS, RADIUS);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.TRANSPARENT);

        double centerX = circle.getCenterX();
        double centerY = circle.getCenterY();

        Text three = new Text(WINDOW - 10, RADIUS, "3");
        Text nine = new Text(10, RADIUS, "9");
        Text six = new Text(centerX, Math.abs(10 - WINDOW), "6");
        Text twelve = new Text(RADIUS, 10, "12");

        double hLength = RADIUS * 0.6;
        double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60) * (2 * Math.PI / 12));

        double mLength = RADIUS * 0.7;
        double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));

        double sLength = RADIUS * 0.8;
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));

        Line hourLine = new Line(centerX, centerY, hourX, hourY);
        Line minuteLine = new Line(centerX, centerY, minuteX, minuteY);
        Line secondLine = new Line(centerX, centerY, secondX, secondY);

        pane.getChildren().addAll(circle, three, six, nine, twelve, hourLine, minuteLine, secondLine);

        getChildren().add(pane);

    }
}