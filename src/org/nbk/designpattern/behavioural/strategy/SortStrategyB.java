package org.nbk.designpattern.behavioural.strategy;

public class SortStrategyB implements SortStrategy {

	@Override
	public void sortData() {
		sortDataB();
	}
	
	private void sortDataB() {
		System.out.println("sortDataB");
	}

}
