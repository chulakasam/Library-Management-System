package lk.ijse.Controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BookBorrowController {
    public JFXComboBox cmbUserId;
    public JFXComboBox cmbBranchID;
    public JFXComboBox cmbISBN;
    public Label lblBookTitle;
    public Label lblDate;
    public AnchorPane borrowBookPanel;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/UserLogIn.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) borrowBookPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
