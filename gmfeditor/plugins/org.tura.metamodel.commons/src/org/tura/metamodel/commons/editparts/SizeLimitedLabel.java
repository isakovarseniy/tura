package org.tura.metamodel.commons.editparts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class SizeLimitedLabel extends WrappingLabel{


	public void setBounds(Rectangle rect){
		Dimension d = this.getMinimumSize();
		rect.height=d.height;
		super.setBounds(rect);
	}
}
