package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.GrantAccessApplicationRef;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.GrantAccessRoleRef;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridDropDownColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainPackage;

public class RolesPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}

	public RolesPropertySelection() {
		ds = new RolesDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new ApplicationColumn(table, this, 0));
			columnList.add(new RoleColumn(table, this, 1));
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

		// Create and configure the "Add" button
		Button add = new Button(composite, SWT.PUSH | SWT.CENTER);
		add.setText("Add");

		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		add.setLayoutData(gridData);
		add.addSelectionListener(new SelectionAdapter() {

			// Add the selection and refresh the view
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

	
	class ApplicationColumn extends GridDropDownColumn {

		public ApplicationColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setDropDownDataAdapter(new GrantAccessApplicationRef());
			this.setColumnName("Application");
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));

				EObject types = getModel();

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::DomainApplication.allInstances()->asOrderedSet()->select(r|r.oclAsType(domain::DomainApplication).name <> null)");

				Collection<domain.DomainApplication> map = (Collection<domain.DomainApplication>) ocl.evaluate(types, query);

				Map<String, Object> rows = new LinkedHashMap<>();
				for (domain.DomainApplication p : map) {
					rows.put(p.getName(), p);
				}
				return rows;
			} catch (Exception e) {
				LogUtil.log(e);
			}
			return null;
		}

	}
	
	
	
	class RoleColumn extends GridDropDownColumn {

		public RoleColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setDropDownDataAdapter(new GrantAccessRoleRef());
			this.setColumnName("Role");
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));

				if (base == null)
					return new LinkedHashMap<>();
				domain.DomainApplication app = ((domain.GrantAccess) base).getApplicationRef();
				if (app == null)
					return new LinkedHashMap<>();

				Collection<domain.Role> map  = app.getApplication().getApplicationRole().getRoles().getRoles();
				
				Map<String, Object> rows = new LinkedHashMap<>();
				for (domain.Role p : map) {
					rows.put(p.getName(), p);
				}
				return rows;
			} catch (Exception e) {
				LogUtil.log(e);
			}
			return null;
		}

	}
	
}
