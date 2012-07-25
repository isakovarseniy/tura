package org.elsoft.platform.metamodel.general;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

import javax.transaction.TransactionManager;

import org.elsoft.platform.Constants;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.OrderType;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.metamodel.objects.ELsoftObject;
import org.elsoft.platform.persistence.ObjectsID;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class GeneralService {
	private TransactionManagerImpl tx;

	public GeneralService(TransactionManager tx) {
		this.tx = (TransactionManagerImpl) tx;
	}

	public ELsoftObject create(String objectClass) throws Exception {
		@SuppressWarnings("unchecked")
		Class<ELsoftObject> clazz = (Class<ELsoftObject>) this.getClass()
				.getClassLoader().loadClass(objectClass);
		ELsoftObject obj = clazz.newInstance();
		obj.setObjId(this.getObjsectID());
		return obj;

	}

	@SuppressWarnings("unchecked")
	public List<ELsoftObject> find(List<SearchCriteria> search,
			List<OrderCriteria> order, Integer startIndex, Integer endIndex,
			String objectClass) throws Exception {

		Class<ELsoftObject> clazz = (Class<ELsoftObject>) this.getClass()
				.getClassLoader().loadClass(objectClass);

		Criteria criteria = tx.getSession().createCriteria(clazz);

		if (search != null) {
			Iterator<SearchCriteria> sitr = search.iterator();
			while (sitr.hasNext()) {
				SearchCriteria searchCreiteria = sitr.next();
				if (!searchCreiteria.getValue().equals(
						Constants.UNDEFINED_PARAMETER)) {
					Constructor<?> cons = Class.forName(
							searchCreiteria.getClassName()).getConstructor(
							String.class);

					Object obj = cons.newInstance(searchCreiteria.getValue());

					criteria.add(RestrictionsConverter.valueOf(
							searchCreiteria.getComparator()).getRestriction(searchCreiteria.getName(), obj));
					
				} else
					criteria.add(Restrictions.sqlRestriction("1 = -1"));
			}
		}
		if (order != null) {
			Iterator<OrderCriteria> oitr = order.iterator();
			while (oitr.hasNext()) {
				OrderCriteria orderCreiteria = oitr.next();
				if (OrderType.valueOf(orderCreiteria.getOrder()).equals(
						OrderType.ASC))
					criteria.addOrder(Order.asc(orderCreiteria.getName()));
				else
					criteria.addOrder(Order.desc(orderCreiteria.getName()));
			}
		}
		criteria.setFirstResult(startIndex);
		criteria.setMaxResults(endIndex - startIndex);

		return criteria.list();

	}

	public void update(ELsoftObject entity) {
		tx.getSession().merge(entity);

	}

	public void insert(ELsoftObject entity) {
		tx.getSession().save(entity);
	}

	public void remove(ELsoftObject entity) {
		tx.getSession().delete(entity);
	}

	public Long getObjsectID() {
		ObjectsID obj = new ObjectsID();
		tx.getSession().save(obj);
		tx.getSession().delete(obj);

		return obj.getObjId();
	}

}
