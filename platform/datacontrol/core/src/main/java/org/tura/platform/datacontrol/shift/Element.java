package org.tura.platform.datacontrol.shift;

public class Element {

	private int actualPosition;
	private int originalPosition;
	private String elementType;

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

		return true;

	}

	public Element(int actualPosition, int originalPosition,
			ElementType elementType) {
		this.actualPosition = actualPosition;
		this.originalPosition = originalPosition;
		this.elementType = elementType.name();
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

	public int getShift() {
		return actualPosition - originalPosition;
	}


}
