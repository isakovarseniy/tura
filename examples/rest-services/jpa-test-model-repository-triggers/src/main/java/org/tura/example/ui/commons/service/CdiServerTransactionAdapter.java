/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.example.ui.commons.service;

import java.util.Iterator;
import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.TransactionAdapter;

public class CdiServerTransactionAdapter extends TransactionAdapter {

	private static final long serialVersionUID = 7523664203907004068L;

	public CdiServerTransactionAdapter(Registry registry) {
		super(registry);
	}

	@Override
	protected void executeBeginTransaction() throws Exception  {
		UserTransaction trx = getUserTransaction();
		trx.begin();

	}

	@Override
	protected void executeCommitTransaction() throws Exception  {
		UserTransaction trx = getUserTransaction();
		trx.commit();

	}

	@Override
	protected void executeRollbackTransaction() throws Exception {
		UserTransaction trx = getUserTransaction();
		trx.rollback();
	}

	
	
	@SuppressWarnings("unchecked")
	private static Bean<EntityManager> findBean(Set<Bean<?>> set, Class<?> clazz){
		Iterator<Bean<?>>  iterator = set.iterator();
		while( iterator.hasNext()) {
			Bean<?> bean = iterator.next();
			if (   bean.getBeanClass().getName().equals(clazz.getName() )) {
					return (Bean<EntityManager>) bean;
			}
		}
		return null;
	}
	
	
	
	public static EntityManager getEntityManager(){
		BeanManager bm = CDI.current().getBeanManager();
		
		Set<Bean<?>> set =   bm.getBeans(EntityManager.class);

		Bean<EntityManager> bean = findBean(set, EntityManagerProducer.class);
		
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		EntityManager em = (EntityManager) bm.getReference(bean, EntityManager.class, ctx);
		return em;

	}

	public static EntityManager getSecondEntityManager(){
		BeanManager bm = CDI.current().getBeanManager();
		
		Set<Bean<?>> set =   bm.getBeans(EntityManager.class);

		Bean<EntityManager> bean = findBean(set, EntityManagerSecondProducer.class);
		
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		EntityManager em = (EntityManager) bm.getReference(bean, EntityManager.class, ctx);
		return em;

	}
	
	
	
	public static UserTransaction getUserTransaction(){
		BeanManager bm = CDI.current().getBeanManager();
		@SuppressWarnings("unchecked")
		Bean<UserTransaction> bean = (Bean<UserTransaction>) bm.getBeans(UserTransaction.class).iterator().next();
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		UserTransaction trx = (UserTransaction) bm.getReference(bean, UserTransaction.class, ctx);
		return trx;

	}
	
	
	
}
