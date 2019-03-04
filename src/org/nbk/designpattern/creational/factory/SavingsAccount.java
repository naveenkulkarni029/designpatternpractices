package org.nbk.designpattern.creational.factory;

public class SavingsAccount extends BankAccount {

	@Override
	public void createAccount() {
		System.out.println("Savings Account is created");

	}

}