package lk.ijse.BO.BOFactory;

import lk.ijse.BO.Custom.Impl.BookBOImpl;
import lk.ijse.BO.Custom.Impl.LibraryBOImpl;
import lk.ijse.BO.Custom.Impl.PersonBOImpl;
import lk.ijse.BO.Custom.Impl.UserBOImpl;
import lk.ijse.DAO.SuperDAO;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getBOFactory() {
        return boFactory == null ? boFactory = new BOFactory() : boFactory;
    }

    public void getBO() {

    }

    public enum BOType {
        BOOK,USER,PERSON,LIBRARY;

    }

    public SuperDAO getBO(BOType boType) {
        switch (boType) {
                case BOOK:
                   return  new BookBOImpl();
                case USER:
                   return  new UserBOImpl();
                case PERSON:
                    return new PersonBOImpl();
                case LIBRARY:
                   return new LibraryBOImpl();
                default:
                    return null;
        }
    }
}
