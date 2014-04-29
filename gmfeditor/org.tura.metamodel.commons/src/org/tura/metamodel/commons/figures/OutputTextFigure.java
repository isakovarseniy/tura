package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.metamodel.tura.Activator;

public class OutputTextFigure extends ImageFigure {

	public OutputTextFigure() {
		super(Activator.getDefault().getBundledImage("images/outputtext.png"), 0);
	}

}
