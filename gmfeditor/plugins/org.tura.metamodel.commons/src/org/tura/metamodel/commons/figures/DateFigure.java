package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.tura.metamodel.Activator;

public class DateFigure extends ImageFigure{

	
	public DateFigure() {
		super(Activator.getDefault().getBundledImage("images/date.png"), 0);
	}	
	
}
