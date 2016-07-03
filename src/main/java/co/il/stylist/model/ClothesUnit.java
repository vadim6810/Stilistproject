package co.il.stylist.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by S on 21.06.2016.
 */


@Entity
@Table(name = "CLOTHESUNIT")
public class ClothesUnit implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    String name;

    @Lob @Basic (fetch=FetchType.LAZY)
    byte[] image;

    @OneToOne
    @PrimaryKeyJoinColumn
    ClothesType clothesType;

    @ManyToOne
    @JoinColumn(name = "wardrobe_id")
    Wardrobe wardrobe;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "clothesunit_props",joinColumns = {
            @JoinColumn(name = "clothesunit_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "clothespropvalue_id",
                    nullable = false, updatable = false) })
    Set<ClothesPropValue> properties=new HashSet<ClothesPropValue>();

    // ------------------Getters&Setters------------------


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public ClothesType getClothesType() {
        return clothesType;
    }

    public void setClothesType(ClothesType clothesType) {
        this.clothesType = clothesType;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public Set<ClothesPropValue> getProperties() {
        return properties;
    }

    public void setProperties(Set<ClothesPropValue> properties) {
        this.properties = properties;
    }
}
