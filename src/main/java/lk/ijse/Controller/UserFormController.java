package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserFormController {

    public AnchorPane UserRegPanel;
    public TextField txtUserName;
    public TextField txtNIC;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtTel;
    public TextField txtPassword;

    public void btnRegisterOnAction(ActionEvent actionEvent) {

    }

    public void btnSignInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/UserLogIn.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) UserRegPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
