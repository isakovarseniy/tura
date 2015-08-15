package org.tura.metamodel.commons.editparts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;

public class OrderedDefaultSizeNodeFigure extends DefaultSizeNodeFigure {

	private int order;

	public OrderedDefaultSizeNodeFigure(Dimension defSize) {
		super(defSize);
	}

	public OrderedDefaultSizeNodeFigure(int i, int j) {
		super(i, j);
	}

	public void setOrder(int order) {
		this.firePropertyChange("order", new Integer(this.order), new Integer(order));
		this.order = order;
	}

}
