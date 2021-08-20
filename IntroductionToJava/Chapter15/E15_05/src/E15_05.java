import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class E15_05 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lblInvestmentAmount = new Label("Investment Amount: ");
        Label lblNumberOfYears = new Label("Number of Years: ");
        Label lblAnnualInterestRate = new Label("Annual Interest Rate: ");
        Label lblFutureValue = new Label("Future Value: ");

        TextField txtInvestmentAmount = new TextField();
        TextField txtNumberOfYears = new TextField();
        TextField txtAnnualInterestRate = new TextField();
        TextField txtFutureValue = new TextField();
        txtFutureValue.setEditable(false);

        Button btnCalculate = new Button("Calculate");
        btnCalculate.setOnAction(e -> {
            double investment = getDoubleFromTextField(txtInvestmentAmount);
            double numberOfYears = getDoubleFromTextField(txtNumberOfYears);
            double interestRate = getDoubleFromTextField(txtAnnualInterestRate);

            txtFutureValue.setText(String.format("$%.2f", getFutureValue(investment, numberOfYears, interestRate)));
        });

        GridPane inputPane = new GridPane();
        inputPane.addRow(0, lblInvestmentAmount, txtInvestmentAmount);
        inputPane.addRow(1, lblNumberOfYears, txtNumberOfYears);
        inputPane.addRow(2, lblAnnualInterestRate, txtAnnualInterestRate);
        inputPane.addRow(3, lblFutureValue, txtFutureValue);
        inputPane.add(btnCalculate, 1, 4);

        GridPane.setHalignment(btnCalculate, HPos.RIGHT);
        inputPane.setVgap(5);
        inputPane.setHgap(5);
        inputPane.setPadding(new Insets(5));
        inputPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(inputPane);
        primaryStage.setTitle("E15_05");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static double getDoubleFromTextField(TextField t) {
        return Double.parseDouble(t.getText());
    }

    private static double getFutureValue(double investment, double numberOfYears, double interestRate) {
        interestRate = interestRate / 1200;
        double futureValue = investment * Math.pow((1 + interestRate), (numberOfYears * 12));

        return futureValue;
    }
}
