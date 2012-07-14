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
package org.elsoft.platform.metamodel.general;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.metamodel.objects.ELsoftObject;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.datasource.CreateDataSourceDAO;
import org.elsoft.platform.metamodel.objects.command.form.CreateFormDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDataLinkDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultOrderByDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultSearchDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateOptionDescriptorDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIButtonDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICanvasDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICellDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIDropDownListDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIGridDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIInputTextDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUILabelDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUILovDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITabPageDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeLeafDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIViewPortDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIWindowDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.FormElementDAO;
import org.elsoft.platform.metamodel.objects.command.infrastructure.CreateAppServerDefinitionDAO;
import org.elsoft.platform.metamodel.objects.command.infrastructure.CreateDatabaseDefinitionDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectMethodDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2DataLinkDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2ServiceMethodDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateMethodParameterExpressionDAO;
import org.elsoft.platform.metamodel.objects.datasource.DataSourceDAO;
import org.elsoft.platform.metamodel.objects.infrastructure.ContainerDAO;
import org.elsoft.platform.metamodel.objects.infrastructure.ServerClasterDAO;
import org.elsoft.platform.metamodel.objects.infrastructure.ServerGridDAO;
import org.elsoft.platform.metamodel.objects.infrastructure.ServerZoneDAO;
import org.elsoft.platform.metamodel.objects.recipe.IngredientDAO;
import org.elsoft.platform.metamodel.objects.recipe.ModelMappingDAO;
import org.elsoft.platform.metamodel.objects.recipe.PacketDAO;
import org.elsoft.platform.metamodel.objects.recipe.RecipeDAO;
import org.elsoft.platform.metamodel.objects.suite.ApplicationDAO;
import org.elsoft.platform.metamodel.objects.suite.DomainDAO;
import org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO;
import org.elsoft.platform.metamodel.objects.transformation.ArtifactTypeDAO;
import org.elsoft.platform.metamodel.objects.type.BusinessObjectDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO;
import org.elsoft.platform.metamodel.objects.type.ParameterDAO;
import org.elsoft.platform.metamodel.objects.type.PropertyDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.objects.type.TypeMappingDAO;
import org.elsoft.platform.metamodel.objects.ui.UIContainerDAO;

@Remote
@WebService
@XmlSeeAlso({ CommandDAO.class, CreateOptionDescriptorDAO.class,
		EventDAO.class, CreateMethodParameterExpressionDAO.class,
		CreateFormDAO.class, CreateDataLinkDAO.class,
		CreateDefaultOrderByDAO.class, CreateDefaultSearchDAO.class,
		CreateUIButtonDAO.class, CreateUICanvasDAO.class,
		CreateDataSourceDAO.class, CreateUICellDAO.class,
		CreateUIDropDownListDAO.class, CreateUIGridDAO.class,
		CreateUIInputTextDAO.class, CreateUILovDAO.class,
		CreateUITabPageDAO.class, CreateUITreeDAO.class,
		CreateUIViewPortDAO.class, CreateUIWindowDAO.class,
		CreateUILabelDAO.class, FormElementDAO.class,
		CreateDataLink2BusinessObjectMethodDAO.class,
		CreateDataLink2DataLinkDAO.class, CreateUITreeLeafDAO.class,
		CreateDataLink2BusinessObjectDAO.class,
		CreateDatabaseDefinitionDAO.class, CreateAppServerDefinitionDAO.class,
		ApplicationDAO.class, ArtifactTypeDAO.class, BusinessObjectDAO.class,
		ContainerDAO.class, DataSourceDAO.class, DomainDAO.class,
		FunctionalDomainDAO.class, IngredientDAO.class, MethodDAO.class,
		MethodReferenceDAO.class, ModelMappingDAO.class, PacketDAO.class,
		ParameterDAO.class, PropertyDAO.class, RecipeDAO.class,
		ServerClasterDAO.class, ServerGridDAO.class, ServerZoneDAO.class,
		TypeDAO.class, TypeMappingDAO.class, UIContainerDAO.class,
		CreateDataLink2ServiceMethodDAO.class,CreateEventUIElement2ServiceDAO.class

})
public interface GeneralService {

	public ELsoftObject create(String objectClass);

	public List<ELsoftObject> find(List<SearchCriteria> search,
			List<OrderCriteria> order, Integer startIndex, Integer endIndex,
			String objectClass);

	public void update(ELsoftObject entity);

	public void insert(ELsoftObject entity);

	public void remove(ELsoftObject entity);

}
