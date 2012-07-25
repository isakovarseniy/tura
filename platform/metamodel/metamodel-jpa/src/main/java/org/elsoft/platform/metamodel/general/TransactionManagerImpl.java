package org.elsoft.platform.metamodel.general;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.InvalidTransactionException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TransactionManagerImpl implements TransactionManager {
	private Session session = null;
	private SessionFactory sessionFactory;
	private static TransactionManagerImpl instance;

	public static TransactionManagerImpl getInstance() {
		if (instance == null)
			instance = new TransactionManagerImpl();
		return instance;
	}

	public Session getSession() {
		return session;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private TransactionManagerImpl() {

		sessionFactory = new Configuration().configure()
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.ELsoftObject.class )
		.addAnnotatedClass( org.elsoft.platform.persistence.ObjectsID.class)
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.CommandDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.EventDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.datasource.CreateDataSourceDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.CreateFormDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDataLinkDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultOrderByDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultSearchDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateOptionDescriptorDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIButtonDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICanvasDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICellDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIDropDownListDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIGridDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIInputTextDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUILabelDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUILovDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITabPageDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeLeafDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIViewPortDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIWindowDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.form.ui.FormElementDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.infrastructure.CreateAppServerDefinitionDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.infrastructure.CreateDatabaseDefinitionDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectMethodDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2DataLinkDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2ServiceMethodDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.command.links.CreateMethodParameterExpressionDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.datasource.DataSourceDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.infrastructure.ContainerDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.infrastructure.ServerClasterDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.infrastructure.ServerGridDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.infrastructure.ServerZoneDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.recipe.IngredientDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.recipe.ModelMappingDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.recipe.PacketDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.recipe.RecipeDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.suite.ApplicationDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.suite.DomainDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.transformation.ArtifactTypeDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.type.BusinessObjectDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.type.MethodDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.type.ParameterDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.type.PropertyDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.type.TypeDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.type.TypeMappingDAO.class )
		.addAnnotatedClass( org.elsoft.platform.metamodel.objects.ui.UIContainerDAO.class )
		.buildSessionFactory();
		
		session = sessionFactory.openSession();

	}

	@Override
	public void begin() throws NotSupportedException, SystemException {
		session.beginTransaction().begin();
	}

	@Override
	public void commit() throws RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SecurityException,
			IllegalStateException, SystemException {
		session.getTransaction().commit();

	}

	@Override
	public int getStatus() throws SystemException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resume(Transaction arg0) throws InvalidTransactionException,
			IllegalStateException, SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void rollback() throws IllegalStateException, SecurityException,
			SystemException {
		session.getTransaction().rollback();
	}

	@Override
	public void setRollbackOnly() throws IllegalStateException, SystemException {

	}

	@Override
	public void setTransactionTimeout(int arg0) throws SystemException {
		session.getTransaction().setTimeout(arg0);

	}

	@Override
	public Transaction suspend() throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction getTransaction() throws SystemException {
		return (Transaction) session.getTransaction();
	}

}
