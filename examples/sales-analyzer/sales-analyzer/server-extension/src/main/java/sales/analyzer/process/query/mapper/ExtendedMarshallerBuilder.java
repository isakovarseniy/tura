/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.process.query.mapper;

import java.util.HashSet;
import java.util.Set;

import org.kie.server.api.marshalling.Marshaller;
import org.kie.server.api.marshalling.MarshallerBuilder;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.marshalling.jaxb.JaxbMarshaller;
import org.kie.server.api.marshalling.json.JSONMarshaller;
import org.kie.server.api.marshalling.xstream.XStreamMarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sales.analyzer.api.model.impl.ExtraClasses;

public class ExtendedMarshallerBuilder implements MarshallerBuilder {

	private static final Logger logger = LoggerFactory.getLogger(ExtendedMarshallerBuilder.class);

	@Override
	public Marshaller build(Set<Class<?>> classes, MarshallingFormat format, ClassLoader classLoader) {

		HashSet<Class<?>> newList = new HashSet<Class<?>>();
		if (classes != null) {
			newList.addAll(classes);
		}
		newList.addAll(ExtraClasses.list);

		switch (format) {
		case XSTREAM:
			logger.debug("About to build default instance of XStream marshaller with classes {} and class loader {}",
					classes, classLoader);
			return new XStreamMarshaller(newList, classLoader);
		case JAXB:
			logger.debug("About to build default instance of JAXB marshaller with classes {} and class loader {}",
					classes, classLoader);
			return new JaxbMarshaller(newList, classLoader);
		case JSON:
			logger.debug("About to build default instance of JSON marshaller with classes {} and class loader {}",
					classes, classLoader);
			return new JSONMarshaller(newList, classLoader);
		default:
			logger.error("Unsupported marshalling format: " + format);
		}
		return null;
	}
}