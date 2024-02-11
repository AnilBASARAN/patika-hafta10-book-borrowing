package dev.patika;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "bookborrowings")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookborrowing_id")
    private int id;

 @Column(name = "bookborrowing_borrower_name")
    private String borrower_name;

 @Column(name = "bookborrowing_return_date")
    private Date return_date;

 @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
 @JoinColumn(name = "bookborrowing_book_id",referencedColumnName ="book_id")
 private Book book;

    public BookBorrowing() {
    }



    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrower_name() {
        return borrower_name;
    }

    public void setBorrower_name(String borrower_name) {
        this.borrower_name = borrower_name;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }
}
