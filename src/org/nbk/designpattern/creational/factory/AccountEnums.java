package org.nbk.designpattern.creational.factory;

public enum AccountEnums {
NONE("0"),SAVINGS("1"),CURRENT("2"),RD("3"),FD("4"),PPF("5"),DEMAT("6"),DEPOSITS("7");
	
	private String value;
	
	private AccountEnums(String value) {

		this.value=value;
	}
	
	
	public String getValue()
	{
		return value;
	}
}
