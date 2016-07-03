package co.il.stylist.model;


import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Vector;

@Entity
@DiscriminatorValue("CLIENT")
public class Client extends User{

  private Integer age;
  @Enumerated(EnumType.ORDINAL)

  private Gender gender;

  @Lob @Basic (fetch=FetchType.LAZY)
  byte[] image;

  @OneToMany(fetch = FetchType.EAGER)
  List<Wardrobe> wardrobesList= new Vector<Wardrobe>();

  @Transient
  Stylist currentStylist;
  @Transient
  Event currentEvent;


  public Client(){

  }

  // ------------------Getters&Setters------------------

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Stylist getCurrentStylist() {
    return currentStylist;
  }

  public void setCurrentStylist(Stylist currentStylist) {
    this.currentStylist = currentStylist;
  }

  public List<Wardrobe> getWardrobesList() {
    return wardrobesList;
  }

  public void setWardrobesList(List<Wardrobe> wardrobesList) {
    this.wardrobesList = wardrobesList;
  }

  public Event getCurrentEvent() {
    return currentEvent;
  }

  public void setCurrentEvent(Event currentEvent) {
    this.currentEvent = currentEvent;
  }

  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }
}
