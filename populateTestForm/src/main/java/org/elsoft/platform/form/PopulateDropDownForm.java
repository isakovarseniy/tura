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
package org.elsoft.platform.form;

import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

import org.elsoft.platform.ComparatorType;
import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.metamodel.MetamodelObjectType;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.PlatformPrimetiveTypes;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.layers.uicontainer.UiContainerHandler;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.CreateFormDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDataLinkDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultSearchDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateOptionDescriptorDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICanvasDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICellDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIDropDownListDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIViewPortDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIWindowDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectMethodDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateMethodParameterExpressionDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO;
import org.elsoft.platform.metamodel.objects.ui.UIContainerDAO;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2BusinessObject;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2BusinessObjectMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDefaultSearch;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDisplayFieldSpecifier;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetCurrentRow;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetOptionsList;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateForm;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateMethodParameterExpression;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUICanvas;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUICell;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIDropDownList;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIViewPort;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIWindow;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.platform.metamodel.types.MethodReferenceHandler;

public class PopulateDropDownForm {

	public void execute(RepositoryFactory rf, HashMap<String, Object> context)
			throws Exception {
		UiContainerHandler uch = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer();

		UIContainerDAO uicontainer = uch.addUIContainer("DropDownForm");

		CreateFormDAO createForm = new CreateFormDAO();
		createForm.setFormName("DropDownForm");
		createForm.setUUID(UUID.randomUUID().toString());
		CreateForm.load(rf, context, createForm);

		CreateDataLinkDAO dropdowntestDataLink = new CreateDataLinkDAO();
		dropdowntestDataLink.setParentUUID(createForm.getUUID());
		dropdowntestDataLink.setUUID(UUID.randomUUID().toString());
		dropdowntestDataLink.setDataLinkName("dropdowntest");
		CreateDataLink.load(rf, context, dropdowntestDataLink);

		CreateDataLink2BusinessObjectDAO createDataLink2BusinessObject = new CreateDataLink2BusinessObjectDAO();
		createDataLink2BusinessObject.setDomain("Manufacturing");
		createDataLink2BusinessObject.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObject.setBusinessObjectName("dropdowntest");
		createDataLink2BusinessObject.setParentUUID(dropdowntestDataLink
				.getUUID());
		CreateDataLink2BusinessObject.load(rf, context,
				createDataLink2BusinessObject);

		CreateDataLink2BusinessObjectMethodDAO createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dropdowntestDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.CreateTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("dropdowntest");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		CreateMethodParameterExpressionDAO methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.dropdowntest.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dropdowntestDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.SearchTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("dropdowntest");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dropdowntestDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.InsertTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("dropdowntest");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.dropdowntest.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dropdowntestDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.RemoveTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("dropdowntest");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.dropdowntest.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dropdowntestDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.UpdateTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("dropdowntest");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.dropdowntest.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		CreateDataLinkDAO departmentsDataLink = new CreateDataLinkDAO();
		departmentsDataLink.setParentUUID(createForm.getUUID());
		departmentsDataLink.setUUID(UUID.randomUUID().toString());
		departmentsDataLink.setDataLinkName("departments");
		CreateDataLink.load(rf, context, departmentsDataLink);

		createDataLink2BusinessObject = new CreateDataLink2BusinessObjectDAO();
		createDataLink2BusinessObject.setDomain("Manufacturing");
		createDataLink2BusinessObject.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObject.setBusinessObjectName("departments");
		createDataLink2BusinessObject.setParentUUID(departmentsDataLink
				.getUUID());
		CreateDataLink2BusinessObject.load(rf, context,
				createDataLink2BusinessObject);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(departmentsDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.CreateTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("departments");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.departments.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(departmentsDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.SearchTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("departments");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(departmentsDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.InsertTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("departments");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.departments.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(departmentsDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.RemoveTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("departments");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.departments.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(departmentsDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.UpdateTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName("departments");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.departments.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		CreateDataLinkDAO employeesDataLink = new CreateDataLinkDAO();
		employeesDataLink.setParentUUID(createForm.getUUID());
		employeesDataLink.setUUID(UUID.randomUUID().toString());
		employeesDataLink.setDataLinkName("employees");
		CreateDataLink.load(rf, context, employeesDataLink);

		CreateDefaultSearchDAO defaultSearch = new CreateDefaultSearchDAO();
		defaultSearch.setParentUUID(employeesDataLink.getUUID());
		defaultSearch.setUUID(UUID.randomUUID().toString());
		defaultSearch.setColumnName("departmentId");
		defaultSearch.setTypeName(PlatformPrimetiveTypes.Long.name());
		defaultSearch.setComparator(ComparatorType.EQ.name());
		defaultSearch
				.setExpression("DropDownFormbinding.dropdowntest.currentRow.departmentId");
		CreateDefaultSearch.load(rf, context, defaultSearch);

		createDataLink2BusinessObject = new CreateDataLink2BusinessObjectDAO();
		createDataLink2BusinessObject.setDomain("Manufacturing");
		createDataLink2BusinessObject.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObject.setBusinessObjectName("employees");
		createDataLink2BusinessObject
				.setParentUUID(employeesDataLink.getUUID());
		CreateDataLink2BusinessObject.load(rf, context,
				createDataLink2BusinessObject);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(employeesDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.CreateTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod.setBusinessObjectName("employees");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.employees.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(employeesDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.SearchTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod.setBusinessObjectName("employees");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(employeesDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.InsertTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod.setBusinessObjectName("employees");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.employees.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(employeesDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.RemoveTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod.setBusinessObjectName("employees");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.employees.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(employeesDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.UpdateTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObjectMethod.setBusinessObjectName("employees");
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("DropDownFormbinding.employees.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		CreateUIWindowDAO createWin = new CreateUIWindowDAO();
		createWin.setParentUUID(createForm.getUUID());
		createWin.setWindowName("Window1");
		createWin.setUUID(UUID.randomUUID().toString());
		CreateUIWindow.load(rf, context, createWin);

		CreateUIViewPortDAO createUIViewPort = new CreateUIViewPortDAO();
		createUIViewPort.setParentUUID(createWin.getUUID());
		createUIViewPort.setUUID(UUID.randomUUID().toString());
		createUIViewPort.setViewPortName("MAINPORT");
		CreateUIViewPort.load(rf, context, createUIViewPort);

		CreateUICanvasDAO createCanvas = new CreateUICanvasDAO();
		createCanvas.setCanvasName("Canvas1");
		createCanvas.setCanvasType(MetamodelObjectType.StackableCanvas.name());
		createCanvas.setParentUUID(createForm.getUUID());
		createCanvas.setUUID(UUID.randomUUID().toString());
		CreateUICanvas.load(rf, context, createCanvas);

		EventDAO event = new EventDAO();
		event.setParentUUID(createUIViewPort.getUUID());
		event.setDstUUID(createCanvas.getUUID());
		event.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2UIElement
				.name());
		CreateEventUIElement2UIElement.load(rf, context, event);

		CreateUICellDAO createUICell = new CreateUICellDAO();
		createUICell.setColumnNumber(2);
		createUICell.setParentUUID(createCanvas.getUUID());
		createUICell.setUUID(UUID.randomUUID().toString());
		CreateUICell.load(rf, context, createUICell);

		DataLink lnk = (DataLink) context.get(dropdowntestDataLink.getUUID());

		CreateUIDropDownListDAO createUIDropDownList = new CreateUIDropDownListDAO();
		createUIDropDownList.setParentUUID(createUICell.getUUID());
		createUIDropDownList.setLabel("Department Id");
		createUIDropDownList.setUUID(UUID.randomUUID().toString());
		CreateUIDropDownList.load(rf, context, createUIDropDownList);

		event = new EventDAO();
		event.setParentUUID(createUIDropDownList.getUUID());
		event.setDstUUID(lnk.getField("departmentId").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIDropDownList.getUUID());
		event.setDstUUID(lnk.getUuid());
		CreateEventGetCurrentRow.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIDropDownList.getUUID());
		event.setDstUUID(departmentsDataLink.getUUID());
		CreateEventGetOptionsList.load(rf, context, event);

		CreateOptionDescriptorDAO dispOption = new CreateOptionDescriptorDAO();
		dispOption.setValue1("departmentName");
		dispOption.setValue2("departmentId");
		dispOption.setParentUUID(createUIDropDownList.getUUID());
		CreateDisplayFieldSpecifier.load(rf, context, dispOption);

		createUIDropDownList = new CreateUIDropDownListDAO();
		createUIDropDownList.setParentUUID(createUICell.getUUID());
		createUIDropDownList.setLabel("Employee Id");
		createUIDropDownList.setUUID(UUID.randomUUID().toString());
		CreateUIDropDownList.load(rf, context, createUIDropDownList);

		event = new EventDAO();
		event.setParentUUID(createUIDropDownList.getUUID());
		event.setDstUUID(lnk.getField("employeeId").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIDropDownList.getUUID());
		event.setDstUUID(lnk.getUuid());
		CreateEventGetCurrentRow.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIDropDownList.getUUID());
		event.setDstUUID(employeesDataLink.getUUID());
		CreateEventGetOptionsList.load(rf, context, event);

		dispOption = new CreateOptionDescriptorDAO();
		dispOption.setValue1("firstName");
		dispOption.setValue2("employeeId");
		dispOption.setParentUUID(createUIDropDownList.getUUID());
		CreateDisplayFieldSpecifier.load(rf, context, dispOption);

		Form frm = (Form) context.get("DropDownForm");
		uch.saveUIContainer(uicontainer, frm);

	}

	public static CreateDataLink2BusinessObjectMethodDAO findMethod(
			RepositoryFactory rf, CreateDataLink2BusinessObjectMethodDAO command) {

		Helper.findBusinessObject(rf, command.getDomain(),
				command.getFunctionalDomain(), command.getBusinessObjectName());
		MethodReferenceHandler mrh = rf.getRoot().getFunctionalDomain()
				.getBusinessObjectsHandler().getMethodReferenceHandler();
		Iterator<MethodReferenceDAO> itr = mrh.cleanSearch().getList();
		String value = null;
		if (command.getMethodType().equals("SearchTrigger"))
			value = "find";
		else
			value = command.getMethodType().toLowerCase();

		while (itr.hasNext()) {
			MethodReferenceDAO refMethod = itr.next();
			MethodDAO method = mrh.getMethodHandler().getObject();
			if (value.contains(method.getMethod().toLowerCase())) {
				command.setRefMethod(refMethod.getObjId());
				break;
			}
		}

		return command;

	}
	/*
	 * public static void main(String [] args){ try {
	 * 
	 * RepositoryFactory rf = new RepositoryFactory();
	 * 
	 * 
	 * HashMap<String, Object> context = new HashMap<String, Object>(); new
	 * PopulateDropDownForm().execute(rf, context);
	 * 
	 * // new PopulateRecipe().execute(rf);
	 * 
	 * 
	 * rf.saveModel();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * }
	 */
}
