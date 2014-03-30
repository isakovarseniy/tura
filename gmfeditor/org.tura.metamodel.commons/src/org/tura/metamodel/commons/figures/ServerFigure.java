package org.tura.metamodel.commons.figures;

import org.eclipse.draw2d.ImageFigure;
import org.metamodel.tura.Activator;

	public class ServerFigure extends ImageFigure{

		public ServerFigure() {
			super(Activator.getDefault().getBundledImage("images/server.png"), 0);
		}

	}
