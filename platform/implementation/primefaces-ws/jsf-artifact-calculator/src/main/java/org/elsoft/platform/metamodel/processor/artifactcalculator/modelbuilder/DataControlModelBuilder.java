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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.PlatformPrimetiveTypes;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.objects.type.TypeMappingDAO;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;
import org.elsoft.platform.metamodel.processor.datasource.model.Parameter;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Annotation;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ArtifitialField;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DefaultSearch;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DisplayField;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.platform.metamodel.processor.uicontainer.model.PrimaryKey;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Relation;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ReturnResult;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Version;

public class DataControlModelBuilder {
	public Object builder(RepositoryFactory rf, DataLink dataLink,
			String domain, String functionalDomain, String application,
			MetamodelPlatformLevel level, Form frm) {

		dataLink.setMajorType(new MappedType(dataLink.getMajorType()
				.getTypedao(), domain, functionalDomain, application, level, rf));

		Iterator<RemoteMethod> itr = dataLink.getRemoteBusinessMethods()
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
		}

		itr = dataLink.getRemoteMethods().iterator();
		while (itr.hasNext()) {
			RemoteMethod rmi = itr.next();
			if (rmi.getReturnType() != null) {
				rmi.setReturnType(new MappedType(rmi.getReturnType()
						.getTypedao(), domain, functionalDomain, application,
						level, rf));
			}

			rmi.setProxy(new MappedType(rmi.getProxy().getTypedao(), domain,
					functionalDomain, application, level, rf));
		}

		itr = dataLink.getRemoteUIEventMethods().iterator();
		while (itr.hasNext()) {
			RemoteMethod rmi = itr.next();
			if (rmi.getReturnType() != null) {
				rmi.setReturnType(new MappedType(rmi.getReturnType()
						.getTypedao(), domain, functionalDomain, application,
						level, rf));
			}

			rmi.setProxy(new MappedType(rmi.getProxy().getTypedao(), domain,
					functionalDomain, application, level, rf));
		}

		if (dataLink.getArtifitialFields() != null) {
			Iterator<ArtifitialField> itrArtFld = dataLink
					.getArtifitialFields().iterator();
			while (itrArtFld.hasNext()) {
				ArtifitialField artfld = itrArtFld.next();
				artfld.setType(new MappedType(artfld.getType().getTypedao(),
						domain, functionalDomain, application, level, rf));
			}
		}

		if (dataLink.getAnnotation() != null) {
			Iterator<Annotation> itrAnt = dataLink.getAnnotation().iterator();
			ArrayList<Annotation> arr = new ArrayList<Annotation>();
			while (itrAnt.hasNext()) {
				Annotation ant = itrAnt.next();
				if (ant instanceof PrimaryKey)
					arr.add(new PrimaryKeyExt(((PrimaryKey) ant).getFieldName()));

				if (ant instanceof Version)
					arr.add(new VersionExt(((Version) ant).getFieldName()));
			}
			dataLink.getAnnotation().clear();
			dataLink.getAnnotation().addAll(arr);
		}

		if (dataLink.getDefaultSearch() != null) {
			Iterator<DefaultSearch> itrSearch = dataLink.getDefaultSearch()
					.iterator();
			while (itrSearch.hasNext()) {
				DefaultSearch defsearch = itrSearch.next();
				defsearch.setType(new MappedType(defsearch.getType()
						.getTypedao(), domain, functionalDomain, application,
						level, rf));
			}

		}

		return new DataLinkExtender(dataLink, frm);
	}

	public class DataLinkExtender {
		private DataLink dataLink;
		private String datalinkCapName;
		private ArrayList<RelationExt> details = new ArrayList<RelationExt>();
		private String uicontainer;
		private HashMap<String, MappedType> proxy = new HashMap<String, MappedType>();
		private HashMap<String, MappedType> dependecy = new HashMap<String, MappedType>();
		private ArrayList<String> listOfDataLink = new ArrayList<String>();

		public DataLinkExtender(DataLink dataLink, Form frm) {
			this.dataLink = dataLink;
			this.setUicontainer(frm.getName());

			Iterator<DataLink> itrDL = frm.getDatalinks().iterator();
			while (itrDL.hasNext()) {
				listOfDataLink
						.add(WordUtils.capitalize(itrDL.next().getName()));
			}

			datalinkCapName = WordUtils.capitalize(dataLink.getName());
			Iterator<Relation> itr = dataLink.getRelation().iterator();
			while (itr.hasNext()) {
				Relation rel = itr.next();
				details.add(new RelationExt(rel));
			}

			Iterator<RemoteMethod> itrRem = dataLink.getRemoteBusinessMethods()
					.iterator();
			while (itrRem.hasNext()) {

				RemoteMethod rmi = itrRem.next();
				MappedType tp = (MappedType) rmi.getProxy();
				proxy.put(tp.resPackageName + tp.resTypeName, tp);

			}

			itrRem = dataLink.getRemoteMethods().iterator();
			while (itrRem.hasNext()) {

				RemoteMethod rmi = itrRem.next();
				MappedType tp = (MappedType) rmi.getProxy();
				dependecy.put(tp.groupName + tp.artifactName
						+ tp.artifactVersion, tp);

			}

			itrRem = dataLink.getRemoteUIEventMethods().iterator();
			while (itrRem.hasNext()) {

				RemoteMethod rmi = itrRem.next();
				MappedType tp = (MappedType) rmi.getProxy();
				dependecy.put(tp.groupName + tp.artifactName
						+ tp.artifactVersion, tp);

			}

			@SuppressWarnings("unchecked")
			List<DisplayField> ls = (List<DisplayField>) dataLink
					.getTriggerPropery().get(
							"DropDownListGetOptionsList_DisplayField");
			if (ls != null) {
				Iterator<DisplayField> itrDisF = ls.iterator();
				while (itrDisF.hasNext()) {
					DisplayField f = itrDisF.next();
					f.setDisplayLabel(WordUtils.capitalize(f.getDisplayLabel()));
					f.setDisplayExpression(WordUtils.capitalize(f
							.getDisplayExpression()));
				}

			}

			@SuppressWarnings("unchecked")
			List<ReturnResult> ls1 = (List<ReturnResult>) dataLink
					.getTriggerPropery().get("LovGetOptionsList_ResultField");
			if (ls1 != null) {
				Iterator<ReturnResult> itrRet = ls1.iterator();
				while (itrRet.hasNext()) {
					ReturnResult f = itrRet.next();
					f.setSrcExpression(WordUtils.capitalize(f
							.getSrcExpression()));
				}
			}
		}

		public ArrayList<String> getListOfDataLink() {
			return listOfDataLink;
		}

		public Collection<MappedType> getProxy() {
			return proxy.values();
		}

		public HashMap<String, MappedType> getProxyHash() {
			return proxy;
		}

		public HashMap<String, MappedType> getDependensiesHash() {
			return dependecy;
		}

		public DataLink getDataLink() {
			return dataLink;
		}

		public String getDatalinkCapName() {
			return datalinkCapName;
		}

		public ArrayList<RelationExt> getDetails() {
			return details;
		}

		public String getUicontainer() {
			return uicontainer;
		}

		public void setUicontainer(String uicontainer) {
			this.uicontainer = uicontainer;
		}

	}

	public class VersionExt extends Version {

		private String antType = "Version";

		public VersionExt(String fieldName) {
			super(fieldName);
		}

		public String getAntType() {
			return antType;
		}

		public void setAntType(String antType) {
			this.antType = antType;
		}

	}

	public class RelationExt {

		private String capDetailName;
		private Relation relation;

		public RelationExt(Relation relation) {
			this.relation = relation;
			setCapDetailName(WordUtils.capitalize(relation.getDetail()
					.getName()));
		}

		public Relation getRelation() {
			return relation;
		}

		public void setRelation(Relation relation) {
			this.relation = relation;
		}

		public String getCapDetailName() {
			return capDetailName;
		}

		public void setCapDetailName(String capDetailName) {
			this.capDetailName = capDetailName;
		}

	}

	public class PrimaryKeyExt extends PrimaryKey {

		private String antType = "PrimaryKey";

		public PrimaryKeyExt(String fieldName) {
			super(fieldName);

		}

		public String getAntType() {
			return antType;
		}

		public void setAntType(String antType) {
			this.antType = antType;
		}

	}

	public class MappedType extends IndependentType {
		private String resPackageName;
		private String resTypeName;
		private String artifactName;
		private String groupName;
		private String artifactVersion;

		public MappedType(TypeDAO type, String domain, String functionalDomain,
				String application, MetamodelPlatformLevel level,
				RepositoryFactory rf) {
			super(type);

			TypeMappingDAO typemap = rf.getTypeMappingHandler().clean()
					.searchString("targetDomain", domain)
					.searchString("targetFunctionalDomain", functionalDomain)
					.searchString("targetApplication", application)
					.searchString("targetLayer", level.name())
					.searchLong("typeReference", type.getObjId()).getObject();

			if (typemap == null) {
				// looking for primitive type
				typemap = rf
						.getTypeMappingHandler()
						.clean()
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
			this.artifactName = typemap.getArtifactName();
			this.groupName = typemap.getGroupName();
			this.artifactVersion = typemap.getArtifactVersion();

		}

		public String getArtifactName() {
			return artifactName;
		}

		public void setArtifactName(String artifactName) {
			this.artifactName = artifactName;
		}

		public String getGroupName() {
			return groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getArtifactVersion() {
			return artifactVersion;
		}

		public void setArtifactVersion(String artifactVersion) {
			this.artifactVersion = artifactVersion;
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
