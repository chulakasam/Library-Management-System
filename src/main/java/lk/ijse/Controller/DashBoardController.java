package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController {
    public AnchorPane MainPanel;

    public void btnManageBooksOnAction(ActionEvent actionEvent) {
    }

    public void btnManagePersonsOnAction(ActionEvent actionEvent) {
    }

    public void btnManageLibraiesOnAction(ActionEvent actionEvent) {
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/LogIn-Form.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) MainPanel.getScene().getWindow();
        stage.setScene(scene);
    }
}
