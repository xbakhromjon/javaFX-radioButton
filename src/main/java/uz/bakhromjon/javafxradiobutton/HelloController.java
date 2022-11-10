package uz.bakhromjon.javafxradiobutton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {

    @FXML
    private Label label;
    @FXML
    private RadioButton rButton1;
    @FXML
    private RadioButton rButton2;
    @FXML
    private RadioButton rButton3;

    public void displayFood(ActionEvent event) {
        if (rButton1.isSelected()) {
            label.setText(rButton1.getText());
        } else if (rButton2.isSelected()) {
            label.setText(rButton2.getText());
        }  else if (rButton3.isSelected()) {
            label.setText(rButton3.getText());
        }
    }
}