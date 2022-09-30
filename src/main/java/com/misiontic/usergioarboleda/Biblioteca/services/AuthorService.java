package com.misiontic.usergioarboleda.Biblioteca.services;

import com.misiontic.usergioarboleda.Biblioteca.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
}
