package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstFormController {
    public AnchorPane firstPanel;

    public void btnAdminLogInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/LogIn-Form.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) firstPanel.getScene().getWindow();
        stage.setScene(scene);
    }

    public void btnUserLogInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/UserLogIn.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) firstPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
