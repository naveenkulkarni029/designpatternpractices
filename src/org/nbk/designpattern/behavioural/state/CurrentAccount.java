package org.nbk.designpattern.behavioural.state;

public class CurrentAccount extends BankAccount{

	@Override
	public void createAccount() {
		System.out.println("Current Account is created");

	}

	@Override
	public void status(TransactionStateContext ctx) {
		System.out.println("Current Account Status");
	}
}
