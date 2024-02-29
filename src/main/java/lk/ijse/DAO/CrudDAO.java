package lk.ijse.DAO;

import lk.ijse.Entity.Book;

public interface CrudDAO<T> extends SuperDAO {
    boolean Save(T book);
    boolean update(T book);

    boolean delete(String id);

    Book search(String id);

}
