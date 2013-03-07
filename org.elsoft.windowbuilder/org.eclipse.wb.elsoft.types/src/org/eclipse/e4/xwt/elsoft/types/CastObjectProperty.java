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
package org.eclipse.e4.xwt.elsoft.types;

import java.util.StringTokenizer;

public class CastObjectProperty {
	private String domain;
	private String functionalDomain;
	private String application;
	private String typeName;
	
	public CastObjectProperty(String field){
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
