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
package org.tura.metamodel.generation;

import org.tura.metamodel.commons.LoggerWrapper;

public class HeadlessLogWrapper implements LoggerWrapper{

    @Override
    public void logInfo(String message) {
        System.out.println(message);
        
    }
    
    

}

