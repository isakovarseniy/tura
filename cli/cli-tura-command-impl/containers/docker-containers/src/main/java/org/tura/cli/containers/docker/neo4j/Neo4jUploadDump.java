/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.containers.docker.neo4j;

import java.io.File;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.tura.cli.containers.docker.Docker;
import org.tura.cli.containers.docker.DockerRemoveContainer;
import org.zeroturnaround.zip.ZipUtil;

public class Neo4jUploadDump extends Docker {


	public Object execute(String dump, String storage, String name) {
		try {
			DockerRemoveContainer rm = new DockerRemoveContainer();
			rm.execute(name, null);

			File trg = Paths.get(storage).toFile();
			if (trg.exists()) {
				if (trg.isDirectory()) {
					FileUtils.deleteDirectory(trg);
				} else {
					trg.delete();
				}
			}

			ZipUtil.unpack(new File(dump), new File(storage));
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
