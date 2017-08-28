package pl.java.dao;

import pl.java.model.Book;

public interface BookDao {

     public void save(Book book) ;
     public Book get(Long id) ;

}
