package pl.java.dao;

import pl.java.user.User_details;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;





public class UserDetailsDaoImpl implements UserDetailsDao{

    @PersistenceContext
    private EntityManager em ;

    @Override
    public void createDetails(User_details user_details) {
        em.persist(user_details);
    }

    @Override
    public User_details getUserDetails(Long id) {
        return em.find(User_details.class, id);
    }
}
