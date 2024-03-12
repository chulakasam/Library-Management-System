package lk.ijse.DAO;

import lk.ijse.Entity.Book;

public interface CrudDAO<T> extends SuperDAO {
    boolean Save(T type);
    boolean update(T type);

    boolean delete(String id);

    T search(String id);

}
