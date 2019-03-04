package org.nbk.designpattern.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ApplicationRun {

	public static Map<Integer, String> accountTypeHashMap;

	static {
		accountTypeHashMap = new HashMap<>();
		accountTypeHashMap.put(new Integer(1), "Savings");
		accountTypeHashMap.put(new Integer(2), "Current");
		accountTypeHashMap.put(new Integer(3), "RD");
		accountTypeHashMap.put(new Integer(4), "FD");
		accountTypeHashMap.put(new Integer(5), "PPF");
		accountTypeHashMap.put(new Integer(6), "Demat");
		accountTypeHashMap.put(new Integer(7), "Deposit");
	}

	public static void main(String[] args) {

		System.out.println(AccountEnums.values()[1]);

		System.out.println("Welcome to Factory Method Demo");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("Please choose the type of account you want to create from the below options");
		printAccountTypes();

		Scanner sc = new Scanner(System.in);

		boolean correctEntry = false;
		int accountNumber = 0;
		while (!correctEntry) {
			accountNumber = sc.nextInt();
			String value = accountTypeHashMap.get(accountNumber);
			if (value != null)
				correctEntry = true;
			if (accountNumber >= 0 && accountNumber <= accountTypeHashMap.size())
				correctEntry = true;
			if(!correctEntry) {
			System.out.println("############Invalid Entry################");
			System.out.println("Please choose the proper type of account to create from the below options");
			printAccountTypes();
			}
		}
		sc.close();

		BankAccountFactory bankAccountFactory = new BankAccountFactoryImpl();
		BankAccount bankAccount = bankAccountFactory.getBankAccountType(accountNumber);
		bankAccount.createAccount();
	}

	public static void printAccountTypes() {
		for (Map.Entry<Integer, String> values : accountTypeHashMap.entrySet()) {
			System.out.println(values.getKey() + "." + values.getValue());
		}
	}

}