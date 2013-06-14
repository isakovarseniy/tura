package org.tura.metamodel.commons.editparts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.layout.FreeFormLayoutEx;

public class HTMLLikeLayout extends FreeFormLayoutEx {
	
	/**
	 * Whether to ignore invisible children
	 */
	private boolean ignoreInvisibleChildren = true;
	
	/**
	 * Number of columns
	 */
	private int columns = 3;

	/**
	 * min width
	 */
	private int minWidth = 20;

	/**
	 * min high
	 */
	private int minHigh = 10;

	/**
	 * Gets the list of children after applying the layout options of
	 * ignore invisible children & reverse children
	 */
	private List<IFigure> getChildren(IFigure container) {
		@SuppressWarnings("unchecked")
		List<IFigure> children = new ArrayList<IFigure>(container.getChildren());
		if (getIgnoreInvisibleChildren()) {
			Iterator<IFigure> iter = children.iterator();
			while (iter.hasNext()) {
				IFigure f =  iter.next();
				if (!f.isVisible())
					iter.remove();
			}
		}
		return children;
	}
	/**
	 * @return Whether to ignore invisible children or not
	 */
	public boolean getIgnoreInvisibleChildren() {
		return ignoreInvisibleChildren;
	}
	
	
	
	
	@Override
	public void layout(IFigure parent) {
		super.layout(parent);
		calculateLayout(parent);
	}
	
	
	protected Dimension calculateLayout(IFigure parent){
		
		List<IFigure> children = getChildren(parent);
		
		Collections.sort(children, new Order());
	    ArrayList<ArrayList<IFigure>> grid = new ArrayList<ArrayList<IFigure>>();
	    
	    //Make grid
    	ArrayList<IFigure> row = null;
	    for (int i = 0, rowIndex=0, colIndex=0; i < children.size();i++){
	    	if (grid.size() <= rowIndex ){
	    		 row = new ArrayList<IFigure>();
	    		 grid.add(row);
	    	}
	    	row.add(children.get(i));
	    	colIndex++;
	    	if (colIndex == columns){
	    		colIndex=0;
	    		rowIndex++;
	    	}
	    }
	    
	    // Calculate column with  and high
	    int [] colWidth = new int[columns];
	    for (int i=0; i < columns; i++)
	    	colWidth[i] = minWidth;

	    int [] rowHigh = new int[grid.size()];
	    for (int i=0; i < grid.size(); i++)
	    	rowHigh[i] = minHigh;
	    
	    
        for (int i = 0 ; i <grid.size(); i++){
        	row = grid.get(i);
        	for (int j= 0; j < row.size();j++ ){
        		colWidth[j] = Math.max(colWidth[j], row.get(j).getBounds().width);
        		rowHigh[i] = Math.max(rowHigh[i], row.get(j).getBounds().height);
        	}
        }
		
       int xOffset = parent.getClientArea().x;
       int yOffset = parent.getClientArea().y;
        for (int i = 0 ; i <grid.size(); i++){
        	row = grid.get(i);
            xOffset = parent.getClientArea().x;
        	for (int j= 0; j < row.size();j++ ){
        		Rectangle bounds = new Rectangle(xOffset, yOffset,row.get(j).getBounds().width, row.get(j).getBounds().height);
        		row.get(j).setBounds(bounds);
        		xOffset =xOffset +colWidth[j];
        	}
        	yOffset =yOffset +rowHigh[i];
        }
        
        
        return new Dimension(xOffset,yOffset);
	}
	
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		if (this.columns < 1)
			return;
		this.columns = columns;
	}
	
	class Order implements Comparator<IFigure>{

		@Override
		public int compare(IFigure o1, IFigure o2) {
			Rectangle f1 = o1.getBounds();
			Rectangle f2 = o2.getBounds();
			
			if (f1.y > f2.y)
				return 1;
			if (f1.y < f2.y)
				return -1;
			if (f1.x > f2.x)
				return 1;
			if (f1.x <  f2.x)
				return -1;
			return 0;
		}

		
	}

}
