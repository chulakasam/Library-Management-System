package lk.ijse.DAO.Custom.Impl;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.DAO.Custom.PersonDAO;
import lk.ijse.Entity.Book;
import lk.ijse.Entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDAOImpl implements PersonDAO {
    @Override
    public boolean Save(Person person) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

       session.save(person);
        transaction.commit();
        session.close();
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
