package com.misiontic.usergioarboleda.Biblioteca.services;

import com.misiontic.usergioarboleda.Biblioteca.models.Editorial;
import com.misiontic.usergioarboleda.Biblioteca.repositories.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditorialService {
    @Autowired
    private EditorialRepository editorialRepository;

    public List<Editorial> getAll() {
        return editorialRepository.getAll();
    }

    public Optional<Editorial> getEditorial(int id) {
        return editorialRepository.getEditorial(id);
    }

    public Editorial save(){

    }

    public Editorial update(){

    }

    public void delete(){

    }
}