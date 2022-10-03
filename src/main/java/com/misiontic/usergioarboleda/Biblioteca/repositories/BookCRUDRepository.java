package com.misiontic.usergioarboleda.Biblioteca.repositories;

import com.misiontic.usergioarboleda.Biblioteca.models.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 */
public interface BookCRUDRepository extends CrudRepository<Book, Integer>{

    @Query(value="SELECT * FROM book WHERE year>=? AND year<=?")
    public List<Book> findBooksByDates(int startYear, int endYear);
}
