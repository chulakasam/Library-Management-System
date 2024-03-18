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
import lk.ijse.BO.Custom.BookBO;
import lk.ijse.BO.Custom.PersonBO;
import lk.ijse.Entity.Person;

import java.io.IOException;

public class ChangePasswordController {
    public AnchorPane settingPanel;
    public TextField txtSearchID;
    public TextField txtNewPassword;

    public Label lblUserId;
    public Label txtname;
    public Label txttel;
    public Label txtemail;
    public Label txtaddress;
    public TextField txtconfirmPw;
    PersonBO personBO = (PersonBO) BOFactory.getBOFactory().getBO(BOFactory.BOType.PERSON);
   public void btnSearchPersonOnAction(ActionEvent actionEvent) {
        String searchId = txtSearchID.getText();
        Person person=personBO.searchPerson(searchId);
       if(person!=null){
           lblUserId.setText(person.getuId());
           txtname.setText(person.getUserName());
       }else{
            new Alert(Alert.AlertType.ERROR,"Not found!!!").show();
        }
    }

    public void btnChangePasswordOnAction(ActionEvent actionEvent) {

        String id = txtSearchID.getText();
        String name = txtname.getText();

//        String tel = txttel.getText();
//        String email = txtemail.getText();
//        String address = txtaddress.getText();
         String newPw = txtNewPassword.getText();
         String userId = lblUserId.getText();

       Person person = new Person(name,newPw,userId);
       personBO.changePassword(person);
   }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/First-form.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) settingPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
