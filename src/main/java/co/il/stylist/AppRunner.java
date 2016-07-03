package co.il.stylist;

import co.il.stylist.config.HibernateConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by S on 21.06.2016.
 */
public class AppRunner {
    static public void main(String...args){

        System.out.println("------ AppRunner -------");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
        StylistApp stylist=(StylistApp) ctx.getBean(StylistApp.class);

        stylist.checkDB();
    }
}
