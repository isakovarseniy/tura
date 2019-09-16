/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.tura.processor.connection;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public class PlatformURLStreamHandlerFactory  implements URLStreamHandlerFactory {

    @Override
    public URLStreamHandler createURLStreamHandler(String protocol) {
        if ("platform".equals(protocol)) {
            return new PlatformURLStreamHandler();
        }

        return null;
    }

}
