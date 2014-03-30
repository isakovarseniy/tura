package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.metamodel.tura.Activator;

public class RouterFigure extends ImageFigure {

	public RouterFigure() {
		super(Activator.getDefault().getBundledImage("images/router.png"), 0);
	}

}
