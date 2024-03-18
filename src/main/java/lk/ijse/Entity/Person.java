package lk.ijse.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity(name = "person")
public class Person {
    @Id
//    @GeneratedValue(generator = "Person-Id-Generator")
//    @GenericGenerator(name = "Person-Id-Generator", strategy = "lk.ijse.util.PersonIdGenerator")
    private String uId;
    private String userName;
    private String password;
    private String confirmPassword;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<BorrowBooks> borrowedBooks;

    public Person() {
    }

    public Person(String uId, String userName, String password, String confirmPassword, List<BorrowBooks> borrowedBooks) {
        this.uId = uId;
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.borrowedBooks = borrowedBooks;
    }

    public Person(String uId, String userName, String password, String confirmPassword) {
        this.uId = uId;
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public Person(String name, String newPw, String userId) {
        this.userName=name;
        this.password=newPw;
        this.uId=userId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public List<BorrowBooks> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<BorrowBooks> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }


    @Override
    public String toString() {
        return "User{" +
                "uId='" + uId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}