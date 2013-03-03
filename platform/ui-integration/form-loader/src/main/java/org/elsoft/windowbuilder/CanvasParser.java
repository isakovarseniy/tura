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
package org.elsoft.windowbuilder;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Stack;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

import org.elsoft.platform.metamodel.MetamodelObjectType;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.windowbuilder.reader.CanvasCheater;
import org.elsoft.windowbuilder.reader.FormCheaterReader;
import org.elsoft.windowbuilder.reader.Reader;
import org.elsoft.windowbuilder.reader.ShellReader;

public class CanvasParser {

	private XMLInputFactory inputFactory = null;

	public CanvasParser() {
		inputFactory = XMLInputFactory.newInstance();
	}

	public Reader XWTModelbuilder(File file, 
			String formId) throws Exception {
		XMLStreamReader xmlReader = inputFactory
				.createXMLStreamReader(new FileReader(file));

		Reader.eventConverter = new HashMap<String, MetamodelTriggerEventsType>();
		for (MetamodelTriggerEventsType val : MetamodelTriggerEventsType
				.values()) {
			Reader.eventConverter.put(val.getMethod(), val);
		}
		Reader root = processing(xmlReader, formId, file.getName());
		xmlReader.close();

		return root;
	}

	private Reader processing(XMLStreamReader xmlReader, String formId,
			String artifactName) throws Exception {
		boolean firstPath = true;
		int ignore = 0;
		Stack<Reader> stack = new Stack<Reader>();
		Reader root = new FormCheaterReader();
		((FormCheaterReader) root).setUuid(formId);
		stack.push(root);

		while (xmlReader.hasNext()) {
			Integer eventType = xmlReader.next();
			if (eventType.equals(XMLEvent.START_ELEMENT)) {
				try {

					if (ignore != 0) {
						ignore++;
						continue;
					}

					String objName = xmlReader.getName().getLocalPart()
							.replace('.', '_');

					if (firstPath == true) {
						if (ElementBuilder.valueOf(objName).equals(
								ElementBuilder.StackableCanvas)) {
							CanvasCheater canvas = new CanvasCheater();
							int i = artifactName.lastIndexOf('.');
							canvas.setName(artifactName.substring(0, i));
							
							canvas.reader(xmlReader, root);
							stack.push(canvas);
							root.getChildren().add(canvas);
							firstPath = false;

							continue;
						}
						if (ElementBuilder.valueOf(objName).equals(
								ElementBuilder.Shell)) {
							ShellReader win = new ShellReader();
							int i = artifactName.lastIndexOf('.');
							win.setWindowName(artifactName.substring(0, i));
							stack.push(win);
							root.getChildren().add(win);
							firstPath = false;
							continue;
						}
						if (ElementBuilder.valueOf(objName).equals(
								ElementBuilder.TabCanvas)) {
							CanvasCheater canvas = new CanvasCheater();
							int i = artifactName.lastIndexOf('.');
							canvas.setName(artifactName.substring(0, i));
							canvas.setType(MetamodelObjectType.TabCanvas.name());

							canvas.reader(xmlReader, root);
							stack.push(canvas);
							root.getChildren().add(canvas);
							firstPath = false;

							continue;
						}

						if (ElementBuilder.valueOf(objName).equals(
								ElementBuilder.PopUpCanvas)) {
							CanvasCheater canvas = new CanvasCheater();
							int i = artifactName.lastIndexOf('.');
							canvas.setName(artifactName.substring(0, i));
							canvas.setType(MetamodelObjectType.PopUpCanvas.name());

							canvas.reader(xmlReader, root);
							stack.push(canvas);
							root.getChildren().add(canvas);
							firstPath = false;

							continue;
						}

					
					}
					firstPath = false;
					Reader parent = stack.peek();
					Reader newReader = ElementBuilder.valueOf(objName)
							.getInstance().reader(xmlReader, parent);

					if (ElementBuilder.valueOf(objName).equals(
							ElementBuilder.DataDefinition)) {
						root = newReader;
					}

					parent.getChildren().add(newReader);
					stack.push(newReader);

				} catch (Exception e) {
					ignore++;
				}
			}
			if (eventType.equals(XMLEvent.END_ELEMENT)) {
				if (ignore != 0) {
					ignore--;
					continue;
				}
				String objName = xmlReader.getName().getLocalPart()
						.replace('.', '_');
				try {
					ElementBuilder.valueOf(objName).getInstance();
					stack.pop();
				} catch (Exception e) {

				}
			}
		}
		return root;

	}
}
