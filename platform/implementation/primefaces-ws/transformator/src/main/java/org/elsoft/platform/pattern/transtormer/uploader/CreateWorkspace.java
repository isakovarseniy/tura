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

import javax.jcr.Credentials;
import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.Workspace;

import org.apache.jackrabbit.rmi.repository.URLRemoteRepository;
import org.elsoft.platform.PlatformConfig;

public class CreateWorkspace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session=null;

		try {
			Repository repository = new URLRemoteRepository(PlatformConfig.REPOSITORY_URL);
			Credentials credentials = new SimpleCredentials("admin", "admin".toCharArray());

			session = repository.login(credentials);
			Workspace workspace = session.getWorkspace();
			workspace.createWorkspace(PlatformConfig.PATTERN_WORKSPACE);
			session.save();

		
		} catch (Exception e) {

		}finally{
			if (session !=null)
				session.logout();
		}
	}

}
