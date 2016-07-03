package co.il.stylist.service;

import co.il.stylist.dao.BodyPartDao;
import co.il.stylist.dao.CommonDao;
import co.il.stylist.dao.EventDao;
import co.il.stylist.model.BodyPart;
import co.il.stylist.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by S on 01.07.2016.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BodyPartServicesImpl implements BodyPartServices{

    @Autowired
    BodyPartDao bodyPartDao;

    public BodyPart getByKey(Long key) {
        return bodyPartDao.getByKey(key);
    }

    public void persist(BodyPart entity) {
        bodyPartDao.persist(entity);
    }

    public void delete(BodyPart entity) {
        bodyPartDao.delete(entity);
    }

    public List<BodyPart> list() {
        return bodyPartDao.list();
    }
}
