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

import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.metamodel.MetamodelObjectType;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.layers.uicontainer.UiContainerHandler;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.CreateFormDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDataLinkDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICanvasDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICellDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeLeafDAO;
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
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetTreeRoot;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateForm;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateMethodParameterExpression;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUICanvas;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUICell;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUITree;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUITreeLeaf;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIViewPort;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIWindow;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.platform.metamodel.types.MethodReferenceHandler;

public class PopulateTreeForm {
	RepositoryFactory rf;
	HashMap<String, Object> context;	
	public void execute(RepositoryFactory rf, HashMap<String, Object> context)
			throws Exception {
		this.rf=rf;
		this.context=context;
		
		UiContainerHandler uch = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer();

		UIContainerDAO uicontainer = uch.addUIContainer("TreeForm");

		CreateFormDAO createForm = new CreateFormDAO();
		createForm.setFormName("TreeForm");
		createForm.setUUID(UUID.randomUUID().toString());
		CreateForm.load(rf, context, createForm);

		CreateDataLinkDAO domainDataLink = createDataLink("domain", createForm);
		CreateDataLinkDAO functionalDomainDataLink = createDataLink("functionalDomain", createForm);
		CreateDataLinkDAO applicatioinDataLink = createDataLink("application", createForm);
		CreateDataLinkDAO uiContainerDataLink = createDataLink("UIContainer", createForm);
		
		createRelation(domainDataLink,functionalDomainDataLink);
		createRelation(functionalDomainDataLink,applicatioinDataLink);
		createRelation(applicatioinDataLink,uiContainerDataLink);
		
		
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
		
		CreateUITreeDAO createTree = new CreateUITreeDAO();
		createTree.setParentUUID(createUICell.getUUID());
		createTree.setUUID(UUID.randomUUID().toString());
		CreateUITree.load(rf, context, createTree);
		
		event = new EventDAO();
		event.setParentUUID(createTree.getUUID());
		event.setDstUUID(domainDataLink.getUUID());
		event.setEventType(MetamodelTriggerEventsType.CreateEventGetTreeRoot.name());
		CreateEventGetTreeRoot.load(rf, context, event);
		

		CreateUITreeLeafDAO treeLeaf = new CreateUITreeLeafDAO();
		treeLeaf.setParentUUID(createTree.getUUID());
		treeLeaf.setUUID(UUID.randomUUID().toString());
		CreateUITreeLeaf.load(rf, context, treeLeaf);
		
		DataLink lnk = (DataLink) context.get(domainDataLink.getUUID());

		event = new EventDAO();
		event.setParentUUID(treeLeaf.getUUID());
		event.setDstUUID(lnk.getField("name").getUuid());
		CreateEventUIElement2Field.load(rf, context, event);
		
		Form frm = (Form) context.get("TreeForm");
		uch.saveUIContainer(uicontainer, frm);
		
	}
	
	private void createRelation(CreateDataLinkDAO master, CreateDataLinkDAO detail){
		CreateDataLink2DataLinkDAO createDataLink2DataLink = new CreateDataLink2DataLinkDAO();
		createDataLink2DataLink.setParentUUID(master.getUUID());
		createDataLink2DataLink.setDstUUID(detail.getUUID());
		createDataLink2DataLink.setRelationName( master.getDataLinkName()+"2"+detail.getDataLinkName());
		createDataLink2DataLink.setMasterField("objId");
		createDataLink2DataLink.setDetailField("parentId");
		CreateDataLink2DataLink.load(rf, context, createDataLink2DataLink);

	}
	
	private CreateDataLinkDAO createDataLink(String objectName,CreateFormDAO createForm){

		CreateDataLinkDAO dataLink = new CreateDataLinkDAO();
		dataLink.setParentUUID(createForm.getUUID());
		dataLink.setUUID(UUID.randomUUID().toString());
		dataLink.setDataLinkName(objectName);
		CreateDataLink.load(rf, context, dataLink);
		
		
		CreateDataLink2BusinessObjectDAO createDataLink2BusinessObject = new CreateDataLink2BusinessObjectDAO();
		createDataLink2BusinessObject.setDomain("Manufacturing");
		createDataLink2BusinessObject.setFunctionalDomain("Commons");
		createDataLink2BusinessObject.setBusinessObjectName(objectName);
		createDataLink2BusinessObject.setParentUUID(dataLink
				.getUUID());
		CreateDataLink2BusinessObject.load(rf, context,
				createDataLink2BusinessObject);

		CreateDataLink2BusinessObjectMethodDAO createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.CreateTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("Commons");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName(objectName);
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		CreateMethodParameterExpressionDAO methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("TreeFormbinding."+objectName+".currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dataLink
				.getUUID());
		createDataLink2BusinessObjectMethod.setMethodType(DCMetaInfo.SearchTrigger
				.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("Commons");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName(objectName);
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.InsertTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("Commons");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName(objectName);
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("TreeFormbinding."+objectName+".currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.RemoveTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("Commons");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName(objectName);
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("TreeFormbinding."+objectName+".currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);

		createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
		createDataLink2BusinessObjectMethod.setParentUUID(dataLink
				.getUUID());
		createDataLink2BusinessObjectMethod
				.setMethodType(DCMetaInfo.UpdateTrigger.name());
		createDataLink2BusinessObjectMethod.setDomain("Manufacturing");
		createDataLink2BusinessObjectMethod.setFunctionalDomain("Commons");
		createDataLink2BusinessObjectMethod
				.setBusinessObjectName(objectName);
		createDataLink2BusinessObjectMethod = findMethod(rf,
				createDataLink2BusinessObjectMethod);
		CreateDataLink2BusinessObjectMethod.load(rf, context,
				createDataLink2BusinessObjectMethod);

		methodParameterExpression = new CreateMethodParameterExpressionDAO();
		methodParameterExpression.setParamName("obj");
		methodParameterExpression
				.setExpression("TreeFormbinding."+objectName+".currentRow");
		methodParameterExpression
				.setParentUUID(createDataLink2BusinessObjectMethod
						.getRefMethod().toString());
		CreateMethodParameterExpression.load(rf, context,
				methodParameterExpression);
		
		return dataLink;
		
	}
	public static CreateDataLink2BusinessObjectMethodDAO findMethod(
			RepositoryFactory rf, CreateDataLink2BusinessObjectMethodDAO command) {

		Helper.findBusinessObject(rf, command.getDomain(),
				command.getFunctionalDomain(), command.getBusinessObjectName());
		MethodReferenceHandler mrh = rf.getRoot().getFunctionalDomain()
				.getBusinessObjectsHandler().getMethodReferenceHandler();
		Iterator<MethodReferenceDAO> itr = mrh.cleanSearch().getList();
		while (itr.hasNext()) {
			MethodReferenceDAO refMethod = itr.next();
			MethodDAO method = mrh.getMethodHandler().getObject();
			if (command.getMethodType().toLowerCase()
					.contains(method.getMethod().toLowerCase())) {
				command.setRefMethod(refMethod.getObjId());
				break;
			}
		}

		return command;

	}
	
}
