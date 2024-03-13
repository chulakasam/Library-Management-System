package lk.ijse.BO.Custom;

import lk.ijse.DAO.SuperDAO;
import lk.ijse.Entity.Person;

public interface PersonBO extends SuperDAO {
    boolean savePerson(Person person);

    boolean checkPassword(String username, String password);

    String generateClientId();
}
