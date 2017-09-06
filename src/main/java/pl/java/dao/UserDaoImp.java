package pl.java.dao;

import pl.java.user.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager em ;

    @Override
    @Transactional
    public User get(Long id) {
        return em.find(User.class, id) ;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
         em.persist(user);
    }
}
