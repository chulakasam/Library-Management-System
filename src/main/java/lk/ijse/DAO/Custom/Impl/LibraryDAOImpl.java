package lk.ijse.DAO.Custom.Impl;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.DAO.Custom.LibraryDAO;
import lk.ijse.Entity.Book;
import lk.ijse.Entity.Library;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LibraryDAOImpl implements LibraryDAO {
    @Override
    public boolean Save(Library library) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(library);
        transaction.commit();
        session.close();
        return false;
    }

    @Override
    public boolean update(Library library) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.update(library);
        transaction.commit();
        session.close();
        return false;
    }

    @Override
    public boolean delete(String id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Library library = new Library(id);
        session.delete(library);
        transaction.commit();
        session.close();
        return false;
    }

    @Override
    public Library search(String id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Library library = session.get(Library.class, id);
        transaction.commit();
        session.close();

        return library;
    }
}
