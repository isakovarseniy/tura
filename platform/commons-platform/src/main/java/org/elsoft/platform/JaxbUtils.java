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

import java.io.*;
import javax.xml.bind.*;

public class JaxbUtils {

	@SuppressWarnings({ "unchecked" })
	public static <T> T readDocument(Class<T> docClass, InputStream inputStream)

	throws JAXBException {

		String packageName = docClass.getPackage().getName();

		JAXBContext jc = JAXBContext.newInstance(packageName);

		Unmarshaller u = jc.createUnmarshaller();

		JAXBElement<T> doc = (JAXBElement<T>) u.unmarshal(inputStream);

		return doc.getValue();

	}

	@SuppressWarnings({ "unchecked" })
	public static <T> T writeDocument(JAXBElement<T> document,
			OutputStream outputStream) throws JAXBException, IOException {

		Class<T> clazz = (Class<T>) document.getValue().getClass();

		JAXBContext context = JAXBContext.newInstance(clazz.getPackage()

		.getName());

		Marshaller m = context.createMarshaller();

		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

		m.marshal(document, outputStream);

		return document.getValue();

	}

}
