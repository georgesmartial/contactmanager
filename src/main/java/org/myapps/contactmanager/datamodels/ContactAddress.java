package org.myapps.contactmanager.datamodels;

public class ContactAddress {

	private String streetAddress;
	private String Region;
	private String postalCode;
	private String locality;
	private String country;

	public ContactAddress() {
		// Empty Contact Address.
	}

	public ContactAddress(String streetAddress, String region,
			String postalCode, String locality, String country) {
		super();
		this.streetAddress = streetAddress;
		Region = region;
		this.postalCode = postalCode;
		this.locality = locality;
		this.country = country;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Region == null) ? 0 : Region.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((locality == null) ? 0 : locality.hashCode());
		result = prime * result
				+ ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result
				+ ((streetAddress == null) ? 0 : streetAddress.hashCode());
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
		ContactAddress other = (ContactAddress) obj;
		if (Region == null) {
			if (other.Region != null)
				return false;
		} else if (!Region.equals(other.Region))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (locality == null) {
			if (other.locality != null)
				return false;
		} else if (!locality.equals(other.locality))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (streetAddress == null) {
			if (other.streetAddress != null)
				return false;
		} else if (!streetAddress.equals(other.streetAddress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContactAddress [streetAddress=" + streetAddress + ", Region="
				+ Region + ", postalCode=" + postalCode + ", locality="
				+ locality + ", country=" + country + "]";
	}

	public String getFormattedContactAddress()
	{
		return null; // TODO
	}
}
