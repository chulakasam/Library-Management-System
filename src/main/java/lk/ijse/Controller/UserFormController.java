package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.BO.BOFactory.BOFactory;
import lk.ijse.BO.Custom.PersonBO;
import lk.ijse.BO.Custom.UserBO;
import lk.ijse.Entity.Person;

import java.io.IOException;
import java.sql.SQLException;

public class UserFormController {

    public AnchorPane UserRegPanel;
    public TextField txtUserName;
    public TextField txtEmail;
    public TextField txtPassword;
    public Label lblUserID;
    public TextField txtConfirmPassword;

    PersonBO personBO = (PersonBO) BOFactory.getBOFactory().getBO(BOFactory.BOType.PERSON);
    public void btnRegisterOnAction(ActionEvent actionEvent) throws SQLException {
        String id = lblUserID.getText();
        String name = txtUserName.getText();
        String password = txtPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();

        Person person = new Person(id,name,password,confirmPassword);
        personBO.savePerson(person);
    }

    public void btnSignInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/UserLogIn.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) UserRegPanel.getScene().getWindow();
        stage.setScene(scene);
    }
    public void  initialize(){
      generateClientId();
    }
    private void generateClientId() {
        String id =personBO.generateClientId();
        lblUserID.setText(id);
    }
}
