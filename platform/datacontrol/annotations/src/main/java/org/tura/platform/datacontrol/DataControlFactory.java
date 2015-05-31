package org.tura.platform.datacontrol;

import static com.octo.java.sql.query.Query.c;
import static com.octo.java.sql.query.Query.select;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.tura.platform.datacontrol.annotations.ArtificialField;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Connection;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.DefaultOrderBy;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriteria;
import org.tura.platform.datacontrol.annotations.Delete;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.annotations.Dependency;
import org.tura.platform.datacontrol.annotations.Insert;
import org.tura.platform.datacontrol.annotations.Key;
import org.tura.platform.datacontrol.annotations.Keys;
import org.tura.platform.datacontrol.annotations.Link;
import org.tura.platform.datacontrol.annotations.Parameter;
import org.tura.platform.datacontrol.annotations.Parameters;
import org.tura.platform.datacontrol.annotations.Query;
import org.tura.platform.datacontrol.annotations.Search;
import org.tura.platform.datacontrol.annotations.Update;
import org.tura.platform.datacontrol.command.Command;
import org.tura.platform.datacontrol.command.Command.CallParameter;
import org.tura.platform.datacontrol.command.CreateCommand;
import org.tura.platform.datacontrol.command.DeleteCommand;
import org.tura.platform.datacontrol.command.InsertCommand;
import org.tura.platform.datacontrol.command.SearchCommand;
import org.tura.platform.datacontrol.command.UpdateCommand;
import org.tura.platform.datacontrol.commons.ConditionConverter;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery;
import com.octo.java.sql.query.SelectQuery.Order;

public class DataControlFactory {

	@Produces
	public List<String> getKeys(InjectionPoint injectionPoint) {
		ArrayList<String> list = new ArrayList<>();

		Keys annotation = injectionPoint.getAnnotated().getAnnotation(
				Keys.class);
		for (Key key : annotation.fields()) {
			list.add(key.field());
		}
		return list;

	}

	@Produces
	public List<ArtificialProperty> getArtificialProperties(
			InjectionPoint injectionPoint) throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		ArrayList<ArtificialProperty> list = new ArrayList<>();

		ArtificialFields annotation = injectionPoint.getAnnotated()
				.getAnnotation(ArtificialFields.class);

		for (ArtificialField field : annotation.fields()) {
			ArtificialProperty property = new ArtificialProperty();
			if (!"".equals(field.defaulValue())) {
				Constructor<?> constructor = field.type().getConstructor(
						String.class);
				property.setDefaultValue(constructor.newInstance(field
						.defaulValue()));
			}
			property.setType(field.type());
			property.setProperty(field.field());

			list.add(property);
		}
		return list;
	}

	@Produces
	public SelectQuery getSelectQuery(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, QueryException {

		Query annotation = injectionPoint.getAnnotated().getAnnotation(
				Query.class);
		SelectQuery query = select(c("x")).from(
				annotation.base().clazz().getCanonicalName()).as("x");

		String condition = "WHERE";

		for (DefaultSearchCriteria criteria : annotation.search().criterias()) {

			ConditionConverter.valueOf(condition).getRestriction(query,
					c(criteria.field()));
			Object obj = null;
			if (criteria.expression() == null) {
				Constructor<?> constructor = criteria.type().getConstructor(
						String.class);
				obj = constructor.newInstance(criteria.value());
			}else{
				obj = "#{"+criteria.expression()+"}";
			}
			
			query.op(Operator.valueOf(criteria.comparator().name()), obj);

			condition = "AND";
		}

		for (DefaultOrderBy order : annotation.orders().orders()) {

			query.orderBy(order.field());

			if (order.order().equals(Order.ASC))
				query.asc();
			else
				query.desc();
		}
		return query;
	}

	@Produces
	public InsertCommand getInsertCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Insert annotation = injectionPoint.getAnnotated().getAnnotation(
				Insert.class);

		InsertCommand cmd = new InsertCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;
	}

	@Produces
	public UpdateCommand getUpdateCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Update annotation = injectionPoint.getAnnotated().getAnnotation(
				Update.class);

		UpdateCommand cmd = new UpdateCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;

	}

	@Produces
	public CreateCommand getCreateCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Create annotation = injectionPoint.getAnnotated().getAnnotation(
				Create.class);

		CreateCommand cmd = new CreateCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;

	}

	@Produces
	public DeleteCommand getDeleteCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Delete annotation = injectionPoint.getAnnotated().getAnnotation(
				Delete.class);

		DeleteCommand cmd = new DeleteCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;

	}

	@Produces
	public SearchCommand getSearchCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Search annotation = injectionPoint.getAnnotated().getAnnotation(
				Search.class);

		SearchCommand cmd = new SearchCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;

	}

	@Produces
	public List<DependecyProperty> getDependencies(InjectionPoint injectionPoint) {

		Dependencies dependencies = injectionPoint.getAnnotated()
				.getAnnotation(Dependencies.class);

		ArrayList<DependecyProperty> list = new ArrayList<>();

		for (Dependency d : dependencies.dependency()) {
			DependecyProperty property = new DependecyProperty();
			property.setExpression(d.expression());
			list.add(property);
		}
		return list;
	}

	private void parametersBuilder(Parameters parameters, Command cmd)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		for (Parameter prm : parameters.value()) {

			CallParameter cp = ((Command) cmd).new CallParameter();
			cmd.getParameters().add(cp);
			cp.setClazz(prm.type());
			cp.setExpression(prm.expression());
			cp.setName(prm.name());
			if (!"".equals(prm.value())) {
				Constructor<?> constructor = prm.type().getConstructor(
						String.class);
				cp.setValue(constructor.newInstance(prm.value()));
			}
		}

	}

	public static void buildConnection(DataControl<?> masterDC)
			throws IllegalArgumentException, IllegalAccessException, TuraException {

		Method[] methods = masterDC.getClass().getDeclaredMethods();
		for (Method method : methods) {
			method.setAccessible(true);
			Connection connection = method.getAnnotation(Connection.class);
			if (connection != null) {
				Relation relation = new Relation();
				relation.setChild(null);
				for (Link link : connection.links()) {
					relation.getLinks().add(
							new PropertyLink(link.field1(), link.field2()));
				}
				masterDC.addChildren(connection.connectionName(), relation);
			}
		}
	}
}
