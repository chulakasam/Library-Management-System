package lk.ijse.DAO.DAOFactory;

import lk.ijse.DAO.Custom.Impl.BookDAOImpl;
import lk.ijse.DAO.Custom.Impl.LibraryDAOImpl;
import lk.ijse.DAO.Custom.Impl.PersonDAOImpl;
import lk.ijse.DAO.Custom.Impl.UserDAOImpl;
import lk.ijse.DAO.SuperDAO;

public class DAOFactory {

    public static DAOFactory daoFactory;
    private DAOFactory(){
    }
    public static DAOFactory getDaoFactory(){
        return (daoFactory==null)?daoFactory=new DAOFactory():daoFactory;
    }
    public enum DAOType{
        BOOK,PERSON,USER,LIBRARY;
    }
    public SuperDAO getDAO(DAOType daoType) {
        switch (daoType) {
            case BOOK:
                return  new BookDAOImpl();
            case PERSON:
                return new PersonDAOImpl();
            case USER:
                return new UserDAOImpl();
            case LIBRARY:
                return new LibraryDAOImpl();
            default:
                return null;
        }

    }

}
