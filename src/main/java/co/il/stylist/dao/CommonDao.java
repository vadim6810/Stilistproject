package co.il.stylist.dao;

import co.il.stylist.model.Client;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public interface CommonDao<PK extends Serializable,T> {

    public T getByKey(PK key);

    public void persist(T entity);

    public void delete(T entity);

    public List<T> list();
}
