package org.tura.metamodel.commons.properties.selections.grid.impl.up;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
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
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.TranslationLang;
import org.tura.metamodel.commons.properties.selections.adapters.textdata.TranslationTranslation;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridDropDownColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;
import org.tura.metamodel.commons.properties.selections.grid.GridTextColumn;

public class TranslationsPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}
	
	public TranslationsPropertySelection() {
		ds = new TranslationsDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new TranslationColumn(table, this,0));
			columnList.add(new LangColumn(table, this,1));
		}
		return columnList;
	}

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		super.createControls(composite, aTabbedPropertySheetPage);
		createButtons(composite,aTabbedPropertySheetPage);
	}	
	
	private void createButtons(Composite parent,TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

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
				Object row = ((IStructuredSelection) tableViewer
						.getSelection()).getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});

	}
	
	
	
	class TranslationColumn extends GridTextColumn {

		public TranslationColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new TranslationTranslation());
			this.setColumnName("Translation");
		}
	}
	
	
	class LangColumn extends GridDropDownColumn {

		public LangColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			this.setColumnName("Value");
			setDropDownDataAdapter(new TranslationLang());
		}

		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {
			if (base == null)
				return new LinkedHashMap<>();

			List <domain.LanguageRef> langs =  ((domain.MessageLibrary)(((domain.Message)(base.eContainer())).eContainer())).getLibLanguages();
				
			if (langs == null)
				return new LinkedHashMap<>();

			Map<String, Object> ls = new LinkedHashMap<>();
			for (domain.LanguageRef lang : langs) {
				ls.put(lang.getLang().getLang(), lang);
			}
			return ls;
		}
	}	
}
