package com.misiontic.usergioarboleda.Biblioteca.controllers;

import com.misiontic.usergioarboleda.Biblioteca.models.Author;
import com.misiontic.usergioarboleda.Biblioteca.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/all")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @GetMapping("/{code}")
    public Optional<Author> getAuthor(@PathVariable("code") int code){
        return authorService.getAuthor(code);
    }

    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.CREATED)
    public Author insertAuthor(@RequestBody Author author){
        return authorService.insertAuthor(author);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Author updateAuthor(@RequestBody Author author){
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/delete/{code}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteAuthor(@PathVariable("code") int code){
        return authorService.deleteAuthor(code);
    }
}
