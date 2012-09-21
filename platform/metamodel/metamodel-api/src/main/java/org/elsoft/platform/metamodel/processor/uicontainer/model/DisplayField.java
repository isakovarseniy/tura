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
package org.elsoft.platform.metamodel.processor.uicontainer.model;

public class DisplayField {
	private String displayLabel;
	private String displayExpression;

	public DisplayField(String label, String expression) {
		this.displayLabel = label;
		this.displayExpression = expression;
	}

	public String getDisplayLabel() {
		return displayLabel;
	}

	public void setDisplayLabel(String displayLabel) {
		this.displayLabel = displayLabel;
	}

	public String getDisplayExpression() {
		return displayExpression;
	}

	public void setDisplayExpression(String displayExpression) {
		this.displayExpression = displayExpression;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof DisplayField){
			DisplayField obj = (DisplayField) o;
			if ( obj.getDisplayLabel().compareTo(getDisplayLabel()) == 0  ){
				return obj.getDisplayLabel().equals(getDisplayLabel());
			}
			return obj.getDisplayLabel().equals(getDisplayLabel());
		}
		return false;
	}

}
