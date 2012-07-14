/*******************************************************************************
 * Copyright (c) 2006, 2010 Soyatec (http://www.soyatec.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.xwt.ui.workbench;

import java.io.InputStream;
import java.net.URL;

/**
 * 
 * @author yyang (yves.yang@soyatec.com)
 */
public interface IPartContentProvider {

	/**
	 * Content stream
	 * 
	 * @return
	 */
	InputStream getContent();

	/**
	 * Resource location, used to resolve relative resources
	 * 
	 * @return
	 */
	URL getBase();

	/**
	 * Resource loader
	 * 
	 * @return
	 */
	ClassLoader getClassLoader();
}
