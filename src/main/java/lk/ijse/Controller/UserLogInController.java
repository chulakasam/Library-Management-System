package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserLogInController {

    public AnchorPane userLogInPanel;

    public void btnLogInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/Book-borrow-Form.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) userLogInPanel.getScene().getWindow();
        stage.setScene(scene);
    }

    public void btnSignUpOnAction(ActionEvent actionEvent) throws IOException {

        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/User-Form.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) userLogInPanel.getScene().getWindow();
        stage.setScene(scene);
    }

    public void btnExitOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/First-form.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) userLogInPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
