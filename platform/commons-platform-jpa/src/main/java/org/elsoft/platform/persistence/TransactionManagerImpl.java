/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.elsoft.platform.persistence;

import java.util.Iterator;
import java.util.List;

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

	public static TransactionManagerImpl getCurrentInstance() {
		return instance;
	}

	public Session getSession() {
		return session;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public TransactionManagerImpl(List<Class<?>> classes ) {

		instance = this;		
		Configuration config = new Configuration().configure();
		
		Iterator<Class<?>> itr = classes.iterator();
		while(itr.hasNext()){
			config.addAnnotatedClass(itr.next());
		}
				
		config.setProperty("show_sql", "true");
		sessionFactory = config.buildSessionFactory();
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
		session.clear();

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
