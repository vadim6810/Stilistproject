package co.il.stylist.service;

import co.il.stylist.dao.ClothesUnitDao;
import co.il.stylist.model.ClothesUnit;
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
public class ClothesUnitServicesImpl implements ClothesUnitServices{

    @Autowired
    ClothesUnitDao clothesUnitDao;

    public ClothesUnit getByKey(Long key) {
        return clothesUnitDao.getByKey(key);
    }

    public void persist(ClothesUnit entity) {
        clothesUnitDao.persist(entity);
    }

    public void delete(ClothesUnit entity) {
        clothesUnitDao.delete(entity);
    }

    public List<ClothesUnit> list() {
        return clothesUnitDao.list();
    }
}


