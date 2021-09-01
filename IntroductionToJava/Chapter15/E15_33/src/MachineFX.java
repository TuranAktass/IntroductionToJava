import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MachineFX extends Pane {
    private double width;
    private double height;

    public MachineFX(double width, double height) {
        this.width = width;
        this.height = height;

        drawBottomLine();
        leftSide();
        rightSide();
    }

    private void drawBottomLine() {
        Line bottomLine = new Line();
        bottomLine.setStartX(40);
        bottomLine.setStartY(height - 20);
        bottomLine.setEndX(width - 40);
        bottomLine.setEndY(height - 20);
        bottomLine.setStroke(Color.BLACK);

        getChildren().add(bottomLine);
    }

    private void leftSide(){
        Line leftBottom = new Line();
        leftBottom.setStartX(width - 40);
        leftBottom.setStartY(height - 20);
        leftBottom.setEndX(width - 40);
        leftBottom.setEndY(height - 120);
        leftBottom.setStroke(Color.BLACK);

        Line leftLine = new Line();
        leftLine.setStartX(leftBottom.getEndX());
        leftLine.setStartY(leftBottom.getEndY());
        leftLine.setEndX(215);
        leftLine.setEndY(100);
        leftLine.setStroke(Color.BLACK);

        Line leftTop = new Line();
        leftTop.setStartX(215);
        leftTop.setStartY(100);
        leftTop.setEndX(215);
        leftTop.setEndY(50);
        leftTop.setStroke(Color.BLACK);

        getChildren().addAll(leftLine, leftBottom, leftTop);
    }

    private void rightSide(){
        Line rightBottom = new Line();
        rightBottom.setStartX(40);
        rightBottom.setStartY(height - 20);
        rightBottom.setEndX(40);
        rightBottom.setEndY(height - 120);
        rightBottom.setStroke(Color.BLACK);

        Line rightLine = new Line();
        rightLine.setStartX(rightBottom.getEndX());
        rightLine.setStartY(rightBottom.getEndY());
        rightLine.setEndX(175);
        rightLine.setEndY(100);
        rightLine.setStroke(Color.BLACK);

        Line rightTop = new Line();
        rightTop.setStartX(175);
        rightTop.setStartY(100);
        rightTop.setEndX(175);
        rightTop.setEndY(50);
        rightLine.setStroke(Color.BLACK);

        getChildren().addAll(rightBottom,rightLine, rightTop);
    }

    private void drawObstacles(){
        
    }
}
