package lk.ijse.DAO.Custom.Impl;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.DAO.Custom.UserDAO;
import lk.ijse.Entity.Book;
import lk.ijse.Entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean Save(User user) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();

        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User exists(String title) {
        return null;
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
    public String getCount() {
        return null;
    }

    @Override
    public User search(String id) {
        return null;
    }

    @Override
    public boolean checkPassword(String username, String password) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        NativeQuery<String> nativeQuery = session.createNativeQuery("SELECT password FROM user WHERE userName = :username");
        nativeQuery.setParameter("username",username);

        String pass = nativeQuery.uniqueResult();

        transaction.commit();
        session.close();

        if (password.equalsIgnoreCase(pass)) {
            return true;
        }else {
            return false;
        }
    }
}
