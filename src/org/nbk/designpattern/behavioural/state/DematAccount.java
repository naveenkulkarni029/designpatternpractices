package org.nbk.designpattern.behavioural.state;

public class DematAccount extends BankAccount{

	@Override
	public void createAccount() {
		System.out.println("Demat Account is created");

	}

	@Override
	public void status(TransactionStateContext ctx) {
		System.out.println("Demat Account Status");
	}

}