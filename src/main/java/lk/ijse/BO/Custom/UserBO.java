package lk.ijse.BO.Custom;

import lk.ijse.DAO.SuperDAO;
import lk.ijse.Entity.User;

public interface UserBO extends SuperDAO {
    boolean checkPassword(String username, String password);

    boolean RegisterUser(User user);
}
