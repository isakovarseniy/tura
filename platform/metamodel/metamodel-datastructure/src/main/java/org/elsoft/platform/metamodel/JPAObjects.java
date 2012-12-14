package org.elsoft.platform.metamodel;

import java.util.ArrayList;
import java.util.List;

public class JPAObjects {

	public static List<Class<?>> getObjects() {
		ArrayList<Class<?>> ls = new ArrayList<Class<?>>();

		ls.add(org.elsoft.platform.metamodel.objects.ELsoftObject.class);
		ls.add(org.elsoft.platform.persistence.ObjectsID.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.CommandDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.EventDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.datasource.CreateDataSourceDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.CreateFormDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDataLinkDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultOrderByDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultSearchDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateOptionDescriptorDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIButtonDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICanvasDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICellDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIDropDownListDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIGridDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIInputTextDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUILabelDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUILovDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITabPageDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeLeafDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIViewPortDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIWindowDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.FormElementDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.infrastructure.CreateAppServerDefinitionDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.infrastructure.CreateDatabaseDefinitionDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectMethodDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2DataLinkDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2ServiceMethodDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.links.CreateMethodParameterExpressionDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.datasource.DataSourceDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.infrastructure.ContainerDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.infrastructure.ServerClasterDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.infrastructure.ServerGridDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.infrastructure.ServerZoneDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.recipe.IngredientDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.recipe.ModelMappingDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.recipe.PacketDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.recipe.RecipeDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.suite.ApplicationDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.suite.DomainDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.transformation.ArtifactTypeDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.type.BusinessObjectDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.type.MethodDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.type.ParameterDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.type.PropertyDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.type.TypeDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.type.TypeMappingDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.ui.UIContainerDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateFieldSetDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.datasource.CreateArtifitialFieldsDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateDrugAndDropDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICheckBoxDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIImageDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDependencyDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.security.ApplicationRoleDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.security.GlobalRoleDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperHolderDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO.class);
		ls.add(org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2JavaScriptDAO.class);

		return ls;

	}
}
