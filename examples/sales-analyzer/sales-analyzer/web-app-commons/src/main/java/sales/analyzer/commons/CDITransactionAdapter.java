/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package sales.analyzer.commons;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.TransactionAdapter;

public class CDITransactionAdapter extends TransactionAdapter {
	public CDITransactionAdapter(Registry registry) {
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

	public static EntityManager getEntityManager(){
		BeanManager bm = CDI.current().getBeanManager();
		@SuppressWarnings("unchecked")
		Bean<EntityManager> bean = (Bean<EntityManager>) bm.getBeans(EntityManager.class).iterator().next();
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
