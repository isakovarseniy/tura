package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.tura.metamodel.Activator;

public class StorageFigure extends ImageFigure {

	public StorageFigure() {
		super(Activator.getDefault().getBundledImage("images/storage.png"), 0);
	}

}
