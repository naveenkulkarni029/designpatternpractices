package org.nbk.designpattern.behavioural.state;

public interface BankAccountFactory {

	public BankAccount getBankAccountType(String bankAccountType);
	public BankAccount getBankAccountType(int bankAccountType);

}
