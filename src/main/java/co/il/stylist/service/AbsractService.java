package co.il.stylist.service;

import co.il.stylist.model.Client;

import java.io.Serializable;
import java.util.List;

/**
 * Created by S on 01.07.2016.
 */
public interface AbsractService<PK extends Serializable, T> {
    public T getByKey(PK key);
    public void persist(T entity);
    public void delete(T entity);
    public List<T> list();
}
