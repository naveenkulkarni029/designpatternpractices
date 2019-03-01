package org.nbk.designpattern.behavioural.strategy;

public class ApplicationRun {

	public static void main(String[] args) {
		SortContext context = new SortContext(new SortStrategyA());
		context.sortStrategyData();
		context = new SortContext(new SortStrategyB());
		context.sortStrategyData();
	}
	
}
