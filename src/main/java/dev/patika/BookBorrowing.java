package dev.patika;

import jakarta.persistence.*;

import java.time.LocalDate;

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
    private LocalDate return_date;

 @Column(name = "bookborrowing_borrowing_date")
 private LocalDate borrowing_date;

 @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
 @JoinColumn(name = "bookborrowing_book_id",referencedColumnName ="book_id")
 private Book book;

    public BookBorrowing() {
    }

    public LocalDate getBorrowing_date() {
        return borrowing_date;
    }

    public void setBorrowing_date(LocalDate borrowing_date) {
        this.borrowing_date = borrowing_date;
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

    public LocalDate getReturn_date() {
        return return_date;
    }

    public void setReturn_date(LocalDate return_date) {
        this.return_date = return_date;
    }
}
