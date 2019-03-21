package org.nbk.designpattern.structural.facade;

public class ApplicationRun {
	
	public static void main(String[] args) {
		AccountFacade facade = new AccountFacade();
		boolean validateAccountFacade = facade.validateAccount();
		
		if(validateAccountFacade) {
			System.out.println("Customer Details validated successfully");
		}
		else {
			System.out.println("Failed to validate customer Details");
		}
	}

}
