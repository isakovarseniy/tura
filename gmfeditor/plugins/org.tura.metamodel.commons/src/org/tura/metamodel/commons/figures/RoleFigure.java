package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.tura.metamodel.Activator;

public class RoleFigure extends ImageFigure {

	public RoleFigure() {
		super(Activator.getDefault().getBundledImage("images/role.png"), 0);
	}

}
