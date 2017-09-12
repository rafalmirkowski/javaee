package pl.java.implementationDao;

import pl.java.model.Book;
import pl.java.model.Client;
import pl.java.daoInterface.InterfaceDao;
import pl.java.model.User;
import pl.java.model.DetailsUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class ImplemDao implements InterfaceDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void saveBook(Book book) {
        em.persist(book);
    }

    @Override
    public Book getBook(Long id) {
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
        Book objToRemove = em.find(Book.class, bookId);
        em.remove(objToRemove);
    }
    @Override
    @Transactional
    public void saveClient(Client client) { em.persist(client); }

    @Override
    @Transactional
    public User getUser(Long id) {
        return em.find(User.class, id) ;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    @Transactional
    public void createDetails(DetailsUser detailsUser_) {
        em.persist(detailsUser_);
    }

    @Override
    @Transactional
    public DetailsUser getUserDetails(Long id) {
        return em.find(DetailsUser.class, id);
    }
}
