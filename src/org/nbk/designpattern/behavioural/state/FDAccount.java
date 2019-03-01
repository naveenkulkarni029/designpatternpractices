package org.nbk.designpattern.behavioural.state;

public class FDAccount extends BankAccount {

	@Override
	public void createAccount() {
		System.out.println("FD Account is created");

	}

	@Override
	public void status(TransactionStateContext ctx) {
		System.out.println("FD Account Status");
	}

}
