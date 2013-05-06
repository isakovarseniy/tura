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
package org.elsoft.platform.metamodel.suite;

import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;

import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.XMLOutput;
import org.elsoft.platform.PlatformConfig;

public class ScriptRunner {

	public void run(String scriptName, HashMap<String, Object> context)
			throws JellyException {

		context.put(PlatformConfig.ROOT_GENERATED_CODE,
				System.getenv(PlatformConfig.ROOT_GENERATED_CODE_PATH) + "/"
						+ context.get(PlatformConfig.LAYER_PARAMETER));
		context.put(PlatformConfig.ROOT_TEMPLATE,
				System.getenv(PlatformConfig.ROOT_TEMPLATE_PATH) + "/"
						+ PlatformConfig.IMPLEMENTATION_PATTERN_ROOT);

		context.putAll(System.getenv());
		
		JellyContext jellyContext = new JellyContext();

		jellyContext.setVariables(context);

		Writer out = new PrintWriter(System.out);
		XMLOutput output = XMLOutput.createXMLOutput(out);

		jellyContext.runScript(
				new File(context.get(PlatformConfig.ROOT_TEMPLATE)
						+ "/" + scriptName), output);
		
	}
	
}
