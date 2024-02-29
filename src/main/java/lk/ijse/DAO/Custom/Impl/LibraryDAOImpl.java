package lk.ijse.DAO.Custom.Impl;

import lk.ijse.DAO.Custom.LibraryDAO;
import lk.ijse.Entity.Book;
import lk.ijse.Entity.Library;

public class LibraryDAOImpl implements LibraryDAO {
    @Override
    public boolean Save(Library library) {
        return false;
    }

    @Override
    public boolean update(Library library) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Library search(String id) {
        return null;
    }
}
