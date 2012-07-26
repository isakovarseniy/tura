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
package org.eclipse.wb.elsoft.propertyeditor;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.e4.xwt.elsoft.types.TriggerProperty;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.core.model.ObjectInfo;
import org.eclipse.wb.elsoft.propertyeditor.ExpressionLeaf;
import org.eclipse.wb.elsoft.propertyeditor.PPParameterLeaf;
import org.eclipse.wb.elsoft.propertyeditor.ValueLeaf;
import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.model.property.editor.PropertyEditor;
import org.eclipse.wb.internal.core.model.property.editor.presentation.ButtonPropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.editor.presentation.PropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.table.PropertyTable;
import org.eclipse.wb.internal.core.xml.model.clipboard.IClipboardSourceProvider;
import org.eclipse.wb.internal.core.xml.model.property.GenericProperty;
import org.eclipse.wb.internal.core.xml.model.property.GenericPropertyImpl;
import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class TriggerPropertyEditor extends PropertyEditor implements
		IClipboardSourceProvider {

	private final PropertyEditorPresentation m_presentation = new ButtonPropertyEditorPresentation() {
		@Override
		protected void onClick(PropertyTable propertyTable, Property property)
				throws Exception {
			openDialog(property);
		}
	};

	@Override
	public String getClipboardSource(GenericProperty property) throws Exception {
		return null;
	}

	@Override
	public PropertyEditorPresentation getPresentation() {
		return m_presentation;
	}

	private TreeModel buildModel(JSONObject jsonObject,
			BusinessObjectProperty bo) {

		TreeModel root = new TreeModel("root", null);

		TriggerLeaf createTrigger = new TriggerLeaf(
				DCMetaInfo.CreateTrigger.name(), root);
		JSONObject obj = null;
		if (jsonObject != null)
			obj = (JSONObject) jsonObject.get(DCMetaInfo.CreateTrigger.name());
		new CallLeaf("Call", createTrigger, obj, bo);
		new ParameterLeaf("Parameter", createTrigger, obj, bo);

		TriggerLeaf updateTrigger = new TriggerLeaf(
				DCMetaInfo.UpdateTrigger.name(), root);
		obj = null;
		if (jsonObject != null)
			obj = (JSONObject) jsonObject.get(DCMetaInfo.UpdateTrigger.name());
		new CallLeaf("Call", updateTrigger, obj, bo);
		new ParameterLeaf("Parameter", updateTrigger, obj, bo);

		TriggerLeaf insertTrigger = new TriggerLeaf(
				DCMetaInfo.InsertTrigger.name(), root);
		obj = null;
		if (jsonObject != null)
			obj = (JSONObject) jsonObject.get(DCMetaInfo.InsertTrigger.name());
		new CallLeaf("Call", insertTrigger, obj, bo);
		new ParameterLeaf("Parameter", insertTrigger, obj, bo);

		TriggerLeaf removeTrigger = new TriggerLeaf(
				DCMetaInfo.RemoveTrigger.name(), root);
		obj = null;
		if (jsonObject != null)
			obj = (JSONObject) jsonObject.get(DCMetaInfo.RemoveTrigger.name());
		new CallLeaf("Call", removeTrigger, obj, bo);
		new ParameterLeaf("Parameter", removeTrigger, obj, bo);

		TriggerLeaf searchTrigger = new TriggerLeaf(
				DCMetaInfo.SearchTrigger.name(), root);
		obj = null;
		if (jsonObject != null)
			obj = (JSONObject) jsonObject.get(DCMetaInfo.SearchTrigger.name());
		new CallLeaf("Call", searchTrigger, obj, bo);
		new ParameterLeaf("Parameter", searchTrigger, obj, bo);

		return root;
	}

	private void openDialog(Property property) throws Exception {
		GenericProperty genericProperty = (GenericProperty) property;

		GenericPropertyImpl g = (GenericPropertyImpl) property;
		ObjectInfo obj = g.getObjectInfo();

		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		BusinessObjectProperty bo = (BusinessObjectProperty) obj
				.getPropertyByTitle("businessObject").getValue();

		TriggerProperty to = (TriggerProperty) obj.getPropertyByTitle(
				"triggerProperty").getValue();

		JSONObject jsonObject = null;
		if ((to != null) && (to.getStringObject() != Property.UNKNOWN_VALUE))
			jsonObject = (JSONObject) JSONValue.parse(to.getStringObject());

		TriggetPropertyDialog2 dialog = new TriggetPropertyDialog2(shell,
				new MethodLabelProvider(), new MyContentProvider(), bo);
		TreeModel root = buildModel(jsonObject, bo);
		dialog.setInput(root);

		if (dialog.open() == Window.OK) {
			String expression = serializeTriggers(root);
			genericProperty.setExpression("$$" + expression,
					Property.UNKNOWN_VALUE);
		}

	}

	@SuppressWarnings("unchecked")
	public String serializeTriggers(TreeModel root) {

		Map<String, Object> rootHash = new LinkedHashMap<String, Object>();
		Iterator<TreeModel> itr = root.child.iterator();
		while (itr.hasNext()) {
			TriggerLeaf triggerLeaf = (TriggerLeaf) itr.next();
			Map<String, Object> triggerMap = new LinkedHashMap<String, Object>();
			if (triggerLeaf.child != null) {
				if ((triggerLeaf.child.size() > 0)
						&& (triggerLeaf.child.get(0) instanceof CallLeaf)) {
					triggerMap.put("call",
							((CallLeaf) (triggerLeaf.child.get(0))).method);
				}

				if ((triggerLeaf.child.size() > 1)
						&& (triggerLeaf.child.get(1) instanceof ParameterLeaf)) {
					ParameterLeaf parameterLeaf = (ParameterLeaf) triggerLeaf.child
							.get(1);

					if (parameterLeaf.params != null) {
						Map<String, Object> parametersMap = new LinkedHashMap<String, Object>();
						Iterator<TreeModel> itrParam = parameterLeaf.params.child
								.iterator();
						while (itrParam.hasNext()) {
							PPParameterLeaf param = (PPParameterLeaf) itrParam
									.next();
							JSONArray list = new JSONArray();
							list.add(((ExpressionLeaf) (param.child.get(0))).expression);
							list.add(((ValueLeaf) (param.child.get(1))).value);
							parametersMap.put(param.nodeName, list);
						}
						triggerMap.put("parameters", parametersMap);
					}
				}
			}
			rootHash.put(triggerLeaf.nodeName, triggerMap);
		}
		return JSONValue.toJSONString(rootHash);
	}

	@Override
	public void paint(Property property, GC gc, int x, int y, int width,
			int height) throws Exception {
	}

	public class TriggerLeaf extends TreeModel {
		public TriggerLeaf(String nodeName, TreeModel parent) {
			super(nodeName, parent);
		}

	}

	public class ParameterLeaf extends TreeModel {
		public TreeModel params;
		public JSONObject obj;
		public BusinessObjectProperty bo;

		public ParameterLeaf(String nodeName, TreeModel parent, JSONObject obj,
				BusinessObjectProperty bo) {
			super(nodeName, parent);
			if (obj != null)
				obj = (JSONObject) obj.get("parameters");
			this.obj = obj;
			this.bo = bo;
		}
	}

	public class CallLeaf extends TreeModel {
		public MethodDAO methodObj;
		public String method;
		public BusinessObjectProperty bo;

		public CallLeaf(String nodeName, TreeModel parent, JSONObject obj,
				BusinessObjectProperty bo) {
			super(nodeName, parent);
			if (obj != null)
				method = (String) obj.get("call");
			this.bo = bo;
		}
	}

	private class MethodLabelProvider extends BaseLabelProvider implements
			ILabelProvider {
		public Image getImage(Object element) {
			return null;
		}

		public String getText(Object element) {
			if (element instanceof CallLeaf) {
				CallLeaf leaf = (CallLeaf) element;
				if (leaf.method == null)
					return leaf.nodeName;
				else
					return leaf.nodeName + " - " + leaf.method;
			}
			if (element instanceof ParameterLeaf) {
				ParameterLeaf leaf = (ParameterLeaf) element;
				if (leaf.params == null)
					return leaf.nodeName;
				else
					return leaf.nodeName + " - set";
			}
			return ((TreeModel) element).nodeName;
		}
	}

	private class MyContentProvider implements ITreeContentProvider {

		public Object[] getElements(Object inputElement) {
			return ((TreeModel) inputElement).child.toArray();
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getChildren(Object parentElement) {
			return getElements(parentElement);
		}

		public Object getParent(Object element) {
			if (element == null) {
				return null;
			}
			return ((TreeModel) element).parent;
		}

		public boolean hasChildren(Object element) {
			return ((TreeModel) element).child.size() > 0;
		}

	}

}
