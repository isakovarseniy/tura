/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
public class SalesAnalyzerListOfTaskInstances implements ItemList<SalesAnalyzerTaskInstance> {

	@XmlElement(name = "tasks")
	List<SalesAnalyzerTaskInstance> tasks;

	public List<SalesAnalyzerTaskInstance> getTasks() {
		return tasks;
	}

	public void setTasks(List<SalesAnalyzerTaskInstance> tasks) {
		this.tasks = tasks;
	}

	public SalesAnalyzerListOfTaskInstances() {

	}


	@Override
	public List<SalesAnalyzerTaskInstance> getItems() {
		return tasks;
	}

}