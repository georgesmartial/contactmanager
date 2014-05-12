package org.myapps.contactmanager.datamodels;

public class ContactName {

	private String firstName;
	private String lastName;
	private String middleName;
	private String honorificPrefix;
	private String honorificSuffix;

	public ContactName() {
		// Empty Contact.
	}

	public ContactName(String firstName, String lastName, String middleName,
			String honorificPrefix, String honorificSuffix) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.honorificPrefix = honorificPrefix;
		this.honorificSuffix = honorificSuffix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getHonorificPrefix() {
		return honorificPrefix;
	}

	public void setHonorificPrefix(String honorificPrefix) {
		this.honorificPrefix = honorificPrefix;
	}

	public String getHonorificSuffix() {
		return honorificSuffix;
	}

	public void setHonorificSuffix(String honorificSuffix) {
		this.honorificSuffix = honorificSuffix;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((honorificPrefix == null) ? 0 : honorificPrefix.hashCode());
		result = prime * result
				+ ((honorificSuffix == null) ? 0 : honorificSuffix.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
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
		ContactName other = (ContactName) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (honorificPrefix == null) {
			if (other.honorificPrefix != null)
				return false;
		} else if (!honorificPrefix.equals(other.honorificPrefix))
			return false;
		if (honorificSuffix == null) {
			if (other.honorificSuffix != null)
				return false;
		} else if (!honorificSuffix.equals(other.honorificSuffix))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContactName [firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", honorificPrefix="
				+ honorificPrefix + ", honorificSuffix=" + honorificSuffix
				+ "]";
	}

	public String getFormattedContactName()
	{
		return null; //TODO
	}
}
