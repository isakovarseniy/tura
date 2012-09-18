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
package org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder;

import java.util.Iterator;

import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.PlatformPrimetiveTypes;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.objects.type.TypeMappingDAO;
import org.elsoft.platform.metamodel.processor.datasource.model.Field;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;
import org.elsoft.platform.metamodel.processor.datasource.model.Parameter;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;

public class TypeModelBuilder {

	public IndependentType builder(RepositoryFactory rf, String domain,
			String functionalDomain, String application,
			MetamodelPlatformLevel level, IndependentType it) {

        MappedType mpit =  new MappedType(it.getTypedao(), domain, functionalDomain, application, level, rf);
        if (it.getGeneric() != null){
        	mpit.setGeneric(new MappedType(it.getGeneric().getTypedao(), domain, functionalDomain, application, level, rf));
        }
        
		Iterator<Field> itrField = it.getFields().iterator();
		while (itrField.hasNext()) {
			Field field = itrField.next();
			if ((!field.isOptLock())&&(!field.isPk())){
			field.setType(new MappedType(field.getType().getTypedao(), domain,
					functionalDomain, application, level, rf));
			mpit.getFields().add(field);
			}
		}

		Iterator<RemoteMethod> itr = it.getMethods()
				.iterator();
		while (itr.hasNext()) {
			RemoteMethod rmi = itr.next();
			if (rmi.getReturnType() != null) {
				rmi.setReturnType(new MappedType(rmi.getReturnType()
						.getTypedao(), domain, functionalDomain, application,
						level, rf));
			}
			Iterator<Parameter> itrParams = rmi.getParamClass().iterator();
			while (itrParams.hasNext()) {
				Parameter param = itrParams.next();
				param.setType(new MappedType(param.getType().getTypedao(),
						domain, functionalDomain, application, level, rf));
			}

			rmi.setProxy(new MappedType(rmi.getProxy().getTypedao(), domain,
					functionalDomain, application, level, rf));

			mpit.getMethods().add(rmi);
		}

		
		return mpit;
	}

	public class MappedType extends IndependentType {
		private String resPackageName;
		private String resTypeName;

		public MappedType(TypeDAO type, String domain, String functionalDomain,
				String application, MetamodelPlatformLevel level,
				RepositoryFactory rf) {
			super(type);

			TypeMappingDAO typemap = rf.getTypeMappingHandler().cleanSearch()
					.searchString("targetDomain", domain)
					.searchString("targetFunctionalDomain", functionalDomain)
					.searchString("targetApplication", application)
					.searchString("targetLayer", level.name())
					.searchLong("typeReference", type.getObjId()).getObject();

			if (typemap == null) {
				// looking for primitive type
				typemap = rf
						.getTypeMappingHandler()
						.cleanSearch()
						.searchString("targetDomain",
								PlatformPrimetiveTypes.NA.name())
						.searchString("targetFunctionalDomain",
								PlatformPrimetiveTypes.NA.name())
						.searchString("targetApplication",
								PlatformPrimetiveTypes.NA.name())
						.searchString("targetLayer",
								PlatformPrimetiveTypes.NA.name())
						.searchLong("typeReference", type.getObjId())
						.getObject();

			}

			this.resPackageName = typemap.getResPackageName();
			this.resTypeName = typemap.getResTypeName();

		}

		public String getResPackageName() {
			return resPackageName;
		}

		public void setResPackageName(String resPackageName) {
			this.resPackageName = resPackageName;
		}

		public String getResTypeName() {
			return resTypeName;
		}

		public void setResTypeName(String resTypeName) {
			this.resTypeName = resTypeName;
		}

	}

}
