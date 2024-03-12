package lk.ijse.BO.Custom.Impl;

import lk.ijse.BO.Custom.UserBO;
import lk.ijse.DAO.Custom.BookDAO;
import lk.ijse.DAO.Custom.UserDAO;
import lk.ijse.DAO.DAOFactory.DAOFactory;
import lk.ijse.Entity.User;

public class UserBOImpl implements UserBO {

    UserDAO userDAO= (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.USER);
    @Override
    public boolean checkPassword(String username, String password) {
        return userDAO.checkPassword(username, password);
    }

    @Override
    public boolean RegisterUser(User user) {
        User users = new User(user.getUsername(),user.getEmail(), user.getPassword(), user.getConfirmPassword());
        return userDAO.Save(users);
    }
}
