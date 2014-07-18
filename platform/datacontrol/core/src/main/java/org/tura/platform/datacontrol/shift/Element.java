package org.tura.platform.datacontrol.shift;

public class Element {

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

		if (elementType.equals(e.originalPosition))
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
