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
package org.elsoft.platform;

import java.util.logging.Level;

public class PlatformConfig {

	public static String IMPLEMENTATION_PATTERN_ROOT = "ImplementationPetternRoot";

	public static Level LOGGER_LEVEL = Level.INFO;

	public static String TRANSACTION_SERVICE = "org.elsoft.platform.metamodel.GlassfishTransaction";

	public static String REPOSITORY_URL = "http://localhost:8080/jackrabbit-webapp-2.2.11/rmi";

	public static String PATTERN_WORKSPACE = "PlatformPatternWorkspace";

	public static String ROOT_PATTERN_WORKSPACE = "RootOfPlatformPatternWorkspace";

	public static String ENTITY_MODEL_TOKEN = "entityModel";

	public static String ROOT_GENERATED_CODE = "GeneratedCodeRoot";

	public static String ROOT_GENERATED_CODE_PATH = "/home/platform/generatedCode";

	public static String ROOT_TEMPLATE = "RootTemplate";

	public static String ROOT_TEMPLATE_PATH = "/home/platform/implPattern";

	public static String PLATFORM = "platform";

	public static String RELATIVE_PATH = "RelativePath";

	public static String MODEL_HOLDER = "model";

	public static String ARTIFACT_NAME = "artifactName";

	public static String APPSERVER_ADMIN_TOOL = "AdminToolPath";

	public static String APPSERVER_ADMIN_TOOL_PATH = "/opt/glassfish3/glassfish/bin";

	public static String DOMAIN_PARAMETER = "domain";

	public static String FUNCTIONAL_DOMAIN_PARAMETER = "functionalDomain";

	public static String APPLICATION_PARAMETER = "application";

	public static String LAYER_PARAMETER = "layer";

	public static String REPOSITORYFACTORY_PARAMETER = "repositoryFactory";
}
