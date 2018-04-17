package org.tura.platform.repository;

import static com.octo.java.sql.query.Query.c;
import static com.octo.java.sql.query.Query.select;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.commons.ConditionConverter;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.spa.test.Customer;
import org.tura.spa.test.Location;
import org.tura.spa.test.Order;
import org.tura.spa.test.Vehicle;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery;


public class QueryPreprocessor {

	private Object parentPk;
	private Class<?> parentClass;
	private Object parentObject;
	private String property;
	private List<SearchCriteria> search = new ArrayList<>();
	private List<OrderCriteria> order = new ArrayList<>();
	private String table;
	private SelectQuery query;

	public SelectQuery getQuery() {
		return query;
	}

	public void setQuery(SelectQuery query) {
		this.query = query;
	}

	public Object getParentPk() {
		return parentPk;
	}

	public void setParentPk(Object parentPk) {
		this.parentPk = parentPk;
	}

	public Class<?> getParentClass() {
		return parentClass;
	}

	public void setParentClass(Class<?> parentClass) {
		this.parentClass = parentClass;
	}

	public Object getParentObject() {
		return parentObject;
	}

	public void setParentObject(Object parentObject) {
		this.parentObject = parentObject;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public List<SearchCriteria> getSearch() {
		return search;
	}

	public void setSearch(List<SearchCriteria> search) {
		this.search = search;
	}

	public List<OrderCriteria> getOrder() {
		return order;
	}

	public void setOrder(List<OrderCriteria> order) {
		this.order = order;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public void process(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Class<?> clazz)
			throws Exception {

		this.search.addAll(searchCriteria);
		this.order.addAll(orderCriteria);
		this.table = clazz.getSimpleName();

		for (SearchCriteria criteria : searchCriteria) {
			switch (criteria.getName()) {

			case "parentPk":
				this.parentPk = criteria.getValue();
				break;

			case "parentClass":
				this.parentClass = Class.forName((String) criteria.getValue());
				break;

			case "parentObject":
				this.parentObject = criteria.getValue();
				break;

			case "property":
				this.property = (String) criteria.getValue();
				break;
			}

		}
		if (parentPk != null && parentClass != null && parentObject != null && property != null) {
			List<SearchCriteria> s = new ArrayList<>();

			for (SearchCriteria criteria : searchCriteria) {

				switch (criteria.getName()) {

				case "parentPk":
				case "parentClass":
				case "parentObject":
				case "property":
					break;

				default:
					s.add(criteria);
				}
			}

			search.clear();
			search.addAll(s);

			Method method = null;
			try {
				method = this.getClass().getDeclaredMethod("preprocessQuery", parentClass, clazz);
				method.invoke(this, null, null);
			} catch (NoSuchMethodException e) {
				defaultPreprocessQuery();
			}
		}

		if (query == null) {
			query = builder(search, order, table);
		}

	}

	private void defaultPreprocessQuery() {
		SearchCriteria criteria = new SearchCriteria();
		criteria.setName(parentClass.getSimpleName().toLowerCase());
		criteria.setComparator(Operator.EQ.name());
		criteria.setClassName(Long.class.getName());
		criteria.setValue(parentPk);
		search.add(criteria);
	}

	@SuppressWarnings("unused")
	private void preprocessQuery(Customer customer, Order order) {
		this.table = "T_ORDER";
		defaultPreprocessQuery();
	}
	
	
	@SuppressWarnings("unused")
	private void preprocessQuery( Order order ,Customer customer) throws Exception {
		query = select(c("*")).from( "CUSTOMER").as("x").where(c("CUSTOMER_ID")).in(select(c("CUSTOMER")).from("T_ORDER")
				.where(c("CUSTOMER")).eq(this.getParentPk()));
	}	

	@SuppressWarnings("unused")
	private void preprocessQuery(Vehicle vehicle, Order order) throws Exception {
		query = select(c("*")).from( "T_ORDER").as("x").where(c("VEHICLE_ID")).eq(this.getParentPk());
	}

	
	@SuppressWarnings("unused")
	private void preprocessQuery( Order order ,Vehicle vehicle) throws Exception {
		query = select(c("*")).from( "VEHICLE").as("x").where(c("OBJ_ID")).in(select(c("VEHICLE_ID")).from("T_ORDER")
				.where(c("ORDER_ID")).eq(this.getParentPk()));
	}

	
	@SuppressWarnings("unused")
	private void preprocessQuery( Customer customer, Location location) throws Exception {
		query = select(c("*")).from( "LOCATION").as("x").where(c("OBJ_ID")).in(select(c("LOCATION_CUSTOMERID")).from("RL_CUSTOMER_LOCATION")
				.where(c("CUSTOMER_OBJID")).eq(this.getParentPk()));
	}
	
	@SuppressWarnings("unused")
	private void preprocessQuery( Location location, Customer customer) throws Exception {
		query = select(c("*")).from( "CUSTOMER").as("x").where(c("CUSTOMER_ID")).in(select(c("CUSTOMER_OBJID")).from("RL_CUSTOMER_LOCATION")
				.where(c("  LOCATION_CUSTOMERID")).eq(this.getParentPk()));
	}
	
	
	
	public SelectQuery builder(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, String table)
			throws TuraException {

		try {
			SelectQuery query = select(c("*")).from(table).as("x");

			String condition = "WHERE";

			for (SearchCriteria criteria : searchCriteria) {

				ConditionConverter.valueOf(condition).getRestriction(query, c(criteria.getName()));
				query.op(Operator.valueOf(criteria.getComparator()), criteria.getValue());

				condition = "AND";
			}

			for (OrderCriteria order : orderCriteria) {

				query.orderBy(order.getName());

				if (order.getOrder().equals(  com.octo.java.sql.query.SelectQuery.Order.ASC.name()))
					query.asc();
				else
					query.desc();
			}
			return query;
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

}
