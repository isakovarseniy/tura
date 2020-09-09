/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.archive.ArchiveFormats;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.zeroturnaround.zip.ZipUtil;

public class GitRepository {

	private String localRepositoryPath;
	private String branch;
	private String outputFilePath;

	public GitRepository setLocalRepositoryPath(String localRepositoryPath) {
		this.localRepositoryPath = localRepositoryPath;
		return this;
	}

	public GitRepository setBranch(String branch) {
		this.branch = branch;
		return this;
	}

	public GitRepository setOutputFilePath(String outputFilePath) {
		this.outputFilePath = outputFilePath;
		return this;
	}

	public void archiveRepository() throws IOException, GitAPIException {
		try (Repository repository = createRepository()) {
			ArchiveFormats.registerAll();
			try {
				write(repository, ".zip", "zip");

			} finally {
				ArchiveFormats.unregisterAll();
			}
		}
	}

	private void write(Repository repository, String suffix, String format) throws IOException, GitAPIException {
		// this is the file that we write the archive to
		File file = new File(outputFilePath + suffix);
		FileUtils.forceMkdirParent(file);
		try (OutputStream out = new FileOutputStream(file)) {
			// finally call the ArchiveCommand to write out using the various supported
			// formats
			try (Git git = new Git(repository)) {
				git.archive().setTree(repository.resolve(this.branch)).setFormat(format).setOutputStream(out).call();
			}
		}

		ZipUtil.unpack(file, new File(outputFilePath));
		file.delete();
	}

	private Repository createRepository() throws IOException {
		FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
		Repository repository = repositoryBuilder.setGitDir(new File(this.localRepositoryPath + "/.git"))
				.readEnvironment() // scan environment GIT_* variables
				.findGitDir() // scan up the file system tree
				.setMustExist(true).build();

		return repository;
	}

}
