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

package org.tura.configuration.dsl.commons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.apache.felix.gogo.jline.command.ExecuteExternalOperation;

public class RemoveArtifact<T> {

	protected String targetLocation;
	protected String containerId;

	@SuppressWarnings("unchecked")
	public T setTargetLocation(String targetLocation) {
		this.targetLocation = targetLocation;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setContainer(String containerId) {
		this.containerId = containerId;
		return (T) this;
	}

	public void removeFile() throws Exception {
		if (containerId == null) {
			removeFromExternal();
		} else {
            new ExecuteExternalOperation(String.format( "docker exec -i %s sh -c \"rm -rf %s;\" ", containerId, targetLocation) ).execute();
		}
	}

	public void removeFromExternal() throws IOException {
		try {
			File f = Paths.get(this.targetLocation).toFile();
			FileUtils.forceDelete(f);
		} catch (FileNotFoundException e) {
             System.out.println("File "+this.targetLocation+" does not exists");
		}
	}

}
