package org.sales.analyzer.services.impl;

import org.kie.server.client.CredentialsProvider;

public class OAuthCredentialsProvider  implements CredentialsProvider{

	private String token;
	
	public OAuthCredentialsProvider( String token) {
		this.token = token;
	}
	
	@Override
	public String getHeaderName() {
		return "Authorization";
	}

	@Override
	public String getAuthorization() {
		return "Bearer "+token;
	}

}
