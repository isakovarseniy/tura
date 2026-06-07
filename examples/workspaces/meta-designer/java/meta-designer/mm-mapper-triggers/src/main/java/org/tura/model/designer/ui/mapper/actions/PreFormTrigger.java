/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.mapper.actions;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Inject;

import org.tura.model.designer.ui.mapper.mmdesigner.mapper.datacontrol.IBeanFactory;
import org.tura.model.designer.ui.mapper.mmdesigner.mapper.viewmodel.IViewPortHolder;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

@Alternative
@Priority(10)
@Selector("mmdesigner.mapper")
public class PreFormTrigger implements FactoryInitializeTrigger{

	private static final long serialVersionUID = 1L;
	
	public static String JAVACLASS_MAPPER = "org.tura.model.designer.repository.jpa.mapper.JavaMapper";
	public static String JAVAPACKAGE_MAPPER = "org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper";
	public static String CSS_MAPPER = "org.tura.model.designer.repository.jpa.mapper.CSSMapper";
	public static String JAVASCRIPT_MAPPER = "org.tura.model.designer.repository.jpa.mapper.JavaScriptMapper";
	public static String METAMODEL_MAPPER = "org.tura.model.designer.repository.jpa.mapper.MetamodelPackageMapper";
	

	
	@Inject
	IViewPortHolder viewPortHolder;
	
	@Inject
	IBeanFactory bf;
	
	
	
	@Override
	public void execute(Object obj) throws TuraException {
		viewPortHolder.setMappersPort(IViewPortHolder.MAPPERSPORT_JAVACLASSMAPPER);
		bf.setActiveIndex(0);
		bf.setMapperFilter(JAVACLASS_MAPPER);
	}

}
