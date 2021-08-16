import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class E14_12 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        final int HEIGHT = 600;
        final int WIDTH = (int) Math.round(HEIGHT / 8);

        final int PROJECT = 20;
        final int QUIZ = 10;
        final int MIDTERM = 30;
        final int FINAL = 40;

        GridPane pane = new GridPane();

        Label projectLabel = getLabel("Project", PROJECT);
        Label quizLabel = getLabel("Quiz", QUIZ);
        Label midtermLabel = getLabel("Midterm", MIDTERM);
        Label finalLabel = getLabel("Final", FINAL);

        Rectangle project = getBar(PROJECT, HEIGHT, WIDTH, Color.RED);
        Rectangle quiz = getBar(QUIZ, HEIGHT, WIDTH, Color.BLUE);
        Rectangle midterm = getBar(MIDTERM, HEIGHT, WIDTH, Color.GREEN);
        Rectangle finalR = getBar(FINAL, HEIGHT, WIDTH, Color.ORANGE);

        RowConstraints rc = new RowConstraints();
        rc.setValignment(VPos.BOTTOM);
        pane.getRowConstraints().add(rc);
        pane.setHgap(20);
        pane.setPadding(new Insets(10));

        pane.addRow(0, project, quiz, midterm, finalR);
        pane.addRow(1, projectLabel, quizLabel, midtermLabel, finalLabel);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_12");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private static Label getLabel(String title, int percentage) {
        return new Label(title + " -- " + percentage + "%");
    }

    private static Rectangle getBar(int percentage, int height, int width, Color color) {
        Rectangle bar = new Rectangle(width, height * (percentage / 100.0));
        bar.setFill(color);
        return bar;
    }
}
