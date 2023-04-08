import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Translate extends Application {
    private Label resultLabel;
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("sinister");
        button1.setOnAction(event -> {
            resultLabel.setText("lewo");
        });

        Button button2 = new Button("dexter");
        button2.setOnAction(event -> {
            resultLabel.setText("prawo");
        });

        Button button3 = new Button("medium");
        button3.setOnAction(event -> {
            resultLabel.setText("środek");
        });

        resultLabel = new Label();
        HBox hbox = new HBox(10, button1, button2, button3);
        VBox vbox =new VBox(10, hbox, resultLabel);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Tłumaczenie słów łacińskich na polski");
        primaryStage.show();
    }
}
