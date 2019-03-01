package org.nbk.designpattern.behavioural.state;

public class DepositAccount extends BankAccount{

	@Override
	public void createAccount() {
		System.out.println("Deposit Account is created");

	}

	@Override
	public void status(TransactionStateContext ctx) {
		System.out.println("Deposit Account Status");
	}

}
