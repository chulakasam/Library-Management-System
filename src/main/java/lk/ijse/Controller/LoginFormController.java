package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane loginPanel;

    public void btnLogInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/DashBoard-Form.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) loginPanel.getScene().getWindow();
        stage.setScene(scene);

    }

    public void btnSignInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/SignUp-Form.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) loginPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
