package co.il.stylist.service;

import co.il.stylist.dao.ClientDao;
import co.il.stylist.dao.ClientDaoImpl;
import co.il.stylist.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by S on 25.06.2016.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ClientServicesImpl implements ClientServices {

    @Autowired
    ClientDao clientDao;

    public Client getByKey(Long key) {
        return clientDao.getByKey(key);
    }

    public void persist(Client entity) {
        clientDao.persist(entity);
    }

    public void delete(Client entity) {
        clientDao.delete(entity);
    }

    public List<Client> list() {
        return clientDao.list();
    }
}
