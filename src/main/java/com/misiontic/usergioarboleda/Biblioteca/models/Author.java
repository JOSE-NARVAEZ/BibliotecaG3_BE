package com.misiontic.usergioarboleda.Biblioteca.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name="author")
public class Author implements Serializable {
    //Attributes
    @Id
    private Integer code;
    private String name;
    private String lastname;

    @ManyToMany(mappedBy="authors")
    private Set<Book> books;

    /**
     * Constructor of the class
     * @param code
     * @param name
     * @param lastname
     */
    public Author(Integer code, String name, String lastname){
        this.code     = code;
        this.name     = name;
        this.lastname = lastname;
    }


    // ========== Getters and Setters ========== //
    /**
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }


    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     *
     * @return
     */
    public Set<Book> getBooks() {
        return books;
    }

    /**
     *
     * @param books
     */
    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
