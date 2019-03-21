package org.nbk.designpattern.structural.facade;

public class AccountFacade {
	
	private Customer customer = new Customer("Navee", "Navee", "Naevv");
	private Address address = new Address(customer.getCustomerId(), "NAvee", "NAvee");
	private Contact contact = new Contact(customer.getCustomerId(), "NAve", "Navee");
	public boolean validateAccount() {
		boolean customerValidationResult = customer.validateCustomerDetails();
		boolean addressValidationResult = address.validateAddress();
		boolean contactValidationResult = contact.validateContact();
		if(customerValidationResult && addressValidationResult && contactValidationResult) {
			return true;
		}
		
		return false;
	}
	

}
