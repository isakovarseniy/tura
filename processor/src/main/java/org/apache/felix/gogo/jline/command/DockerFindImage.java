/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import com.github.dockerjava.api.model.Image;

import picocli.CommandLine.Option;

public class DockerFindImage  extends DockerCommand{

    @Option(names = "--registry", required = true)
    private String registry;

    @Option(names = "--tag", required = true)
    private String tag;

    @Override
    public Object execute() {
        _init();
        Image image = this.findImage(registry + ":" + tag);
        if (image != null) {
            return true;
        }
        return false;
    }
	
}
