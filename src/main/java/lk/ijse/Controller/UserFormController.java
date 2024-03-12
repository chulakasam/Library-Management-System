package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.BO.BOFactory.BOFactory;
import lk.ijse.BO.Custom.PersonBO;
import lk.ijse.BO.Custom.UserBO;
import lk.ijse.Entity.Person;

import java.io.IOException;

public class UserFormController {

    public AnchorPane UserRegPanel;
    public TextField txtUserName;
    public TextField txtNIC;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtTel;
    public TextField txtPassword;

    PersonBO personBO = (PersonBO) BOFactory.getBOFactory().getBO(BOFactory.BOType.PERSON);
    public void btnRegisterOnAction(ActionEvent actionEvent) {
        String name = txtUserName.getText();
        String nic = txtNIC.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();
        String password = txtPassword.getText();

        Person person = new Person(name, nic, email, address, tel, password);
        personBO.savePerson(person);
    }

    public void btnSignInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/UserLogIn.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) UserRegPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
