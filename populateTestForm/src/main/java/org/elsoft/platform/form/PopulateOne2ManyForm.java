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

import org.elsoft.platform.OrderType;
import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.metamodel.MetamodelObjectType;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.layers.uicontainer.UiContainerHandler;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.CreateFormDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDataLinkDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultOrderByDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIButtonDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICanvasDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICellDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIGridDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIInputTextDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIViewPortDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIWindowDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectMethodDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2DataLinkDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateMethodParameterExpressionDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO;
import org.elsoft.platform.metamodel.objects.ui.UIContainerDAO;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2BusinessObject;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2BusinessObjectMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDefaultOrderBy;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetCurrentRow;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetList;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventTrigger;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateForm;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateMethodParameterExpression;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIButton;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUICanvas;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUICell;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIGrid;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIInputText;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIViewPort;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIWindow;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.platform.metamodel.types.MethodReferenceHandler;

public class PopulateOne2ManyForm {

	public void execute(RepositoryFactory rf, HashMap<String, Object> context)
			throws Exception {
		UiContainerHandler uch = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer();

		UIContainerDAO uicontainer = uch.addUIContainer("One2ManyForm");

		CreateFormDAO createForm = new CreateFormDAO();
		createForm.setFormName("One2ManyForm");
		createForm.setUUID(UUID.randomUUID().toString());
		CreateForm.load(rf, context, createForm);

		CreateDataLinkDAO departmentsDataLink = new CreateDataLinkDAO();
		departmentsDataLink.setParentUUID(createForm.getUUID());
		departmentsDataLink.setUUID(UUID.randomUUID().toString());
		departmentsDataLink.setDataLinkName("departments");
		CreateDataLink.load(rf, context, departmentsDataLink);

		CreateDefaultOrderByDAO defaultOrderBy = new CreateDefaultOrderByDAO();
		defaultOrderBy.setParentUUID(departmentsDataLink.getUUID());
		defaultOrderBy.setColumnName("departmentId");
		defaultOrderBy.setOrder(OrderType.ASC.name());
		CreateDefaultOrderBy.load(rf, context, defaultOrderBy);

		CreateDataLink2BusinessObjectDAO createDataLink2BusinessObject = new CreateDataLink2BusinessObjectDAO();
		createDataLink2BusinessObject.setDomain("Manufacturing");
		createDataLink2BusinessObject.setFunctionalDomain("BackOffice");
		createDataLink2BusinessObject.setBusinessObjectName("departments");
		createDataLink2BusinessObject.setParentUUID(departmentsDataLink
				.getUUID());
		CreateDataLink2BusinessObject.load(rf, context,
				createDataLink2BusinessObject);

		CreateDataLink2BusinessObjectMethodDAO createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
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

		CreateMethodParameterExpressionDAO methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("One2ManyFormbinding.departments.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(departmentsDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod.setMethodType(DCMetaInfo.SearchTrigger
				.name());
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
				.setExpression("One2ManyFormbinding.departments.currentRow");
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
				.setExpression("One2ManyFormbinding.departments.currentRow");
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
				.setExpression("One2ManyFormbinding.departments.currentRow");
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
				.setExpression("One2ManyFormbinding.employees.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(employeesDataLink
				.getUUID());
		createDataLink2BusinessObjectMethod.setMethodType(DCMetaInfo.SearchTrigger
				.name());
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
				.setExpression("One2ManyFormbinding.employees.currentRow");
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
				.setExpression("One2ManyFormbinding.employees.currentRow");
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
				.setExpression("One2ManyFormbinding.employees.currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		CreateDataLink2DataLinkDAO createDataLink2DataLink = new CreateDataLink2DataLinkDAO();
		createDataLink2DataLink.setParentUUID(departmentsDataLink.getUUID());
		createDataLink2DataLink.setDstUUID(employeesDataLink.getUUID());
		createDataLink2DataLink.setRelationName("detartments2employes");
		createDataLink2DataLink.setMasterField("objId");
		createDataLink2DataLink.setDetailField("departmentId");
		CreateDataLink2DataLink.load(rf, context, createDataLink2DataLink);

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
		createUICell.setColumnNumber(1);
		createUICell.setParentUUID(createCanvas.getUUID());
		createUICell.setUUID(UUID.randomUUID().toString());
		CreateUICell.load(rf, context, createUICell);

		CreateUICellDAO create4ColUICell = new CreateUICellDAO();
		create4ColUICell.setParentUUID(createUICell.getUUID());
		create4ColUICell.setUUID(UUID.randomUUID().toString());
		create4ColUICell.setColumnNumber(4);
		CreateUICell.load(rf, context, create4ColUICell);

		CreateUIButtonDAO createUIButton = new CreateUIButtonDAO();
		createUIButton.setLabel("Prev");
		createUIButton.setParentUUID(create4ColUICell.getUUID());
		createUIButton.setUUID(UUID.randomUUID().toString());
		CreateUIButton.load(rf, context, createUIButton);

		event = new EventDAO();
		event.setParentUUID(createUIButton.getUUID());
		event.setDstUUID(departmentsDataLink.getUUID());
		event.setEventType(MetamodelTriggerEventsType.CreateEventPrevRecord.name());
		CreateEventTrigger.load(rf, context, event);

		createUIButton = new CreateUIButtonDAO();
		createUIButton.setLabel("Next");
		createUIButton.setParentUUID(create4ColUICell.getUUID());
		createUIButton.setUUID(UUID.randomUUID().toString());
		CreateUIButton.load(rf, context, createUIButton);

		event = new EventDAO();
		event.setParentUUID(createUIButton.getUUID());
		event.setDstUUID(departmentsDataLink.getUUID());
		event.setEventType(MetamodelTriggerEventsType.CreateEventNextRecord.name());
		CreateEventTrigger.load(rf, context, event);

		CreateUICellDAO create2RowUICell = new CreateUICellDAO();
		create2RowUICell.setColumnNumber(2);
		create2RowUICell.setParentUUID(createUICell.getUUID());
		create2RowUICell.setUUID(UUID.randomUUID().toString());
		CreateUICell.load(rf, context, create2RowUICell);

		DataLink lnk = (DataLink) context.get(departmentsDataLink.getUUID());

		CreateUIInputTextDAO createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(create2RowUICell.getUUID());
		createUIInputText.setUUID(UUID.randomUUID().toString());
		createUIInputText.setLabel("Department Id");
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("departmentId").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getUuid());
		CreateEventGetCurrentRow.load(rf, context, event);
	
		
		createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(create2RowUICell.getUUID());
		createUIInputText.setUUID(UUID.randomUUID().toString());
		createUIInputText.setLabel("Department name");
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("departmentName").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getUuid());
		CreateEventGetCurrentRow.load(rf, context, event);

		lnk = (DataLink) context.get(employeesDataLink.getUUID());

		CreateUIGridDAO createUIGrid = new CreateUIGridDAO();
		createUIGrid.setParentUUID(createUICell.getUUID());
		createUIGrid.setUUID(UUID.randomUUID().toString());
		createUIGrid.setColumnNumber(4);
		createUIGrid.setRowNumber(5);
		createUIGrid.setLabel("Employees");
		CreateUIGrid.load(rf, context, createUIGrid);

		event = new EventDAO();
		event.setParentUUID(createUIGrid.getUUID());
		event.setDstUUID(employeesDataLink.getUUID());
		event.setEventType(MetamodelTriggerEventsType.CreateEventGetList.name());
		CreateEventGetList.load(rf, context, event);

		createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(createUIGrid.getUUID());
		createUIInputText.setUUID(UUID.randomUUID().toString());
		createUIInputText.setLabel("Employee Id");
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("employeeId").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(createUIGrid.getUUID());
		createUIInputText.setLabel("FirstName Id");
		createUIInputText.setUUID(UUID.randomUUID().toString());
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("firstName").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(createUIGrid.getUUID());
		createUIInputText.setUUID(UUID.randomUUID().toString());
		createUIInputText.setLabel("LastName Id");
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("lastName").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(createUIGrid.getUUID());
		createUIInputText.setUUID(UUID.randomUUID().toString());
		createUIInputText.setLabel("Email Id");
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("email").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		CreateUICellDAO create4RawUICell = new CreateUICellDAO();
		create4RawUICell.setParentUUID(createUICell.getUUID());
		create4RawUICell.setUUID(UUID.randomUUID().toString());
		create4RawUICell.setColumnNumber(4);
		CreateUICell.load(rf, context, create4RawUICell);

		createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(create4RawUICell.getUUID());
		createUIInputText.setUUID(UUID.randomUUID().toString());
		createUIInputText.setLabel("PhoneNumber Id");
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("phoneNumber").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getUuid());
		CreateEventGetCurrentRow.load(rf, context, event);

		createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(create4RawUICell.getUUID());
		createUIInputText.setUUID(UUID.randomUUID().toString());
		createUIInputText.setLabel("Salary Id");
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("salary").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getUuid());
		CreateEventGetCurrentRow.load(rf, context, event);

		createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(create4RawUICell.getUUID());
		createUIInputText.setLabel("CommissionPct Id");
		createUIInputText.setUUID(UUID.randomUUID().toString());
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("commissionPct").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getUuid());
		CreateEventGetCurrentRow.load(rf, context, event);

		createUIInputText = new CreateUIInputTextDAO();
		createUIInputText.setParentUUID(create4RawUICell.getUUID());
		createUIInputText.setLabel("Department Id");
		createUIInputText.setUUID(UUID.randomUUID().toString());
		CreateUIInputText.load(rf, context, createUIInputText);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getField("departmentId").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);

		event = new EventDAO();
		event.setParentUUID(createUIInputText.getUUID());
		event.setDstUUID(lnk.getUuid());
		CreateEventGetCurrentRow.load(rf, context, event);

		Form frm = (Form) context.get("One2ManyForm");
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
	
}
