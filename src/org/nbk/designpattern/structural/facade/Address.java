package org.nbk.designpattern.structural.facade;

public class Address {

	private String customerId;
	private String addressId;
	private String address1;
	private String address2;

	public Address(String customerId, String address1, String address2) {
		super();
		this.customerId = customerId;
		this.address1 = address1;
		this.address2 = address2;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public boolean validateAddress() {
		if(this.address1!=null && this.customerId!=null) {
			System.out.println("Address validated");
			return true;
		}
		System.out.println("Address Not validated");
		return false;
	}
}
