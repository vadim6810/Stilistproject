package co.il.stylist.service;

import co.il.stylist.dao.WardrobeDao;
import co.il.stylist.model.Wardrobe;
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
public class WardrobeServicesImpl implements WardrobeServices{

    @Autowired
    WardrobeDao wardrobeDao;

    public Wardrobe getByKey(Long key) {
        return wardrobeDao.getByKey(key);
    }

    public void persist(Wardrobe entity) {
        wardrobeDao.persist(entity);
    }

    public void delete(Wardrobe entity) {
        wardrobeDao.delete(entity);
    }

    public List<Wardrobe> list() {
        return wardrobeDao.list();
    }
}
