package dev.patika;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.ArrayList;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Bookborrow");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        // create Author
        Author author1 = new Author();
        author1.setBirthdate(1947);
        author1.setCountry("America");
        author1.setName("Stephen King");
        entityManager.persist(author1);


        //create publisher
        Publisher publisher1 = new Publisher();
        publisher1.setAdress("California");
        publisher1.setName("Viking Press");
        publisher1.setEstablishment_year(1940);
        entityManager.persist(publisher1);

        // create Category

        Category categoryHorror = new Category();
        categoryHorror.setDescription("A lovely Saint Bernard dog got bitten by a bat and turned into a raging killer canine");
        categoryHorror.setName("Horrow");
        entityManager.persist(categoryHorror);

        // creating a category list
        ArrayList<Category> categoryArrayList = new ArrayList<>();
        categoryArrayList.add(categoryHorror);


        //create book
        Book book1 = new Book();
        book1.setName("Kujo");
        book1.setStock(2);
        book1.setPublisher(publisher1);
        book1.setPublishing_year(1950);
        book1.setAuthor(author1);
        book1.setCategoryList(categoryArrayList);
        entityManager.persist(book1);

        // create a book borrowing
        //ekliyorum
        BookBorrowing bookBorrowing1 = new BookBorrowing();
        bookBorrowing1.setBook(book1);
        bookBorrowing1.setBorrower_name("Anil");
        entityManager.persist(bookBorrowing1);



        transaction.commit();
    }
}
