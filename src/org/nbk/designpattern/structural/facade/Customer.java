package org.nbk.designpattern.structural.facade;

public class Customer {

	private String customerId;
	private String fName;
	private String mName;
	private String lName;

	public Customer(String fName, String mName, String lName) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	public boolean validateCustomerDetails() {
		if(this.fName!=null) {
			System.out.println("Customer validated");
			return true;
		}
		System.out.println("Customer  Not validated");
		return false;
	}
}
