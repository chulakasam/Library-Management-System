package lk.ijse.BO.Custom.Impl;

import lk.ijse.BO.Custom.PersonBO;
import lk.ijse.DAO.Custom.PersonDAO;
import lk.ijse.DAO.Custom.UserDAO;
import lk.ijse.DAO.DAOFactory.DAOFactory;
import lk.ijse.Entity.Person;

public class PersonBOImpl implements PersonBO {
    PersonDAO personDAO= (PersonDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.PERSON);
    @Override
    public boolean savePerson(Person person) {
        Person persons = new Person(person.getUserName(), person.getNic(), person.getEmail(), person.getAddress(), person.getTel(), person.getPassword());
        return personDAO.Save(persons);
    }

    @Override
    public boolean checkPassword(String username, String password) {
        return personDAO.checkPassword(username, password);
    }
}
