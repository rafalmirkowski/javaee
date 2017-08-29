package pl.java.dao;

/*
import pl.java.model.Book;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

@RequestScoped
public class BookDaoImpl implements BookDao {

    @PersistenceUnit(name = "MyData2")
    private EntityManagerFactory entityManagerFactory ;

    @Override
    public void save(Book book) {
        EntityManager entityManager = entityManagerFactory.createEntityManager() ;
        EntityTransaction entityTransaction = entityManager.getTransaction() ;
        entityTransaction.begin();
        entityManager.persist(book);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public Book get(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Book book = entityManager.find(Book.class, id) ;
        entityManager.close();
        return book ;
    }
}
*/
import pl.java.model.Book;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;



@RequestScoped
public class BookDaoImpl implements BookDao {

    @PersistenceUnit(name = "MyData")
    private EntityManagerFactory emFactory;

    @Override
    public void save(Book book) {
        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(book);
        tx.commit();
        entityManager.close();
    }

    @Override
    public Book get(Long id) {
        EntityManager entityManager = emFactory.createEntityManager();
        Book book = entityManager.find(Book.class, id);
        entityManager.close();
        return book;
    }

    @Override
    public void update(Book book) {
        /*EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction() ;
        entityTransaction.begin();
        entityManager.merge(book) ;
        entityTransaction.commit();
        entityManager.close();*/

        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        Book bookFromDb = entityManager.find(Book.class, book.getId()) ;
        entityTransaction.begin();
        bookFromDb.setAuthor(book.getAuthor());
        bookFromDb.setTitle(book.getTitle());
        bookFromDb.setIsbn(book.getIsbn());
        entityTransaction.commit();
        entityManager.close();
    }


    @Override
    public void remove(Long bookId) {

        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction() ;
        Book bookFromDB = entityManager.find(Book.class, bookId);
        entityTransaction.begin();
        entityManager.remove(bookFromDB);
        entityTransaction.commit();
        entityManager.close();

    }
}