package org.eclipse.e4.xwt.elsoft.types;

import java.util.StringTokenizer;

public class FormNameProperty {
	private String domain;
	private String functionalDomain;
	private String application;
	private String formName;

	public FormNameProperty(String prop) {
		
		StringTokenizer tokenizer = new StringTokenizer(prop, ".");

		if (tokenizer.hasMoreElements())
			domain = tokenizer.nextToken();

		if (tokenizer.hasMoreElements())
			functionalDomain = tokenizer.nextToken();

		if (tokenizer.hasMoreElements())
			application = tokenizer.nextToken();
		
		if (tokenizer.hasMoreElements())
			formName = tokenizer.nextToken();
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

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}



	public String toString() {
		return domain + "." + functionalDomain + "." + application+ "."+formName;
	}

}
