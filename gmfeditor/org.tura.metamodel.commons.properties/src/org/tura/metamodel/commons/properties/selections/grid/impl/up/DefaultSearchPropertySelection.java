package org.tura.metamodel.commons.properties.selections.grid.impl.up;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.ContextParameterOperation;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.ContextParameterRefObjToAttribure;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridDropDownColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.Comparator;
import domain.DataControl;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.Type;
import domain.TypeElement;

public class DefaultSearchPropertySelection extends ContextParameterPropertySelection {

	@Override
	public EObject getModel() {
		if (((domain.DataControl) getEObject()).getDefaultSearch() == null) {
			EditingDomain editingDomain = ((DiagramEditor) this.getPart()).getEditingDomain();

			domain.ContextParameters ctx = DomainFactory.eINSTANCE.createContextParameters();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, getEObject(),
							DomainPackage.eINSTANCE.getDataControl_DefaultSearch(), ctx));
		}
		return ((domain.DataControl) getEObject()).getDefaultSearch();
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new FieldsColumn(table, this, 0));
			columnList.add(new OperationColumn(table, this, 1));
			columnList.add(new IsExpressioinColumn(table, this, 2));
			columnList.add(new ValueColumn(table, this, 3));
		}
		return columnList;
	}

	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		super.createControls(composite, aTabbedPropertySheetPage);
		createButtons(composite, aTabbedPropertySheetPage);
	}

	private void createButtons(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);

		// Create and configure the "Delete" button
		Button add = new Button(composite, SWT.PUSH | SWT.CENTER);
		add.setText("Add");
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		add.setLayoutData(gridData);

		add.addSelectionListener(new SelectionAdapter() {

			// Remove the selection and refresh the view
			public void widgetSelected(SelectionEvent e) {
				addRow();
			}
		});

		// Create and configure the "Delete" button
		Button delete = new Button(composite, SWT.PUSH | SWT.CENTER);
		delete.setText("Delete");
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		delete.setLayoutData(gridData);

		delete.addSelectionListener(new SelectionAdapter() {

			// Remove the selection and refresh the view
			public void widgetSelected(SelectionEvent e) {
				Object row = ((IStructuredSelection) tableViewer.getSelection()).getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});

	}

	class FieldsColumn extends GridDropDownColumn {

		public FieldsColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setColumnName("Column");
			setDropDownDataAdapter(new ContextParameterRefObjToAttribure());
		}

		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {
			domain.DataControl dc = (DataControl) this.getProperty().getEObject();

			domain.Type type = null;

			if (dc.getCreate() != null && dc.getCreate().getMethodRef() != null
					&& dc.getCreate().getMethodRef().getReturnValue() != null) {
				type = (Type) dc.getCreate().getMethodRef().getReturnValue().getTypeRef();
			}
			if (dc.getBaseType() != null)
				type = dc.getBaseType();

			List<domain.Attribute> attributes = initOptions(type);

			LinkedHashMap<String, Object> ls = new LinkedHashMap<>();
			for (domain.Attribute attr : attributes)
				ls.put(attr.getName(), attr);

			return ls;
		}

	}

	public List<domain.Attribute> initOptions(domain.Type type) {
		List<domain.Attribute> attrs = new ArrayList<>();

		if (type.getExtension().size() != 0) {
			for (Iterator<domain.TypeExtension> itr = type.getExtension().iterator(); itr.hasNext();) {
				TypeElement typeElement = itr.next().getTarget();
				if (typeElement instanceof domain.Type)
					attrs.addAll(initOptions((Type) typeElement));

				if (typeElement instanceof domain.TypeReference)
					attrs.addAll(initOptions((Type) ((domain.TypeReference) typeElement).getTypeRef()));
			}
		}
		attrs.addAll(type.getAttributes());
		return attrs;
	}

	class OperationColumn extends GridDropDownColumn {

		public OperationColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setColumnName("Operation");
			setDropDownDataAdapter(new ContextParameterOperation());
		}

		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {

			Map<String, Object> ls = new LinkedHashMap<>();

			for (Comparator cmpval : Comparator.values()) {
				ls.put(cmpval.getName(), cmpval);
			}

			return ls;
		}

	}

	@Override
	public String contextRefNameExtreactor(domain.ContextParameter obj) {
		return ((domain.Attribute) obj.getRefObj()).getName();
	}

	@Override
	public domain.TypeElement contextRefTypeExtreactor(domain.ContextParameter obj) {
		return ((domain.Attribute) obj.getRefObj()).getTypeRef();
	}

	@Override
	protected DataSource getDS() {
		return new DefaultContextParametersDS(this);
	}

}
