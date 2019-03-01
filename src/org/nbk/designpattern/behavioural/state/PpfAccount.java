package org.nbk.designpattern.behavioural.state;

public class PpfAccount extends BankAccount{

	@Override
	public void createAccount() {
		System.out.println("PPF Account is created");

	}

	@Override
	public void status(TransactionStateContext ctx) {
		System.out.println("Ppf Account Status");
	}

}