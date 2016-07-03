package co.il.stylist.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by S on 21.06.2016.
 */

@Entity
@DiscriminatorValue("STYLIST")
public class Stylist extends User implements Serializable {


    private String description;

    @OneToMany(mappedBy="stylist")
    List<Portfolio> portfolio=new Vector<Portfolio>();

    public Stylist(){

    }


    // ------------------Getters&Setters------------------

    public List<Portfolio> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(List<Portfolio> portfolio) {
        this.portfolio = portfolio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
