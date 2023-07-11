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

package sales.analyzer.api.model.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;
import org.kie.server.api.model.ItemList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Remotable
public class SalesAnalyzerListOfRowsNumber implements ItemList<SalesAnalyzerRowsNumber> {

	@XmlElement(name = "rows")
	private List<SalesAnalyzerRowsNumber> rows;
	
	@Override
	public List<SalesAnalyzerRowsNumber> getItems() {
		return rows;
	}

	public List<SalesAnalyzerRowsNumber> getRows() {
		return rows;
	}

	public void setRows(List<SalesAnalyzerRowsNumber> rows) {
		this.rows = rows;
	}

	
}

