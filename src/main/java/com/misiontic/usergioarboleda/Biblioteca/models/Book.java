package com.misiontic.usergioarboleda.Biblioteca.models;


import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

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

    /**
     *
     * @param isbn
     * @param title
     * @param registerDate
     * @param year
     * @param editorial_fk
     */
    public Book(Integer isbn, String title, String registerDate, Integer year, Editorial editorial_fk) {
        this.isbn         = isbn;
        this.title        = title;
        this.registerDate = registerDate;
        this.year         = year;
        this.editorial_fk = editorial_fk;
    }


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
