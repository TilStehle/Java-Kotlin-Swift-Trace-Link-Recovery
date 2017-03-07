package de.unihamburg.masterprojekt2016.traceability;

/**
 * @author Jakob Andersen
 * 
 * @see TypePointer
 */

public enum TypePointerClassification {
	CLASS, INNER_CLASS, ANONYMOUS_CLASS, EXTENSION, INTERFACE, ENUM, STRUCT, NO_CLASSIFICATION;

	public boolean isClass() {
		switch (this) {
		case CLASS:
		case INNER_CLASS:
		case ANONYMOUS_CLASS:
			return true;
		default:
			return false;
		}
	}
	
	public boolean isStruct() {
		switch (this) {
		case STRUCT:
			return true;
		default:
			return false;
		}
	}

	public boolean isInterface() {
		switch (this) {
		case INTERFACE:
			return true;
		default:
			return false;
		}
	}

	public boolean isEnum() {
		switch (this) {
		case ENUM:
			return true;
		default:
			return false;
		}
	}

	public boolean isExtension() {
		switch (this) {
		case EXTENSION:
			return true;
		default:
			return false;
		}
	}
}