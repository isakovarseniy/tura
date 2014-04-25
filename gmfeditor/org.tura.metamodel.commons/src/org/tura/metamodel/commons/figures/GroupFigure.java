package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.metamodel.tura.Activator;

public class GroupFigure extends ImageFigure {

	public GroupFigure() {
		super(Activator.getDefault().getBundledImage("images/group.png"), 0);
	}

}
