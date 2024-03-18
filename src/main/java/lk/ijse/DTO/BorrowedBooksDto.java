package lk.ijse.DTO;

import lk.ijse.Entity.Book;
import lk.ijse.Entity.Person;


import java.time.LocalDateTime;

public class BorrowedBooksDto {
    private String gId;
    private LocalDateTime borrowedDate;
    private LocalDateTime returnDate;
    private Book bookId;
    private Person uId;

    public BorrowedBooksDto() {
    }

    public BorrowedBooksDto(String gId, LocalDateTime borrowedDate, LocalDateTime returnDate, Book bookId, Person uId) {
        this.gId = gId;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
        this.bookId = bookId;
        this.uId = uId;
    }

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    public LocalDateTime getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDateTime borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public Person getuId() {
        return uId;
    }

    public void setuId(Person uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "BorrowedBooksDto{" +
                "gId='" + gId + '\'' +
                ", borrowedDate=" + borrowedDate +
                ", returnDate=" + returnDate +
                ", bookId=" + bookId +
                ", uId=" + uId +
                '}';
    }
}
