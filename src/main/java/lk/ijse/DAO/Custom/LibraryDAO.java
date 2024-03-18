package lk.ijse.DAO.Custom;

import lk.ijse.DAO.CrudDAO;
import lk.ijse.Entity.Library;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDAO extends CrudDAO<Library> {
    Library search(String Id);
    boolean del(String Id) throws SQLException;
}
