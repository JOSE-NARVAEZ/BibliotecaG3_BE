package com.misiontic.usergioarboleda.Biblioteca.controllers;

import com.misiontic.usergioarboleda.Biblioteca.models.Editorial;
import com.misiontic.usergioarboleda.Biblioteca.services.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/editorial")
public class EditorialController {
    @Autowired
    private EditorialService editorialService;

    @GetMapping("/all")
    public List<Editorial> getAllEditorials(){
        return editorialService.getAllEditoriales();
    }

    @GetMapping("/{id}")
    public Optional<Editorial> getEditorial(@PathVariable("{id}") int id){
        return editorialService.getEditorial(id);
    }

    @PostMapping("/insert")
    public Editorial insertEditorial(@RequestBody Editorial editorial){
        return editorialService.insertEditorial(editorial);
    }

    @PutMapping("/update")
    public Editorial updateEditorial(@RequestBody Editorial editorial){
        return editorialService.updateEditorial(editorial);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteEditorial(@PathVariable("id") int id){
        return editorialService.deleteEditorial(id);
    }
}
