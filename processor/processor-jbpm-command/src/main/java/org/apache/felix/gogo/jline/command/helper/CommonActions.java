/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command.helper;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;

public class CommonActions {

	public static String getToken(String clientId, String username, String password, String url) throws Exception {
		HttpClient client = new HttpClient();

		PostMethod postMethod = new PostMethod(url);

		postMethod.addParameter("grant_type", "password");
		postMethod.addParameter("client_id", clientId);
		postMethod.addParameter("username", username);
		postMethod.addParameter("password", password);

		int statusCode = client.executeMethod(postMethod);

		if (statusCode != HttpStatus.SC_OK) {
			throw new Exception("wrong response");
		} else {
			byte[] responseBody = postMethod.getResponseBody();
			String response = new String(responseBody, "UTF-8");

			String t = "\"access_token\": \"";
			int i = response.indexOf(t) + t.length() + 1;
			String accessToken = response.substring(i);
			i = accessToken.indexOf("\"");
			accessToken = accessToken.substring(0, i);
			return accessToken;
		}

	}


	
}
