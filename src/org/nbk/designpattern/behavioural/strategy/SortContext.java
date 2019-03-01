package org.nbk.designpattern.behavioural.strategy;

public class SortContext {

	private SortStrategy sortStrategy;
	
	public SortContext(SortStrategy sortStrategy) {
		this.sortStrategy=sortStrategy;
	}
	
	public void sortStrategyData() {
		sortStrategy.sortData();
	}
	
}
