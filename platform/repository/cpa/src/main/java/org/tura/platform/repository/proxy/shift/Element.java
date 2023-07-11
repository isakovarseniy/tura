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

package org.tura.platform.repository.proxy.shift;

import java.io.Serializable;

public class Element implements Serializable{

	private static final long serialVersionUID = 4561792274060210282L;
	private int actualPosition;
	private int originalPosition;
	private String elementType;
	private boolean modified=false;
	private Object ref;

	
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Element))
			return false;
		Element e = (Element) o;

		if (actualPosition != e.actualPosition)
			return false;

		if (originalPosition != e.originalPosition)
			return false;

		if (!elementType.equals(e.elementType))
			return false;

		if (modified != e.modified)
			return false;

		return true;

	}

	public Element(int actualPosition, int originalPosition,
			ElementType elementType) {
		this.actualPosition = actualPosition;
		this.originalPosition = originalPosition;
		this.elementType = elementType.name();
		if ( elementType.equals(ElementType.NEW) )
			this.modified=true;
	}

	public Element(int actualPosition, int originalPosition,
			ElementType elementType, boolean modified) {
		this.actualPosition = actualPosition;
		this.originalPosition = originalPosition;
		this.elementType = elementType.name();
		this.modified= modified;
	}


	public Element(int actualPosition, int originalPosition,
			ElementType elementType, Object obj) {
		this.actualPosition = actualPosition;
		this.originalPosition = originalPosition;
		this.elementType = elementType.name();
		if ( elementType.equals(ElementType.NEW) )
			this.modified=true;
		this.ref=obj;
	}
	
	
	public int getActualPosition() {
		return actualPosition;
	}

	public void setActualPosition(int actualPosition) {
		this.actualPosition = actualPosition;
	}

	public int getOriginalPosition() {
		return originalPosition;
	}

	public void setOriginalPosition(int originalPosition) {
		this.originalPosition = originalPosition;
	}

	public String getElementType() {
		return elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public boolean isModified() {
		return modified;
	}

	public void setModified(boolean modified) {
		this.modified = modified;
	}

	public int getShift() {
		return actualPosition - originalPosition;
	}

	public Object getRef() {
		return ref;
	}

	public void setRef(Object ref) {
		this.ref = ref;
	}


}
