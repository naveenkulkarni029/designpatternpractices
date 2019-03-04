package org.nbk.designpattern.creational.factory;

public class DepositAccount extends BankAccount {

	@Override
	public void createAccount() {
		System.out.println("Deposit Account is created");

	}

}