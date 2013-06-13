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
package org.tura.metamodel.commons;

public enum MetamodelProperties {
	/* Application server properties */
	Appserver_Active_HostIP,
	Appserver_Passive_HostIP,
	Appserver_WebServerPort,
	Appserver_WebServerProtocol,
	Appserver_Active_Management_HostIP,
	Appserver_Passive_Management_HostIP,
	Appserver_Management_WebServerPort,
	
	/* Database server properties */
	DataBaseType,
	
	
	/* Misc*/
	Container,
	Object,
	
	
	/*Relationship properties*/
	Rel_MasterFiels,
	Rel_DetailField,
	Rel_MethodName,
	Rel_MethodType
	
	
}
