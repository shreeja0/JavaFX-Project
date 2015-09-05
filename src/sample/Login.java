package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Login {
    public TextField LoginField;

    public Label messageLabel;

    public void onSignIn(ActionEvent actionEvent) {
        if (LoginField.getText().isEmpty()){
            messageLabel.setText("login is missing");
        }
        else
            messageLabel.setText("");
    }
}
