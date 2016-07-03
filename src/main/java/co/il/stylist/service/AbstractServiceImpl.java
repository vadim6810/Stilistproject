package co.il.stylist.service;

import co.il.stylist.dao.CommonDao;
import co.il.stylist.dao.EventDao;
import co.il.stylist.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by S on 01.07.2016.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AbstractServiceImpl<PK extends Serializable, T> implements AbsractService<PK,T>{

    CommonDao<PK,T> commonDao;

    public T getByKey(PK key) {
        return commonDao.getByKey(key);
    }

    public void persist(T entity) {
        commonDao.persist(entity);
    }

    public void delete(T entity) {
        commonDao.delete(entity);
    }

    public List<T> list() {
        return commonDao.list();
    }
}
