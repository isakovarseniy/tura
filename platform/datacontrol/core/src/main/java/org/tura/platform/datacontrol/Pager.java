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

package org.tura.platform.datacontrol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.CpaStorageEventListener;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public abstract class Pager<T> implements Serializable {

	private static final long serialVersionUID = 4489502651569184639L;

	private int startIndex;
	private int endIndex;
	private int loadStep = PlatformConfig.LOADSTEP;
	protected DataControl<T> datacontrol;
	protected CpaRepository repository;
	protected String id = UUID.randomUUID().toString();
	protected  boolean internal = false;

	public abstract T create() throws TuraException;

	protected abstract T createObject(int index) throws TuraException;

	protected abstract void search() throws TuraException;

	protected abstract T remove(int i) throws TuraException;

	protected abstract T delete() throws TuraException;

	protected abstract T getObject(int index) throws TuraException;

	protected abstract List<T> getScroller() throws TuraException;

	protected abstract Object getParentObject() throws TuraException;

	protected abstract long size() throws TuraException;

	protected abstract void cleanPager() throws TuraException;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object findObject(RepoKeyPath key) throws TuraException {
		try {
			List  lst =  new ArrayList();
			lst.add(repository.find(key, null));
			return new ListWrapper<>(lst, datacontrol).get(0);
		} catch (RepositoryException e) {
			throw new TuraException(e);
		}
	}

	public int getLoadStep() {
		return loadStep;
	}

	public void setLoadStep(int loadStep) {
		this.loadStep = loadStep;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	protected void prepareParameter(org.tura.platform.datacontrol.command.base.CallParameter parameter)
			throws Exception {

		com.rits.cloning.Cloner cloner = new com.rits.cloning.Cloner();

		String exp = parameter.getExpression();
		Object val = parameter.getValue();
		Class<?> clazz = parameter.getClazz();
		if ((exp != null && !exp.equals("")) && (val != null && !val.equals(""))) {
			new TuraException("Wrong combination of method's parameter");
		}
		if (exp != null && !exp.equals("")) {
			Object obj = datacontrol.getElResolver().getValue(exp);

			Object o = cloner.deepClone(obj);
			parameter.setObj(o);
		}
		if (val != null && !val.equals("")) {
			java.lang.reflect.Constructor<?> cnt = clazz.getDeclaredConstructor(String.class);
			Object o = cnt.newInstance(val);
			parameter.setObj(o);
		}

	}

	protected Object resolver(String str) {
		int lastindex = str.length() - 1;
		if (str.length() > 3 && "#{".equals(str.substring(0, 2)) && "}".equals(str.substring(lastindex))) {
			return datacontrol.getElResolver().getValue(str);
		} else
			return str;
	}

	public CpaRepository getRepository() {
		return repository;
	}

	public void setRepository(CpaRepository repository) {
		this.repository = repository;
	}

	public void addCommandStackListener() {
		repository.getStackProvider().get().addProxyCommandStackEventListener(id,
				new PagerCommandStackEventListenerr());
	}

	public void addCpaStorageEventListenetr() {
		repository.getStorageProvider().getStorage().addCpaStorageEventListener(id, new PagerCpaStorageEventListener());

	}

	protected DataControl<T> getDataControl() {
		return datacontrol;
	}

	public class PagerCommandStackEventListenerr extends ProxyCommandStackEventListener {
		private static final long serialVersionUID = 1L;

		public void afterRallbackSavePoint() throws Exception {
			Pager.this.datacontrol.forceRefresh();
		}

		public void afterRallback() throws Exception {
			Pager.this.datacontrol.forceRefresh();
		}

	}

	public class PagerCpaStorageEventListener extends CpaStorageEventListener {
		private static final long serialVersionUID = 1L;
		
		@Override
		public  void objectInserted(Class<?> clazz, String source) throws Exception{
			if (!datacontrol.isIsoleted()  && !datacontrol.getId().equals(source)  && datacontrol.getBaseClass().equals(clazz)) {
				if ( internal) {
					Pager.this.datacontrol.forceRefresh();
				}else {
				    Pager.this.datacontrol.getCurrentObject();
				}
			}
		}
		
		@Override
		public  void objectDelited(Class<?> clazz, String source) throws Exception{
			if (  !datacontrol.isIsoleted()  && !datacontrol.getId().equals(source)  && datacontrol.getBaseClass().equals(clazz)) {
				if ( internal) {
					Pager.this.datacontrol.forceRefresh();
				}else {
				    Pager.this.datacontrol.getCurrentObject();
				}
			}
		}
		

	}

}