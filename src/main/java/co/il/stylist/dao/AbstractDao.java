package co.il.stylist.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractDao<PK extends Serializable, T> {
	
	protected Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		System.out.println("=>AbstractDao");
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}

	public AbstractDao(Class<T> persistentClass){
		this.persistentClass=persistentClass;
	}
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}

	public List<T> list(){
		Criteria criteria = createEntityCriteria();
		return (List<T>) criteria.list();
	};

	
	protected Criteria createEntityCriteria(){

		return getSession().createCriteria(persistentClass).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
	}

}
