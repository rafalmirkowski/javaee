package pl.java.dao;

import pl.java.model.Book;

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
}