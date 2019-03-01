package org.nbk.designpattern.behavioural.strategy;

public class SortStrategyA implements SortStrategy {

	@Override
	public void sortData() {
sortDataA();
	}
	
	private void sortDataA() {
		System.out.println("sortDataA");
	}

}
