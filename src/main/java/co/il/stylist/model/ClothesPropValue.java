package co.il.stylist.model;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by S on 21.06.2016.
 */

@Entity
@Table(name = "CLOTHESPROPVALUE")
public class ClothesPropValue implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "clothesprop_id")
    private ClothesProperty clothesProperty;

    private String value;

    // ------------------Getters&Setters------------------


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClothesProperty getClothesProperty() {
        return clothesProperty;
    }

    public void setClothesProperty(ClothesProperty clothesProperty) {
        this.clothesProperty = clothesProperty;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
