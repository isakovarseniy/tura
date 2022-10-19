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

package org.tura.configuration.dsl.commons;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.TransportConfigCallback;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.archive.ArchiveFormats;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.transport.JschConfigSessionFactory;
import org.eclipse.jgit.transport.OpenSshConfig.Host;
import org.eclipse.jgit.transport.SshTransport;
import org.eclipse.jgit.transport.Transport;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.zeroturnaround.zip.ZipUtil;

import com.jcraft.jsch.Session;

public class GitRepository {

	private String localRepositoryPath;
	private String branch;
	private String outputFilePath;
	private String user;
	private String password;
	private String remote;
	private String message;

	public GitRepository setMessage(String message) {
		this.message = message;
		return this;
	}

	public GitRepository setUser(String user) {
		this.user = user;
		return this;
	}

	public GitRepository setPassword(String password) {
		this.password = password;
		return this;
	}

	public GitRepository setRemote(String remote) {
		this.remote = remote;
		return this;
	}

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

	
	public void pullRepository()throws IOException, GitAPIException {
		FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
		Repository repository = repositoryBuilder.setGitDir(new File(this.localRepositoryPath + "/.git")).setup().build();
		
		JschConfigSessionFactory sshSessionFactory = new JschConfigSessionFactory() {
			  @Override
			  protected void configure( Host host, Session session ) {
			    session.setPassword( password );
			    session.setConfig("StrictHostKeyChecking", "no");					    
			  }
			} ;				

		try (Git git = new Git(repository)) {
			git.pull()
			.setTransportConfigCallback( new TransportConfigCallback() {
				  @Override
				  public void configure( Transport transport ) {
				    SshTransport sshTransport = ( SshTransport )transport;
				    sshTransport.setSshSessionFactory( sshSessionFactory );
				  }
				}) 
			.call();
		}

	}
	
	
	
	public void pushRepository()throws IOException, GitAPIException {
		FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
		Repository repository = repositoryBuilder.setGitDir(new File(this.localRepositoryPath + "/.git")).setup().build();
		
		JschConfigSessionFactory sshSessionFactory = new JschConfigSessionFactory() {
			  @Override
			  protected void configure( Host host, Session session ) {
			    session.setPassword( password );
			    session.setConfig("StrictHostKeyChecking", "no");					    
			  }
			} ;				

		try (Git git = new Git(repository)) {
			git.push()
			.setTransportConfigCallback( new TransportConfigCallback() {
				  @Override
				  public void configure( Transport transport ) {
				    SshTransport sshTransport = ( SshTransport )transport;
				    sshTransport.setSshSessionFactory( sshSessionFactory );
				  }
				}) 
			.call();
		}

	}

	
	
	public void addAndCommitRepository()throws IOException, GitAPIException {
		FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
		Repository repository = repositoryBuilder.setGitDir(new File(this.localRepositoryPath + "/.git")).setup().build();
		try (Git git = new Git(repository)) {
			git.add().addFilepattern(".").call();
			git.commit().setMessage(message).call();
		}

	}
	
	public void cloneRepository() throws IOException, GitAPIException {
			try {
				JschConfigSessionFactory sshSessionFactory = new JschConfigSessionFactory() {
					  @Override
					  protected void configure( Host host, Session session ) {
					    session.setPassword( password );
					    session.setConfig("StrictHostKeyChecking", "no");					    
					  }
					} ;				
				
				Git.cloneRepository()
				.setURI(this.remote)
				.setCredentialsProvider(new UsernamePasswordCredentialsProvider(user, password))
				.setDirectory(new File(this.outputFilePath))
				.setTransportConfigCallback( new TransportConfigCallback() {
					  @Override
					  public void configure( Transport transport ) {
					    SshTransport sshTransport = ( SshTransport )transport;
					    sshTransport.setSshSessionFactory( sshSessionFactory );
					  }
					}) 
				.call();
			} finally {
			}
	}

	public void archiveRepository() throws IOException, GitAPIException {
		try (Repository repository = createRepository()) {
			ArchiveFormats.registerAll();
			try {
				archive(repository, ".zip", "zip");

			} finally {
				ArchiveFormats.unregisterAll();
			}
		}
	}

	private void archive(Repository repository, String suffix, String format) throws IOException, GitAPIException {
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
