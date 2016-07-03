package co.il.stylist.model;

import org.hibernate.annotations.*;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by S on 21.06.2016.
 */

@Entity
@Table(name = "WARDROBE")
public class Wardrobe implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    private String name;

/*

    @GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="user"))
    private Integer user_id;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

*/

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy="wardrobe")
    private List<ClothesUnit> clothesUnitList=new Vector<ClothesUnit>();


    // ------------------Getters&Setters------------------


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ClothesUnit> getClothesUnitList() {
        return clothesUnitList;
    }

    public void setClothesUnitList(List<ClothesUnit> clothesUnitList) {
        this.clothesUnitList = clothesUnitList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
