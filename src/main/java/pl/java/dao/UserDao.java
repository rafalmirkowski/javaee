package pl.java.dao;

import pl.java.user.User;

public interface UserDao {

    User get (Long id) ;
    void saveUser(User user);


}
