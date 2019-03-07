package org.nbk.designpattern.behavioural.strategy.example;

public class ApplicationRun {

	public static void main(String[] args) {
		LifeCycleStrategy lifeCycleStrategy = new Infant();
		LifeCycleStrategyContext lifeCycleStrategyContext = new LifeCycleStrategyContext(lifeCycleStrategy);
		lifeCycleStrategyContext.getExpenses();
		
	}
}
