package org.nbk.designpattern.structural.facade;

public class Contact {

	private String customerId;
	private String contactId;
	private String contactNumber;
	private String emailAddress;

	public Contact(String customerId, String contactNumber, String emailAddress) {
		super();
		this.customerId = customerId;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean validateContact() {
		if(this.contactNumber!=null && this.customerId!=null) {
			System.out.println("Contact validated");
			return true;
		}
		System.out.println("Contact  Not validated");
		return false;
	}
}
