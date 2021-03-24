/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.cdi;

import java.lang.annotation.Annotation;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

import javax.enterprise.context.ContextNotActiveException;
import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.uuiclient.annotations.UUIClientScoped;

public class UUIClientScopeContext implements Context {

	private static final ThreadLocal<AtomicReference<Scope>> ACTIVE_SCOPE_THREAD_LOCAL = ThreadLocal
			.withInitial(AtomicReference::new);
	private transient Logger logger = Logger.getLogger(UUIClientScopeContext.class.getName());

	private static final ThreadLocal<AtomicReference<BeanStorage>> cache = ThreadLocal.withInitial( AtomicReference :: new );
	
	private static final ThreadLocal<AtomicReference<ScopeStorage>> STORAGE_THREAD_LOCAL = ThreadLocal.withInitial( AtomicReference::new );

	public ScopeStorage getStorage() {
		return STORAGE_THREAD_LOCAL.get().get();
	}

	public void setStorage(ScopeStorage storage) {
		STORAGE_THREAD_LOCAL.get().set(storage);
	}

	@Override
	public boolean isActive() {
		return ACTIVE_SCOPE_THREAD_LOCAL.get().get() != null;
	}

	private boolean isScopePresentInStorage(Scope scopeId) {
		try {
			if (this.getStorage() != null && this.getStorage().findScope(scopeId)) {
				return true;
			}
		} catch (Exception e) {
			logger.info(ExceptionUtils.getStackTrace(e));
		}
		return false;
	}

	private BeanStorage loadFromStorage(Scope scopeId) {
		try {
			if (isScopePresentInStorage(scopeId)) {
				return this.getStorage().load(scopeId);
			}
		} catch (Exception e) {
			logger.info(ExceptionUtils.getStackTrace(e));
		}

		// Scope isn't present in storage, return new instance map instead
		return new BeanStorage(100);
	}

	private void writeToStorage(Scope scopeId, BeanStorage instanceMap) {
		try {
			if (this.getStorage() != null) {
				this.getStorage().write(scopeId, instanceMap);
			}
		}catch(Exception e) {
			logger.info(ExceptionUtils.getStackTrace(e));
		}
	}

	public void passivate(Scope scopeId) {
		writeToStorage(scopeId,cache.get().get());
		cache.get().get().destroyBeans();
		
		cache.get().set(null);
		ACTIVE_SCOPE_THREAD_LOCAL.get().set(null);
		setStorage(null);
		
	}

	@Override
	public Class<? extends Annotation> getScope() {
		return UUIClientScoped.class;
	}

	@Override
	public <T> T get(Contextual<T> contextual) {
		Scope scopeId = ACTIVE_SCOPE_THREAD_LOCAL.get().get();

		if (scopeId == null) {
			throw new ContextNotActiveException();
		}

		if (cache.get().get() == null) {
			cache.get().set(loadFromStorage(scopeId));
		}
		T instance = cache.get().get().getBean(contextual);


		if (instance == null) {
			return null;
		}

		return instance;
	}

	public void activate(Scope scopeId, boolean init) throws StorageNotFountException {
		if ( !getStorage().findScope(scopeId) && !init) {
			throw new StorageNotFountException();
		}
		if (ACTIVE_SCOPE_THREAD_LOCAL.get().get() == null) {
			ACTIVE_SCOPE_THREAD_LOCAL.get().set(scopeId);
		} else {
			throw new RuntimeException("Scope is active");
		}
		
		
	}

	@Override
	public <T> T get(Contextual<T> contextual, CreationalContext<T> creationalContext) {
		Scope scopeId = ACTIVE_SCOPE_THREAD_LOCAL.get().get();

		if (scopeId == null) {
			throw new ContextNotActiveException();
		}

		if (cache.get().get() == null) {
			cache.get().set(loadFromStorage(scopeId));
		}
		T instance = cache.get().get().createBean(contextual, creationalContext);

		return instance;
	}
}