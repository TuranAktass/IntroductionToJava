import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class E15_01 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(2);
        CardPane cardPane = new CardPane();

        Button btRefresh = new Button("Refresh");
        btRefresh.setOnAction(e -> {
            cardPane.shuffle();
        });
        
        pane.getChildren().addAll(cardPane , btRefresh);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_01");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

class CardPane extends GridPane {
    public CardPane() {
        Initialize();
    }

    public void shuffle() {
        Initialize();
    }

    public void Initialize() {
        GridPane pane = new GridPane();

        for (int i = 0; i < 4; i++) {
            ImageView card = new ImageView("file:img/card/" + (int) (Math.random() * 52) + ".png");
            pane.add(card, i, 0);
        }
        getChildren().add(pane);
    }
}
