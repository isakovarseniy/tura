/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.elsoft.platform.pattern.transtormer.uploader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import javax.jcr.Credentials;
import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.nodetype.NodeType;

import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.jackrabbit.rmi.repository.URLRemoteRepository;
import org.elsoft.platform.JaxbUtils;
import org.elsoft.platform.PlatformConfig;


public class PatternUploader {


	private static Logger logger = Logger.getLogger(PatternUploader.class
			.getName());



	private void createImplementationPattern(Session session, String path,
			String file) throws Exception {
		Node node = session.getRootNode();
		StringTokenizer token = new StringTokenizer("/"
				+ PlatformConfig.IMPLEMENTATION_PATTERN_ROOT + "/" + path, "//");
		while (token.hasMoreTokens()) {
			String tkn = token.nextToken();
			node = JcrUtils.getOrAddNode(node, tkn, NodeType.NT_FOLDER);
		}
		File f = new File(file);
		JcrUtils.putFile(node, f.getName(), "jcr:data", new FileInputStream(f),
				Calendar.getInstance());
	}


	public void uploader(String user, String passwd, String file) {

		Credentials credentials = null;
		Repository repository = null;
		Session session = null;
		Pattern patterns = null;

		try {

			FileInputStream f = new FileInputStream(new File(file));
			patterns = JaxbUtils.readDocument(Pattern.class, f);

			repository = new URLRemoteRepository(PlatformConfig.REPOSITORY_URL);
			credentials = new SimpleCredentials(user, passwd.toCharArray());

			session = repository.login(credentials,
					PlatformConfig.PATTERN_WORKSPACE);

			// Register implementation pattern
			Iterator<ImplementationPattern> itr0 = patterns
					.getImplementationPattern().getImplementationPattern()
					.iterator();
			while (itr0.hasNext()) {
				ImplementationPattern ptrn = itr0.next();
				createImplementationPattern(session,
						ptrn.getImplementationPatternPath(), ptrn.getFile());
			}

			session.save();
		} catch (Exception e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
		} finally {
			if (session != null)
				session.logout();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PatternUploader pu = new PatternUploader();
		pu.uploader(
				"admin",
				"admin",
				"/home/platform/GITRepo/bagration/platform/implementation/primefaces-ws/transformator/src/main/resources/pattern.xml");
	}

}
