/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.init;

import java.util.List;

import org.tura.platform.datacontrol.DCRule;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CreateObjectParameters;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.base.PreInsertTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.base.SearchObjectParameters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.proxy.ArtificialFieldWrapperProvider;

public class DepartmentsDC<T> extends DataControl<T> implements ArtificialFieldWrapperProvider{

	private static final long serialVersionUID = 1384554748814770113L;

	
	public DepartmentsDC() throws Exception {
		super();
	}

	@Override
	public  void setDefaultSearchCriteria(List<SearchCriteria> defaultSearchCriteria){
		this.defaultSearchCriteria = defaultSearchCriteria;
	}

	@Override
	public  void setDefaultOrderCriteria(List<OrderCriteria> defaultOrderCriteria){
		this.defaultOrderCriteria=defaultOrderCriteria;
	}
	

	@Override
	public void setPreQueryTrigger(PreQueryTrigger preQueryTrigger) {
		this.preQueryTrigger = preQueryTrigger;
	}

	@Override
	public void setPostQueryTrigger(PostQueryTrigger postQueryTrigger) {
		this.postQueryTrigger = postQueryTrigger;
	}


	@Override
	public void setPostCreateTrigger(PostCreateTrigger postCreateTrigger) {
		this.postCreateTrigger = postCreateTrigger;
	}

	@Override
	public void setPreDeleteTrigger(PreDeleteTrigger preDeleteTrigger) {
		this.preDeleteTrigger = preDeleteTrigger;
	}

	@Override
	public void setPreInsertTrigger(PreInsertTrigger preInsertTrigger) {
		this.preInsertTrigger = preInsertTrigger;

	}

	@Override
	public void setPreUpdateTrigger(PreUpdateTrigger preUpdateTrigger) {
		this.preUpdateTrigger = preUpdateTrigger;
	}

	@Override
	public void setElResolver(ELResolver elResolver) {
		this.elResolver = elResolver;

	}

	@Override
	public void createChild( String  relName) {
	}

	@Override
	public void setCreateObjectParameters(CreateObjectParameters createObjectParameters) {
		this.createObjectParameters = createObjectParameters;
		
	}

	@Override
	public void setSearchObjectParameters(SearchObjectParameters searchObjectParameters) {
		this.searchObjectParameters=searchObjectParameters;
	}

	@Override
	public void setAutoCreateObjectRule(DCRule rule) {
		
	}

	@Override
	public Object wrap(Object obj) {
		return obj;
	}

	public void setArtificialFieldInterceptor(OnChangeArtificialFieldTrigger onChangeArtificialFieldTrigger) {
		
	}


}
