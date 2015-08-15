package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.tura.metamodel.Activator;

public class InputTextFigure extends ImageFigure {

	public InputTextFigure() {
		super(Activator.getDefault().getBundledImage("images/inputtext.png"), 0);
	}

}
