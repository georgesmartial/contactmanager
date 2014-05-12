package org.myapps.contactmanager.datamodels;

import java.util.Date;
import java.util.List;

public class Contact {

	private String displayedName;
	private ContactName name;
	private String nickName;

	private List<ContactField> phoneNumbers;
	private List<ContactField> emails;
	private List<ContactField> iMs;
	private List<ContactField> photos;
	private List<ContactField> urls;

	private List<ContactAddress> addresses;

	private Date birthday;
	private String note;

	public Contact() {
		// Empty Contact.
	}

	public Contact(String displayedName, ContactName name, String nickName,
			List<ContactField> phoneNumbers, List<ContactField> emails,
			List<ContactField> iMs, List<ContactField> photos,
			List<ContactField> urls, List<ContactAddress> addresses,
			Date birthday, String note) {
		super();
		this.displayedName = displayedName;
		this.name = name;
		this.nickName = nickName;
		this.phoneNumbers = phoneNumbers;
		this.emails = emails;
		this.iMs = iMs;
		this.photos = photos;
		this.urls = urls;
		this.addresses = addresses;
		this.birthday = birthday;
		this.note = note;
		// TODO Add others useful constructors.
	}

	public String getDisplayedName() {
		return displayedName;
	}

	public void setDisplayedName(String displayedName) {
		this.displayedName = displayedName;
	}

	public ContactName getName() {
		return name;
	}

	public void setName(ContactName name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public List<ContactField> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<ContactField> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<ContactField> getEmails() {
		return emails;
	}

	public void setEmails(List<ContactField> emails) {
		this.emails = emails;
	}

	public List<ContactField> getiMs() {
		return iMs;
	}

	public void setiMs(List<ContactField> iMs) {
		this.iMs = iMs;
	}

	public List<ContactField> getPhotos() {
		return photos;
	}

	public void setPhotos(List<ContactField> photos) {
		this.photos = photos;
	}

	public List<ContactField> getUrls() {
		return urls;
	}

	public void setUrls(List<ContactField> urls) {
		this.urls = urls;
	}

	public List<ContactAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<ContactAddress> addresses) {
		this.addresses = addresses;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
		// TODO Add useful delegate methods.
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((addresses == null) ? 0 : addresses.hashCode());
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result
				+ ((displayedName == null) ? 0 : displayedName.hashCode());
		result = prime * result + ((emails == null) ? 0 : emails.hashCode());
		result = prime * result + ((iMs == null) ? 0 : iMs.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result
				+ ((phoneNumbers == null) ? 0 : phoneNumbers.hashCode());
		result = prime * result + ((photos == null) ? 0 : photos.hashCode());
		result = prime * result + ((urls == null) ? 0 : urls.hashCode());
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
		Contact other = (Contact) obj;
		if (addresses == null) {
			if (other.addresses != null)
				return false;
		} else if (!addresses.equals(other.addresses))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (displayedName == null) {
			if (other.displayedName != null)
				return false;
		} else if (!displayedName.equals(other.displayedName))
			return false;
		if (emails == null) {
			if (other.emails != null)
				return false;
		} else if (!emails.equals(other.emails))
			return false;
		if (iMs == null) {
			if (other.iMs != null)
				return false;
		} else if (!iMs.equals(other.iMs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (phoneNumbers == null) {
			if (other.phoneNumbers != null)
				return false;
		} else if (!phoneNumbers.equals(other.phoneNumbers))
			return false;
		if (photos == null) {
			if (other.photos != null)
				return false;
		} else if (!photos.equals(other.photos))
			return false;
		if (urls == null) {
			if (other.urls != null)
				return false;
		} else if (!urls.equals(other.urls))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [displayedName=" + displayedName + ", name=" + name
				+ ", nickName=" + nickName + ", phoneNumbers=" + phoneNumbers
				+ ", emails=" + emails + ", iMs=" + iMs + ", photos=" + photos
				+ ", urls=" + urls + ", addresses=" + addresses + ", birthday="
				+ birthday + ", note=" + note + "]";
	}

	public String getFormattedContact() {
		return null; // TODO
	}

}
