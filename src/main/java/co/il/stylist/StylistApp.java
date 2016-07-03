package co.il.stylist;

import co.il.stylist.model.BodyPart;
import co.il.stylist.model.Client;
import co.il.stylist.model.ClothesUnit;
import co.il.stylist.model.Event;
import co.il.stylist.service.*;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by S on 21.06.2016.
 */


@Component
public class StylistApp implements ApplicationContextAware {

    ApplicationContext appContext;

    @Autowired
    ClientServices clientServices;

    @Autowired
    EventServices eventServices;

    @Autowired
    BodyPartServices bodyPartServices;

    @Autowired
    ClothesUnitServices clothesUnitServices;


//    @Autowired
//    CommonServices<Integer, Client> commonServices;


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appContext = applicationContext;
    }

    public void checkDB() {

        System.out.println("--------------------------------------------");

        Long checkId=new Long(1);

        Client clientsList = clientServices.getByKey(new Long(1));
        System.out.println("Client.name=" + clientsList.getName());

        Event event=eventServices.getByKey(new Long(1));
        System.out.println("Event.name=" + event.getName());


        BodyPart bodyPart=bodyPartServices.getByKey(new Long(1));
        System.out.println("BodyPart.name=" + bodyPart.getName());

        ClothesUnit clothesUnit=clothesUnitServices.getByKey(new Long(1));
        System.out.println("ClothesUnit.name=" + clothesUnit.getName());
    }
}
