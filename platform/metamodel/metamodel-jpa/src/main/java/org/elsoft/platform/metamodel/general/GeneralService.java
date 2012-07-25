package org.elsoft.platform.metamodel.general;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

import org.elsoft.platform.ComparatorType;
import org.elsoft.platform.Constants;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.OrderType;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.metamodel.objects.ELsoftObject;
import org.hibernate.Criteria;
import org.hibernate.TypeHelper;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class GeneralService {
	private TransactionManagerImpl tx;

	public GeneralService(TransactionManagerImpl tx) {
		this.tx = tx;
	}

	public ELsoftObject create(String objectClass) {
		return null;

	}

	@SuppressWarnings("unchecked")
	public List<ELsoftObject> find(List<SearchCriteria> search,
			List<OrderCriteria> order, Integer startIndex, Integer endIndex,
			String objectClass) throws Exception {

		Class<ELsoftObject> clazz = (Class<ELsoftObject>) this.getClass()
				.getClassLoader().loadClass(objectClass);

		Criteria criteria = tx.getSession().createCriteria(clazz);
		TypeHelper typeHelper = tx.getSessionFactory().getTypeHelper();

		Iterator<SearchCriteria> sitr = search.iterator();
		while (sitr.hasNext()) {
			SearchCriteria searchCreiteria = sitr.next();
			if (!searchCreiteria.getValue().equals(
					Constants.UNDEFINED_PARAMETER)) {
				Constructor<?> cons = Class.forName(
						searchCreiteria.getClassName()).getConstructor(
						String.class);

				Object obj = cons.newInstance(searchCreiteria.getValue());

				criteria.add(Restrictions.sqlRestriction(
						searchCreiteria.getName()
								+ " "
								+ ComparatorType.valueOf(
										searchCreiteria.getComparator())
										.getComp() + " ?"

						, obj, typeHelper.basic(obj.getClass())));
			} else
				criteria.add(Restrictions.sqlRestriction("1 = -1"));
		}

		Iterator<OrderCriteria> oitr = order.iterator();
		while (oitr.hasNext()) {
			OrderCriteria orderCreiteria = oitr.next();
			if (OrderType.valueOf(orderCreiteria.getOrder()).equals(
					OrderType.ASC))
				criteria.addOrder(Order.asc(orderCreiteria.getName()));
			else
				criteria.addOrder(Order.desc(orderCreiteria.getName()));
		}
		
		
		criteria.setFirstResult(startIndex);
		criteria.setMaxResults(endIndex - startIndex);
	 
		return criteria.list();

	}

	public void update(ELsoftObject entity) {

	}

	public void insert(ELsoftObject entity) {

	}

	public void remove(ELsoftObject entity) {

	}

}
