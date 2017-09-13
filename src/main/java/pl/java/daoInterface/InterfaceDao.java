package pl.java.daoInterface;

import pl.java.model.*;



public interface InterfaceDao {

   /* dodajemy usuwamy, update, pobieramy book*/
    void saveBook(Book book) ;
    Book getBook(Long id) ;
    void updateBook(Book book) ;
    void removeBook(Long bookId);
/*
    *//*dodajemy klienta*//*
    void saveClient(Client client) ;
    *//*pobieramy zamówienie*//*
    Client getClient(Long id) ;

    *//* dodajemy order*//*
    void saveOrder (Order order) ;
    Order getOrder(Long id) ;*/


    /*dodajemy i pobieramy uzytkownika */
    User getUser (Long id) ;
    void saveUser(User user);

    /*dodajemy detale , pobieramy detale */
    void saveDetails(DetailsUser detailsUser_) ;
    DetailsUser getUserDetails(Long id) ;

}
