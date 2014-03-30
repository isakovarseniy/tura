package org.metamodel.tura;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	public static final String ID = "org.tura.metamodel.commons";

	private static Activator ourInstance;

	public Activator() {
	}

	public static ImageDescriptor getBundledImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
	}
	
	
	public Image getBundledImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image == null) {
			getImageRegistry().put(path, getBundledImageDescriptor(path));
			image = getImageRegistry().get(path);
		}
		return image;
	}
	
	
	public void start(BundleContext context) throws Exception {
		super.start(context);
		ourInstance = this;
	}

	public void stop(BundleContext context) throws Exception {
		ourInstance = null;
		super.stop(context);
	}

	public static Activator getDefault() {
		return ourInstance;
	}
}
