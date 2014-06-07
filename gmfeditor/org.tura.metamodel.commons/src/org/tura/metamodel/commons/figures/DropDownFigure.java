package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.tura.metamodel.Activator;

public class DropDownFigure extends ImageFigure {

	public DropDownFigure() {
		super(Activator.getDefault().getBundledImage("images/dropdown.png"), 0);
	}

}
