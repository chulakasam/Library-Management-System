package lk.ijse.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lk.ijse.DTO.TM.BookTM;

import java.sql.SQLException;
import java.util.List;

public class ViewBooks {
    public TableView<BookTM> tblBooks;
    public TableColumn<?,?> colISBN;
    public TableColumn<?,?> colTitle;
    public TableColumn<?,?> colAuthor;
    public TableColumn<?,?> colGenre;
    public TableColumn<?,?> colQty;
    public TableColumn<?,?> colLibaryID;
    public TableColumn<?,?> colLocation;

    public void initialize(){

    }
    public void setCellValueFactory(){

    }


}
