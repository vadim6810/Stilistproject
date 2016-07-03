package co.il.stylist.service;

import co.il.stylist.dao.EventDao;
import co.il.stylist.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by S on 01.07.2016.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EventServicesImpl implements EventServices{

    @Autowired
    EventDao eventDao;

    public Event getByKey(Long key) {
        return eventDao.getByKey(key);
    }

    public void persist(Event entity) {
        eventDao.persist(entity);
    }

    public void delete(Event entity) {
        eventDao.delete(entity);
    }

    public List<Event> list() {
        return eventDao.list();
    }
}
