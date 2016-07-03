package co.il.stylist.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by S on 21.06.2016.
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "clothestype")
abstract class ClothesType implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    private Gender gender;

    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "clothestype_bodypart",joinColumns = {
            @JoinColumn(name = "clothestype_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "bodypart_id",
                    nullable = false, updatable = false) })
    Set<BodyPart> coveredBodyParts =new HashSet<BodyPart>();




    // ------------------Getters&Setters------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BodyPart> getCoveredBodyParts() {
        return coveredBodyParts;
    }

    public void setCoveredBodyParts(Set<BodyPart> coveredBodyParts) {
        this.coveredBodyParts = coveredBodyParts;
    }
}
