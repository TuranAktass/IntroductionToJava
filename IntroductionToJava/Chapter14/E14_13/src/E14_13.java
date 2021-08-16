import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E14_13 extends Application{
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        final double SIZE = 600.0;
        final double RADIUS = SIZE / 2.0;

        final int PROJECT = 20;
        final int QUIZ = 10;
        final int MIDTERM = 30;
        final int FINAL = 40;

        double startAngle = 0;

        Arc projectArc = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (PROJECT / 100.0));
        projectArc.setFill(Color.RED);
        projectArc.setType(ArcType.ROUND);
        startAngle += 360 * (PROJECT / 100.0);

        Arc quizArc = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360*(QUIZ / 100.0));
        quizArc.setFill(Color.BLUE);
        quizArc.setType(ArcType.ROUND);
        startAngle += 360 * (QUIZ / 100.0);

        Arc midtermArc = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360*(MIDTERM / 100.0));
        midtermArc.setFill(Color.GREEN);
        midtermArc.setType(ArcType.ROUND);
        startAngle += 360 * (MIDTERM / 100.0);

        Arc finalArc = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360*(FINAL / 100.0));
        finalArc.setFill(Color.ORANGE);
        finalArc.setType(ArcType.ROUND);
        
        Text tProject = new Text("Project -- " + PROJECT + "%");
        tProject.setX(RADIUS + RADIUS / 8);
        tProject.setY(RADIUS - RADIUS / 4);

        Text tQuiz = new Text("Quiz -- " + QUIZ + "%");
        tQuiz.setX(RADIUS);

        Text tMidterm = new Text("Midterm -- " + MIDTERM + "%");
        tMidterm.setY(RADIUS);

        Text tFinal = new Text("Final -- " + FINAL + "%");
        tFinal.setX(RADIUS);
        tFinal.setY(RADIUS + RADIUS);

        Pane pie = new Pane();
        pie.getChildren().addAll(projectArc, tProject, quizArc, tQuiz, midtermArc, tMidterm, finalArc, tFinal);

        StackPane pane = new StackPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20));
        pane.getChildren().add(pie);


        Scene scene = new Scene(pane);
        primaryStage.setTitle("E14_13");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
