package co.il.stylist.dao;

import co.il.stylist.model.Wardrobe;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by S on 01.07.2016.
 */

@Repository("wardrobeDao")
@Transactional(propagation = Propagation.REQUIRED)
public class WardrobeDaoImpl extends AbstractDao<Long,Wardrobe> implements WardrobeDao{
}
