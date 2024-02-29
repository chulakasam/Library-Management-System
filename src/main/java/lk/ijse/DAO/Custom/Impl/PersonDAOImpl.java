package lk.ijse.DAO.Custom.Impl;

import lk.ijse.DAO.Custom.PersonDAO;
import lk.ijse.Entity.Book;
import lk.ijse.Entity.Person;

public class PersonDAOImpl implements PersonDAO {
    @Override
    public boolean Save(Person person) {
        return false;
    }

    @Override
    public boolean update(Person person) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Person search(String id) {
        return null;
    }
}
