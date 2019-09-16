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
package org.apache.felix.gogo.jline.ext;

import java.util.Collection;
import java.util.Map;

import org.apache.felix.service.command.CommandProcessor;

public interface ProcessorExtension {

    void initProcessor(CommandProcessor processor);

    Map<String, String> getDirMap();

    Collection<String> getInitScripts();

}