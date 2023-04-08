import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Meal extends Application {
    private TextField mealPrice;
    private Label tipResult;
    private Label taxResult;
    private Label sumResult;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Label promtlabel = new Label("Podaj cene za posiłek.");
        mealPrice = new TextField();
        Button calcButton = new Button("Przelicz");
        calcButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             double price = Double.parseDouble(mealPrice.getText());
             double tip = price * 0.18;
             tipResult.setText(String.format("Napiwek: %.2f złotych.", tip));
             double tax = price * 0.07;
             taxResult.setText(String.format("Podatek: %.2f złotych.", tax));
             double sum = price + tip + tax;
             sumResult.setText(String.format("Razem wyszło: %.2f złotych.", sum));
            }
        });

        Label tip = new Label();
        Label tax = new Label();
        Label sum = new Label();

        HBox hbox = new HBox(10, promtlabel, mealPrice);
        VBox vbox = new VBox(10, hbox, calcButton, tip, tax, sum);

        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Obliczanie ceny posiłku.");
        primaryStage.show();
    }
}
