package com.dannygo.testjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;

public class FXMLController implements Initializable {
    @FXML
    private Label label;
    private int counter;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        System.out.println("はろーわーるど。counter:" + counter++);
        label.setText("Hello World!");
    }

    @FXML
    private void handleButtonNewWindow(ActionEvent event) {
        System.out.println("新しいボタンを押したよ！");
        Stage newStage = new Stage();
        Window window = label.getScene().getWindow();
        newStage.initOwner(window);
        newStage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
