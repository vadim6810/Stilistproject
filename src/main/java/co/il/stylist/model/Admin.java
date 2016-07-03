package co.il.stylist.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Vector;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends User implements Serializable{

  @OneToMany
  List<Wardrobe> wardrobesList= new Vector<Wardrobe>();

  public Admin(){

  }

  // ------------------Getters&Setters------------------


  public List<Wardrobe> getWardrobesList() {
    return wardrobesList;
  }

  public void setWardrobesList(List<Wardrobe> wardrobesList) {
    this.wardrobesList = wardrobesList;
  }

}
