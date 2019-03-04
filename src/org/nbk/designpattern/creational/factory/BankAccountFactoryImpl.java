package org.nbk.designpattern.creational.factory;

import java.util.HashMap;
import java.util.Map;

public class BankAccountFactoryImpl implements BankAccountFactory {

	private Map<AccountEnums, BankAccount> bankAccountMap;

	{
		bankAccountMap = new HashMap<>();
		bankAccountMap.put(AccountEnums.SAVINGS, new SavingsAccount());
		bankAccountMap.put(AccountEnums.CURRENT, new CurrentAccount());
		bankAccountMap.put(AccountEnums.PPF, new PpfAccount());
		bankAccountMap.put(AccountEnums.DEMAT, new DematAccount());
		bankAccountMap.put(AccountEnums.FD, new FDAccount());
		bankAccountMap.put(AccountEnums.RD, new RDAccount());
		bankAccountMap.put(AccountEnums.DEPOSITS, new DepositAccount());
	}

	// Simple
	@Override
	public BankAccount getBankAccountType(String bankAccountType) {
		if ("Savings".equalsIgnoreCase(bankAccountType)) {
			return new SavingsAccount();
		} else if ("Current".equalsIgnoreCase(bankAccountType)) {
			return new CurrentAccount();
		} else if ("Deposit".equalsIgnoreCase(bankAccountType)) {
			return new DepositAccount();
		} else if ("FD".equalsIgnoreCase(bankAccountType)) {
			return new FDAccount();
		} else if ("RD".equalsIgnoreCase(bankAccountType)) {
			return new RDAccount();
		} else if ("PPF".equalsIgnoreCase(bankAccountType)) {
			return new PpfAccount();
		} else if ("Demat".equalsIgnoreCase(bankAccountType)) {
			return new DematAccount();
		}
		return null;
	}

	// Optimized way

	@Override
	public BankAccount getBankAccountType(int bankAccountType) {

		AccountEnums accountType = AccountEnums.values()[bankAccountType];
		return bankAccountMap.get(accountType);
	}
}
