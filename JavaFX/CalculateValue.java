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

public class PropertyTax extends Application
{
    private TextField actualValue;

    private Label estimatedValue;
    private Label taxValue;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        actualValue = new TextField();
        Label promtLabel = new Label("Wpisz rzeczywistą wartość nieruchomości");

        Button calcButton = new Button("Oblicz");

        calcButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                double actValue = Double.parseDouble(actualValue.getText());
                
                double estValue = actValue * 0.60;
                estimatedValue.setText(String.format("Oszacowana wartość to: %.2f złotych.", estValue));
                
                double tax = (estValue / 100) * 0.64;
                taxValue.setText(String.format("Podatek od wartości oszacowanej to: %.2f złotych.", tax));

            }
        });

        Label estimatedValue = new Label();
        Label taxValue = new Label();

        HBox hbox = new HBox(10, promtLabel, actualValue);
        VBox vbox = new VBox(10, hbox, calcButton, estimatedValue, taxValue);
        
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Obliczanie wartości.");
        primaryStage.show();
    }
}
