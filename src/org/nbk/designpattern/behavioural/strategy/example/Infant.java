package org.nbk.designpattern.behavioural.strategy.example;

public class Infant implements LifeCycleStrategy {

	@Override
	public void getExpenses() {
		System.out.println(" Expenses of Infants");
		System.out.println(" 1. Vaccination");
		System.out.println(" 2. Day Care");
	}
}
