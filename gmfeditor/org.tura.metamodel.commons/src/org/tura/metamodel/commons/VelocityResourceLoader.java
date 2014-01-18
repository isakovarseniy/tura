package org.tura.metamodel.commons;

import java.io.InputStream;
import java.net.URI;

import org.apache.commons.collections.ExtendedProperties;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.resource.Resource;
import org.apache.velocity.runtime.resource.loader.ResourceLoader;

public class VelocityResourceLoader extends ResourceLoader {

	@Override
	public long getLastModified(Resource arg0) {
		return 0;
	}

	@Override
	public InputStream getResourceStream(String filePath)
			throws ResourceNotFoundException {
		try {
			URI uri = new URI(filePath);
			return uri.toURL().openStream();
			
		} catch (Exception e) {
			throw new ResourceNotFoundException("No template found :" + filePath);
		}
	}

	@Override
	public void init(ExtendedProperties arg0) {

	}

	@Override
	public boolean isSourceModified(Resource arg0) {
		return false;
	}

}
