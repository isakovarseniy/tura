package org.tura.metamodel.commons;

import java.net.URI;
import java.net.URL;

import freemarker.cache.URLTemplateLoader;

public class FreeMarkeResourceLoader extends URLTemplateLoader {

	@Override
	protected URL getURL(String filePath) {
		URI uri;
		try {
			uri = new URI(filePath);
			return uri.toURL();
		} catch (Exception e) {
		}
		return null;
	}
}
