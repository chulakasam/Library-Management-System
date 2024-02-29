package lk.ijse.DAO.Custom.Impl;

import lk.ijse.DAO.Custom.UserDAO;
import lk.ijse.Entity.Book;
import lk.ijse.Entity.User;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean Save(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public User search(String id) {
        return null;
    }
}
