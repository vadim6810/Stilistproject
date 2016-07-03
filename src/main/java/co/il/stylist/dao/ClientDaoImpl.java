package co.il.stylist.dao;

import co.il.stylist.model.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by S on 25.06.2016.
 */

@Repository("clientDao")
@Transactional(propagation = Propagation.REQUIRED)
public class ClientDaoImpl extends  AbstractDao<Long,Client> implements ClientDao{


}
