/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.repository.neo4j.operation;

import org.tura.platform.repository.persistence.RelOperation;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class Neo4jLink extends SpaControl{

	private Object masterPk;
	private String masterType;
	private Object detailPk;
	private String detailType;
    private RelOperation relation;
    private Neo4jOpr function;

	private Neo4jLink(Object object,Object pk ,Neo4jOpr function, String registryName , OperationLevel lavel) {
		super(object,pk, lavel ,registryName);
		this.function = function;
		
	}
	
	public static Neo4jLink getConnect(Object object, Object pk,  String registryName ) {
		return new Neo4jLink(object,pk,Neo4jOpr.Connect,registryName, OperationLevel.CONNECT);
	}
	
	public static Neo4jLink getDisConnect(Object object,Object pk , String registryName ) {
		return new Neo4jLink(object,pk,Neo4jOpr.Disconnect,registryName, OperationLevel.DISCONNECT);
	}
	
	
	public Object getMasterPk() {
		return masterPk;
	}

	public void setMasterPk(Object masterPk) {
		this.masterPk = masterPk;
	}

	public String getMasterType() {
		return masterType;
	}

	public void setMasterType(String masterType) {
		this.masterType = masterType;
	}

	public Object getDetailPk() {
		return detailPk;
	}

	public void setDetailPk(Object detailPk) {
		this.detailPk = detailPk;
	}

	public String getDetailType() {
		return detailType;
	}

	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}

	public RelOperation getRelation() {
		return relation;
	}

	public void setRelation(RelOperation relation) {
		this.relation = relation;
	}

	public Neo4jOpr getFunction() {
		return function;
	}

	public void setFunction(Neo4jOpr function) {
		this.function = function;
	}



	enum Neo4jOpr{
		Connect,
		Disconnect
	}
	
	
}
