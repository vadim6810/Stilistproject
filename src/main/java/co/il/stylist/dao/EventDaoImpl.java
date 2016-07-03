package co.il.stylist.dao;

import co.il.stylist.model.Event;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by S on 01.07.2016.
 */

@Repository("eventDao")
@Transactional(propagation = Propagation.REQUIRED)
public class EventDaoImpl extends AbstractDao<Long,Event> implements EventDao{
}
