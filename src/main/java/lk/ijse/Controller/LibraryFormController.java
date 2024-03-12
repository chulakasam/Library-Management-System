package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.BO.BOFactory.BOFactory;
import lk.ijse.BO.Custom.BookBO;
import lk.ijse.BO.Custom.LibraryBO;
import lk.ijse.Entity.Library;

public class LibraryFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtTel;


    LibraryBO libraryBO = (LibraryBO) BOFactory.getBOFactory().getBO(BOFactory.BOType.LIBRARY);
    public void btnAddOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();

        Library library = new Library(id,name,address,tel);
        libraryBO.saveLibrary(library);
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();

        Library library = new Library(id,name,address,tel);
        libraryBO.updateLibrary(library);
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        libraryBO.deleteLibrary(id);
    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        Library library=libraryBO.searchLibrary(id);
        if (library!=null){
            txtName.setText(library.getName());
            txtAddress.setText(library.getAddress());
            txtTel.setText(library.getTel());
        }else{
            new Alert(Alert.AlertType.ERROR,"Not Found!!!").show();
        }
    }
}
