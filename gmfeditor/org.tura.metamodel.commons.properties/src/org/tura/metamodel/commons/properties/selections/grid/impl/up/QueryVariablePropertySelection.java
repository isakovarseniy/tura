package org.tura.metamodel.commons.properties.selections.grid.impl.up;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Table;
import org.tura.metamodel.commons.properties.selections.adapters.textdata.QueryVariableName;
import org.tura.metamodel.commons.properties.selections.adapters.textdata.QueryVariableValue;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;
import org.tura.metamodel.commons.properties.selections.grid.GridTextColumn;


public class QueryVariablePropertySelection extends GridProperty{

	private List<GridColumn> columnList;
	
	@Override
	public EObject getModel() {
		return getEObject();
	}
	
	public QueryVariablePropertySelection(){
		ds = new QueryVariableDS(this);
	}
	
	@Override
	public List<GridColumn> getColumns() {
        if (columnList == null ){
        	columnList = new ArrayList<GridColumn>();
        	columnList.add(new OptionColumn(table, this,0));
        	columnList.add(new ValueColumn(table, this,1));
        }
		return columnList;
	}


	class OptionColumn extends GridTextColumn{

		public OptionColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new QueryVariableName());
			this.setColumnName("Option");
		}
		@Override
		public boolean isModify(Object element, String property) {
			return false;
		}
		
	}
	
	class ValueColumn extends GridTextColumn{

		public ValueColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new QueryVariableValue());
			this.setColumnName("Value");
		}
		
	}
	
}
