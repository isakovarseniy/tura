package org.tura.comfiguration.artifacts;

import java.net.URL;

import freemarker.cache.ClassTemplateLoader;

public class FreeMarkeResourceLoader extends ClassTemplateLoader {
	
	private ClassLoader loader;
	public FreeMarkeResourceLoader(Class<?> loaderClass, String path) {
		super( loaderClass,  path);
		loader = loaderClass.getClassLoader();
	}

	@Override
	protected URL getURL(String filePath) {
		URL uri;
		try {
			uri =  this.loader.getResource(filePath);
			return uri;
		} catch (Exception e) {
		}
		return null;
	}
}
