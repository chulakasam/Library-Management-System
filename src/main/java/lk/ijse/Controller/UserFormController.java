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
    public TextField txtNIC;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtTel;
    public TextField txtPassword;
    public Label lblUserID;

    PersonBO personBO = (PersonBO) BOFactory.getBOFactory().getBO(BOFactory.BOType.PERSON);
    public void btnRegisterOnAction(ActionEvent actionEvent) {
        String name = txtUserName.getText();
        String nic = txtNIC.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();
        String password = txtPassword.getText();
        String id = lblUserID.getText();

        Person person = new Person(name, nic, email, address, tel, password,id);
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
