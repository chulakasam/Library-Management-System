package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.BO.BOFactory.BOFactory;
import lk.ijse.BO.Custom.BookBO;
import lk.ijse.Entity.Book;

import java.sql.SQLException;

public class BooksFormController {
    public AnchorPane bookPanel;
    public TextField txtId;
    public TextField txtName;
    public TextField txtAuthor;
    public TextField txtGenre;
    public TextField txtStatus;


    BookBO bookBO = (BookBO) BOFactory.getBOFactory().getBO(BOFactory.BOType.BOOK);
    public void btnSaveOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String id = txtId.getText();
        String name = txtName.getText();
        String author = txtAuthor.getText();
        String genre = txtGenre.getText();
        String status = txtStatus.getText();

        Book book = new Book(id, name, author, genre, status);
        bookBO.saveBook(book);

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtName.getText();
        String author = txtAuthor.getText();
        String genre = txtGenre.getText();
        String status = txtStatus.getText();
        Book book = new Book(id, name, author, genre, status);
        bookBO.updateBook(book);
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        bookBO.deleteBook(id);
    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        Book book = bookBO.searchBook(id);
        if(book!=null){
            txtName.setText(book.getTitle());
            txtAuthor.setText(book.getAuthor());
            txtGenre.setText(book.getGenre());
            txtStatus.setText(book.getStatus());
        }else{
            new Alert(Alert.AlertType.ERROR,"Not found!!!").show();
        }

    }
}
