package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.metamodel.tura.Activator;

public class HubFigure extends ImageFigure {

	public HubFigure() {
		super(Activator.getDefault().getBundledImage("images/hub.png"), 0);
	}

}
