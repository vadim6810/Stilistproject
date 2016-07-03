package co.il.stylist.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;

/**
 * Created by S on 21.06.2016.
 */


@Entity
@Table(name = "PORTFOLIO")
public class Portfolio implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;
    private String desctiption;

    @ManyToOne
    @JoinColumn(name = "stylist_id")
    private Stylist stylist;



    // ------------------Getters&Setters------------------


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public Stylist getStylist() {
        return stylist;
    }

    public void setStylist(Stylist stylist) {
        this.stylist = stylist;
    }
}
