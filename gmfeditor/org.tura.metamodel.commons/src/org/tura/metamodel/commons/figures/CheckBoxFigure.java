package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.tura.metamodel.Activator;

public class CheckBoxFigure extends ImageFigure {

	public CheckBoxFigure() {
		super(Activator.getDefault().getBundledImage("images/checkbox.png"), 0);
	}

}
