package org.eclipse.e4.xwt.elsoft.types;

import java.util.StringTokenizer;

public class ServiceProperty {
	private String domain;
	private String functionalDomain;
	private String application;
	private String typeName;
	
	public ServiceProperty(String field){
		StringTokenizer tokenizer = new StringTokenizer(field, ".");

		if (tokenizer.hasMoreElements())
			domain = tokenizer.nextToken();

		if (tokenizer.hasMoreElements())
			functionalDomain = tokenizer.nextToken();

		if (tokenizer.hasMoreElements())
			application = tokenizer.nextToken();

		if (tokenizer.hasMoreElements())
			typeName = tokenizer.nextToken();
		
		
	}
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getFunctionalDomain() {
		return functionalDomain;
	}
	public void setFunctionalDomain(String functionalDomain) {
		this.functionalDomain = functionalDomain;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	
	
}
