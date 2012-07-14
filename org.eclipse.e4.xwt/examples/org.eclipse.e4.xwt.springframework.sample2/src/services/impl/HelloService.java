/*******************************************************************************
 * Copyright (c) 2010 Angelo Zerr and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *******************************************************************************/
package services.impl;

import services.IHelloService;

/**
 * {@link IHelloService} implementation.
 * 
 */
public class HelloService implements IHelloService {

	public String hello() {
		return "Hello, world!";
	}
}
