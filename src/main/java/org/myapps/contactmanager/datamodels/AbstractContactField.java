package org.myapps.contactmanager.datamodels;

public abstract class AbstractContactField implements ContactField {

	protected String type;
	protected String value;
	protected boolean preferredValue;

	public AbstractContactField() {
		// Empty Contact Field.
	}

	public AbstractContactField(String type, String value,
			boolean preferredValue) {
		super();
		this.type = type;
		this.value = value;
		this.preferredValue = preferredValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isPreferredValue() {
		return preferredValue;
	}

	public void setPreferredValue(boolean preferredValue) {
		this.preferredValue = preferredValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (preferredValue ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractContactField other = (AbstractContactField) obj;
		if (preferredValue != other.preferredValue)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AbstractContactField [type=" + type + ", value=" + value
				+ ", preferredValue=" + preferredValue + "]";
	}

}
