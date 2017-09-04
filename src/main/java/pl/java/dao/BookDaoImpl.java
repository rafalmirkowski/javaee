package pl.java.dao;

import pl.java.model.Book;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Default
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(Book book) {
        em.persist(book);
    }

    @Override
    public Book get(Long id) {
        return em.find(Book.class, id);
    }

    @Override
    @Transactional
    public void update(Book book) {
        em.merge(book);
    }

    @Override
    @Transactional
    public void remove(Long bookId) {
        Book objToRemove = em.find(Book.class, bookId) ;
        em.remove(objToRemove);

    }


}