package org.module.eer.jenetics.split.constraint;

import java.util.List;

public class BasicConstraint {
	
	// Id of the Relationship Element
	private int elementId;
	// Elements that points to size <= 2
	private List<Integer> elements;	
		
	public BasicConstraint(int elementId, List<Integer> elements) {
		this.elementId = elementId;
		this.elements = elements;		
	}

	public int getElementId() {
		return elementId;
	}

	public void setElementId(int elementId) {
		this.elementId = elementId;
	}

	public List<Integer> getElements() {
		return elements;
	}

	public void setElements(List<Integer> elements) {
		this.elements = elements;
	}	
}
