/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
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