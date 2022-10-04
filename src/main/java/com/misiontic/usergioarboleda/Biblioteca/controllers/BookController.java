package com.misiontic.usergioarboleda.Biblioteca.controllers;

import com.misiontic.usergioarboleda.Biblioteca.models.Book;
import com.misiontic.usergioarboleda.Biblioteca.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/all/{start}/{end}")
    public List<Book> getAllBooksByDate(@PathVariable("start") int start, @PathVariable("end") int end){
        return bookService.getALlBooksByDates(start, end);
    }

    @GetMapping("/{isbn}")
    public Optional<Book> getBook(@PathVariable("isbn") int isbn){
        return bookService.getBook(isbn);
    }

    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.CREATED)
    public Book insertBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/delete/{isbn}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteBook(@PathVariable("isbn") int isbn){
        return bookService.deleteBook(isbn);
    }
}