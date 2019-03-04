package org.nbk.designpattern.creational.factory;

public interface BankAccountFactory {

	public BankAccount getBankAccountType(String bankAccountType);
	public BankAccount getBankAccountType(int bankAccountType);

}