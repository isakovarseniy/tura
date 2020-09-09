/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.diagram;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Figure;
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
	 * Gets the list of children after applying the layout options of ignore
	 * invisible children & reverse children
	 */
	private List<IFigure> getChildren(IFigure container) {
		@SuppressWarnings("unchecked")
		List<IFigure> children = new ArrayList<IFigure>(container.getChildren());
		if (getIgnoreInvisibleChildren()) {
			Iterator<IFigure> iter = children.iterator();
			while (iter.hasNext()) {
				IFigure f = iter.next();
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

	protected Dimension calculatePreferredSize(IFigure f, int wHint, int hHint) {
		return calculateLayout(f);
	}

	@Override
	public void layout(IFigure parent) {
		super.layout(parent);
		calculateLayout(parent);
	}

	public Dimension getPreferredSize(IFigure container, int wHint, int hHint) {
		return calculateLayout(container);
	}

	public void sort(List<IFigure> children){
		Collections.sort(children, new Order());
	}

	
	private void firePropertyChange(IFigure fig,int order){
		try{
		    Method m = Figure.class.getDeclaredMethod("firePropertyChange", String.class,Object.class,Object.class);
		    m.setAccessible(true);
		    m.invoke(fig, "order", -1,order);
		    
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	protected Dimension calculateLayout(IFigure parent) {

		removeConstraints(parent);

		List<IFigure> children = getChildren(parent);

		Collections.sort(children, new Order());
		int order = 0;
		for (IFigure fig: children){
			firePropertyChange(fig,order);
			order++;
		}

		ArrayList<ArrayList<IFigure>> grid = new ArrayList<ArrayList<IFigure>>();

		// Make grid
		ArrayList<IFigure> row = null;
		for (int i = 0, rowIndex = 0, colIndex = 0; i < children.size(); i++) {
			if (grid.size() <= rowIndex) {
				row = new ArrayList<IFigure>();
				grid.add(row);
			}
			row.add(children.get(i));
			colIndex++;
			if (colIndex == columns) {
				colIndex = 0;
				rowIndex++;
			}
		}

		// Calculate column with and high
		int[] colWidth = new int[columns];
		for (int i = 0; i < columns; i++)
			colWidth[i] = minWidth;

		int[] rowHigh = new int[grid.size()];
		for (int i = 0; i < grid.size(); i++)
			rowHigh[i] = minHigh;

		for (int i = 0; i < grid.size(); i++) {
			row = grid.get(i);
			for (int j = 0; j < row.size(); j++) {
				colWidth[j] = Math.max(colWidth[j], row.get(j).getBounds().width);
				rowHigh[i] = Math.max(rowHigh[i], row.get(j).getBounds().height);
			}
		}

		int xOffset = 0;
		int yOffset = 0;
		for (int i = 0; i < grid.size(); i++) {
			row = grid.get(i);
			xOffset = 0;
			for (int j = 0; j < row.size(); j++) {
				Rectangle bounds = new Rectangle(xOffset, yOffset, row.get(j).getBounds().width,
						row.get(j).getBounds().height);
				row.get(j).setBounds(bounds);
				xOffset = xOffset + colWidth[j];
			}
			yOffset = yOffset + rowHigh[i];
		}

		return new Dimension(xOffset, yOffset);
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		if (this.columns < 1)
			return;
		this.columns = columns;
	}

	private void removeConstraints(IFigure figure) {
		IFigure parent = figure.getParent();

		if (parent != null) {
			if (parent.getLayoutManager() != null) {
				Object obj = parent.getLayoutManager().getConstraint(figure);
				if (obj != null) {
					if (obj instanceof Rectangle) {
						((Rectangle) obj).height = -1;
						((Rectangle) obj).width = -1;
					}
				}
			}
			removeConstraints(parent);
		}

	}

	class Order implements Comparator<IFigure> {

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
			if (f1.x < f2.x)
				return -1;
			return 0;
		}

	}

}
