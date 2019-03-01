package org.nbk.designpattern.behavioural.state;

public class SavingsAccount extends BankAccount{

	@Override
	public void createAccount() {
		System.out.println("Savings Account is created");

	}

	@Override
	public void status(TransactionStateContext ctx) {
		System.out.println("Saving Account Status");
	}

}