package pl.java.daoInterface;

import pl.java.model.Book;
import pl.java.model.Client;
import pl.java.model.User;
import pl.java.model.DetailsUser;

public interface InterfaceDao {

   /* dodajemy usuwamy, update, pobieramy book*/
    void saveBook(Book book) ;
    Book getBook(Long id) ;
    void update(Book book) ;
    void remove(Long bookId);

    /*dodajemy klienta*/
    void saveClient(Client client) ;


    /*dodajemy i pobieramy uzytkownika */
    User getUser (Long id) ;
    void saveUser(User user);

    /*dodajemy detale , pobieramy detale */
    void createDetails(DetailsUser detailsUser_) ;
    DetailsUser getUserDetails(Long id) ;

}
