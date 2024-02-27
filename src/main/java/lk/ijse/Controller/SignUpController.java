package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {
    public AnchorPane SignInPanel;

    public void btnRegisterOnAction(ActionEvent actionEvent) {
    }

    public void btnSignInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/LogIn-Form.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) SignInPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
