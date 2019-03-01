package org.nbk.designpattern.behavioural.state;

public class RDAccount extends BankAccount{

	@Override
	public void createAccount() {
		System.out.println("RD Account is created");

	}

	@Override
	public void status(TransactionStateContext ctx) {
		System.out.println("RD Account Status");
	}

}
