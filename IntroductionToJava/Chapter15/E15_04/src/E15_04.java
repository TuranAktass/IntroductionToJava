import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class E15_04 extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lblNumber1 = new Label("Number 1:");
        Label lblNumber2 = new Label("Number 2:");
        Label lblResult = new Label("Result:");

        TextField txtNumber1 = new TextField();
        TextField txtNumber2 = new TextField();
        TextField txtResult = new TextField();
        txtResult.setEditable(false);
        txtNumber1.setPrefWidth(50);
        txtNumber2.setPrefWidth(50);
        txtResult.setPrefWidth(50);

        Button btnAdd = new Button("Add");
        Button btnSubtract = new Button("Subtract");
        Button btnMultiply = new Button("Multiply");
        Button btnDivide = new Button("Divide");

        HBox topPane = new HBox(5);
        topPane.setAlignment(Pos.CENTER);
        topPane.setPadding(new Insets(5));
        topPane.getChildren().addAll(lblNumber1, txtNumber1, lblNumber2, txtNumber2, lblResult, txtResult);

        HBox bottomPane = new HBox(5);
        bottomPane.setAlignment(Pos.CENTER);
        bottomPane.setPadding(new Insets(5));
        bottomPane.getChildren().addAll(btnAdd, btnSubtract, btnMultiply, btnDivide);

        btnAdd.setOnAction(e->{
            double a = getDoubleFromTextField(txtNumber1);
            double b = getDoubleFromTextField(txtNumber2);
            txtResult.setText(a + b + "");
        });

        btnSubtract.setOnAction(e->{
            double a = getDoubleFromTextField(txtNumber1);
            double b = getDoubleFromTextField(txtNumber2);
            txtResult.setText(a - b + "");
        });

        btnMultiply.setOnAction(e->{
            double a = getDoubleFromTextField(txtNumber1);
            double b = getDoubleFromTextField(txtNumber2);
            txtResult.setText(a * b + "");
        });

        btnDivide.setOnAction(e->{
            double a = getDoubleFromTextField(txtNumber1);
            double b = getDoubleFromTextField(txtNumber2);
            txtResult.setText(a / b + "");
        });

        BorderPane pane = new BorderPane();
        pane.setTop(topPane);
        pane.setBottom(bottomPane);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("E15_04");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static double getDoubleFromTextField(TextField t){
        return Double.parseDouble(t.getText());
    }
}
