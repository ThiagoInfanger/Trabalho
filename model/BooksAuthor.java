package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BooksAuthor implements Serializable{
    @Id
    @Column(unique=true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String isbn;
    private Integer author_id;
    private Integer seq_no;
    
    @ManyToOne
    @JoinColumn(name="authors")
    private Authors authors;
    
    
    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getSeq_no() {
        return seq_no;
    }

    public void setSeq_no(Integer seq_no) {
        this.seq_no = seq_no;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public BooksAuthor() {
    }
    
    @Override
    public String toString() {
        return this.getSeq_no().toString();
    }
}
