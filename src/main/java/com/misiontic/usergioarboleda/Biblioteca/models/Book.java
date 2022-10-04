package com.misiontic.usergioarboleda.Biblioteca.models;


import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book implements Serializable {
    //Attributes
    @Id
    private Integer isbn;
    private String title;
    private String registerDate;
    private Integer year;

    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties("books")
    private Editorial editorial_fk;

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name="isbn"),
            inverseJoinColumns = @JoinColumn(name="code")
    )
    private Set<Author> authors;

    // ========== Getters and Setters ========== //
    /**
     *
     * @return
     */
    public Integer getIsbn() {
        return isbn;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     *
     * @param registerDate
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     *
     * @return
     */
    public Integer getYear() {
        return year;
    }

    /**
     *
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     *
     * @return
     */
    public Set<Author> getAuthors() {
        return authors;
    }

    /**
     *
     * @param authors
     */
    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
