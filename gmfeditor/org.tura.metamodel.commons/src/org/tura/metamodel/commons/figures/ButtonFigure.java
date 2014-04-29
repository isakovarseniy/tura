package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.metamodel.tura.Activator;

public class ButtonFigure extends ImageFigure {

	public ButtonFigure() {
		super(Activator.getDefault().getBundledImage("images/button.png"), 0);
	}

}
