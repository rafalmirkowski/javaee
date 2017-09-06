package pl.java.dao;

import pl.java.user.User_details;

public interface UserDetailsDao {

    void createDetails(User_details user_details) ;
    User_details getUserDetails(Long id) ;



}
