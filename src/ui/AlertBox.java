package ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    private Label label;
    private Stage stage;
    private Button closeButton;

    public AlertBox(){
        this.label = new Label();
        label.setTextAlignment(TextAlignment.CENTER);
        this.stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setMinWidth(400);
        closeButton = new Button("Close");
        closeButton.setOnAction(e -> stage.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(15, 50, 10, 50));

        Scene scene = new Scene(layout);
        stage.setScene(scene);
    }
    public void display(String title, String message){

        stage.setTitle(title);

        label.setText(message);

        stage.show();

    }

    public void change(String title, String message){
        stage.close();
        stage.setTitle(title);
        label.setText(message);
        closeButton.setText("Next");
        stage.showAndWait();
    }

}
