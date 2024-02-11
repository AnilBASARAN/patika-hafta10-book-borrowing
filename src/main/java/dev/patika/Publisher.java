package dev.patika;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publishers")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private int id;

    @Column(name = "publisher_name")
    private String name;

    @Column(name = "publisher_establishment_year")
    private int establishment_year;

    @Column(name = "publisher_adress")
    private String adress;

    @OneToMany(mappedBy = "publisher")
    List<Book>bookList;

    public Publisher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstablishment_year() {
        return establishment_year;
    }

    public void setEstablishment_year(int establishment_year) {
        this.establishment_year = establishment_year;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
