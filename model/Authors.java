package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authors implements Serializable {
    @Id
    @Column(unique=true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Integer author_id;
    private String name;
    private String fname;

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    

    public Authors() {
    }
    
    
    @Override
    public String toString() {
        return this.getName();
        }

    
    
}
