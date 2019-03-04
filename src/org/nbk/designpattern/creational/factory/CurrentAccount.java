package org.nbk.designpattern.creational.factory;

public class CurrentAccount extends BankAccount {

	@Override
	public void createAccount() {
		System.out.println("Current Account is created");

	}

}
