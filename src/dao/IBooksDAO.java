/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.Book;

/**
 *
 * @author admin
 */
public interface IBooksDAO extends GenericDAO<Book> {

    List<Book> getAll();

    void delete(Book book);

    void update(Book book);

    List<Book> sortASC();

    List<Book> sortDESC();
    
    Book findOne(Integer id);
    
    Integer save(Book book);
    
    void updateMinusQuantity(Book book, int quantity);
    
    void updatePlusQuantity(Book book, int quantity);
}
