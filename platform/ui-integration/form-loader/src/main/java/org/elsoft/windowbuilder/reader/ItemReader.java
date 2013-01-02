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
package org.elsoft.windowbuilder.reader;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.objects.command.EventDAO;


public abstract class ItemReader extends Reader {

	public String getLabel() {
		return label;
	}

	public boolean isTableContext() {
		return tableContext;
	}


	private String dataControlId;
	private String field;
	private String cssStyle;
	private String cssStyleClass;
	private String idObject;
	private String label;
	private boolean tableContext = false;


	
	
	public String getCssStyle() {
		return cssStyle;
	}

	public void setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
	}

	public String getCssStyleClass() {
		return cssStyleClass;
	}

	public void setCssStyleClass(String cssStyleClass) {
		this.cssStyleClass = cssStyleClass;
	}

	public void setDataControlId(String dataControlId) {
		this.dataControlId = dataControlId;
	}

	public void setField(String field) {
		this.field = field;
	}


	public String getDataControlId() {
		return dataControlId;
	}

	public String getField() {
		return field;
	}

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		
		cssStyle = xmlReader.getAttributeValue(null, "cssStyle");
		cssStyleClass = xmlReader.getAttributeValue(null, "cssStyleClass");
		idObject = xmlReader.getAttributeValue(null, "idObject");

		String iterator = xmlReader.getAttributeValue(null, "iteratorProperty");
		dataControlId = Reader.idMAP.get(iterator);
		
		field = xmlReader.getAttributeValue(null, "sourceProperty");
		
		return this;
	}

	public String getIdObject() {
		return idObject;
	}

	public void setIdObject(String idObject) {
		this.idObject = idObject;
	}

	
	protected Reader setContext(Reader parent){
		Reader prnt = parent;

		if ((getIdObject() != null) && (!getIdObject().equals(""))) {
			setUuid( getIdObject());
		}
		
		if (parent instanceof TableColumnReader) {
			label = ((TableColumnReader) prnt).getLabel();
			tableContext = true;
			prnt=((TableColumnReader) prnt).getParent();
			setDataControlId(((TableReader)prnt).getDataControlId());
		}

		if (parent instanceof TreeColumnReader) {
			label = ((TreeColumnReader) prnt).getLabel();
			tableContext = true;
			prnt=((TreeColumnReader) prnt).getParent();
			setDataControlId(((TreeReader)prnt).getDataControlId());
		}
		return prnt;
	}
	
	
	
	
	
}
