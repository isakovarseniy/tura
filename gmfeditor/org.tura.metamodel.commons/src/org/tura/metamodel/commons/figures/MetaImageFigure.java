package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.tura.metamodel.Activator;

public class MetaImageFigure extends ImageFigure{

	
	public MetaImageFigure() {
		super(Activator.getDefault().getBundledImage("images/image.png"), 0);
	}	

}
