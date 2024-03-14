package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.BO.BOFactory.BOFactory;
import lk.ijse.BO.Custom.PersonBO;
import lk.ijse.BO.Custom.UserBO;

import java.io.IOException;

public class UserLogInController {

    public AnchorPane userLogInPanel;
    public TextField txtUserName;
    public TextField txtPassword;

    PersonBO personBO = (PersonBO) BOFactory.getBOFactory().getBO(BOFactory.BOType.PERSON);
    public void btnLogInOnAction(ActionEvent actionEvent) throws IOException {
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        boolean login = personBO.checkPassword(username, password);
        if(username.isEmpty() || password.isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Empty").show();
            return;
        }
        if (login) {

            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/Book-borrow-Form.fxml"));
            Scene scene = new Scene(anchorPane);
            Stage stage = (Stage) userLogInPanel.getScene().getWindow();
            stage.setScene(scene);

//            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/navigation_form.fxml"));
//            Scene scene =new Scene(rootNode);
//            Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();
//            primaryStage.setScene(scene);
//            primaryStage.setTitle("BookWorm");
            new Alert(Alert.AlertType.CONFIRMATION, "Logged in Successfully");
        } else {
            new Alert(Alert.AlertType.ERROR, "oops! credentials are incorrect!").show();
        }


















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

    public void btnForgotPasswordOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/Change-passwordForm.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) userLogInPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
