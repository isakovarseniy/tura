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
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.DomainTypePointerPackageRef;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.DomainTypePointerTypeRef;
import org.tura.metamodel.commons.properties.selections.adapters.textdata.ParametersName;
import org.tura.metamodel.commons.properties.selections.adapters.textdata.ParametersOrder;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridDropDownColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;
import org.tura.metamodel.commons.properties.selections.grid.GridTextColumn;

import domain.DomainPackage;

public class ParameterPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}

	public ParameterPropertySelection() {
		ds = new ParameterDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new ParameterColumn(table, this,0));
			columnList.add(new PackageColumn(table, this, 1));
			columnList.add(new TypeColumn(table, this, 2));
			columnList.add(new OrderColumn(table, this,3));

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

	class TypeColumn extends GridDropDownColumn {

		public TypeColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setDropDownDataAdapter(new DomainTypePointerTypeRef());
			this.setColumnName("Type");
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
				domain.Package pkg = ((domain.Parameter) base).getPackageRef();
				if (pkg == null)
					return new LinkedHashMap<>();

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).uid='"
								+ pkg.getUid()
								+ "').oclAsType(domain::Package).typedefinition.types->"
								+ "select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name <> null)  "
								+ "or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name <> null)"
								+ "or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name <> null)"
								+ ")->sortedBy(r|r.name)");

				Collection<domain.TypeElement> map = (Collection<domain.TypeElement>) ocl.evaluate(pkg, query);

				Map<String, Object> rows = new LinkedHashMap<>();
				for (domain.TypeElement p : map) {
					rows.put(p.getName(), p);
				}
				return rows;
			} catch (Exception e) {
				LogUtil.log(e);
			}
			return null;
		}

	}


	class PackageColumn extends GridDropDownColumn {

		public PackageColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setDropDownDataAdapter(new DomainTypePointerPackageRef());
			this.setColumnName("Package");
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
						.createQuery("domain::Package.allInstances()->asOrderedSet()->select(r|r.oclIsKindOf(domain::Package) and  r.oclAsType(domain::Package).name <> null)");

				Collection<domain.Package> map = (Collection<domain.Package>) ocl.evaluate(types, query);

				Map<String, Object> rows = new LinkedHashMap<>();
				for (domain.Package p : map) {
					rows.put(p.getName(), p);
				}
				return rows;
			} catch (Exception e) {
				LogUtil.log(e);
			}
			return null;
		}

	}
	
	class ParameterColumn extends GridTextColumn{
	
		public ParameterColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new ParametersName());
			this.setColumnName("Parameter");
		}
		
	}

	class OrderColumn extends GridTextColumn{
		
		public OrderColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new ParametersOrder());
			this.setColumnName("Order");
		}
		
	}

}
