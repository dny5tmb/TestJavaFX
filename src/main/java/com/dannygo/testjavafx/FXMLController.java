package com.dannygo.testjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.Window;

public class FXMLController implements Initializable {
    @FXML
    private Label label;
    private int counter;
    @FXML
    private Toggle tglAsa;
    @FXML
    private Toggle tglHiru;
    @FXML
    private Toggle tglYoru;
    @FXML
    private Toggle tglJapanese;
    @FXML
    private Toggle tglEnglish;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        System.out.println("はろーわーるど。counter:" + counter++);
        String msg = "";
        if (tglAsa.isSelected()) {
            msg = (tglJapanese.isSelected() ? "おはよう！" : "Good Morning!");
        } else if (tglHiru.isSelected()) {
            msg = (tglJapanese.isSelected() ? "こんにちわ！" : "Hello!");
        } else if (tglYoru.isSelected()) {
            msg = (tglJapanese.isSelected() ? "こんばんわ！" : "Good Night!");
        }
        label.setText(msg);
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
        Effect shadow = new DropShadow(4, 2, 2, Color.GRAY);
        label.setEffect(shadow);
    }

}
