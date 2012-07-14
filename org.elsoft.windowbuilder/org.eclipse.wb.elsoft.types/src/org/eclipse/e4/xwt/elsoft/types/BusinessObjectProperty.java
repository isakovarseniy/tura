package org.eclipse.e4.xwt.elsoft.types;

import java.util.StringTokenizer;

public class BusinessObjectProperty {
	private String domain;
	private String functionalDomain;
	private String businessObjectName;

	public BusinessObjectProperty(String bo) {

		StringTokenizer tokenizer = new StringTokenizer(bo, ".");

		if (tokenizer.hasMoreElements())
			domain = tokenizer.nextToken();

		if (tokenizer.hasMoreElements())
			functionalDomain = tokenizer.nextToken();

		if (tokenizer.hasMoreElements())
			businessObjectName = tokenizer.nextToken();

	}

	public BusinessObjectProperty(String domain, String functionalDomain,
			String businessObjectName) {
		this.domain = domain;
		this.functionalDomain = functionalDomain;
		this.businessObjectName = businessObjectName;
	}

	public String toString() {
		return domain + "." + functionalDomain + "." + businessObjectName;
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

	public String getBusinessObjectName() {
		return businessObjectName;
	}

	public void setBusinessObjectName(String businessObjectName) {
		this.businessObjectName = businessObjectName;
	}
}
