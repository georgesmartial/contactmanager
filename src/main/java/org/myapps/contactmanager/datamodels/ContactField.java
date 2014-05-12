package org.myapps.contactmanager.datamodels;

public interface ContactField {

	// TODO list of contact fields type in public static final.

	public void setType(String type);

	public void setValue(String value);

	public void setPreferredValue(boolean preferredValue);

	public String getFormattedContactField();
}
