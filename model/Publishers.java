package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity 
public class Publishers implements Serializable{
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer publiesher_Id;
    private String publisher_Name;
    private String Url;

    public Publishers() {
    }
  
    
    public Integer getPublisher_Id() {
        return publiesher_Id;
    }

    public void setPublisher_Id(Integer publiesher_Id) {
        this.publiesher_Id = publiesher_Id;
    }

    public String getPublisher_Name() {
        return publisher_Name;
    }

    public void setPublisher_Name(String pubiesher_Name) {
        this.publisher_Name = pubiesher_Name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    @Override
    public String toString() {
        return this.getPublisher_Name();
    }
    
    
}
