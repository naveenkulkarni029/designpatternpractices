package org.nbk.designpattern.behavioural.strategy.example;

public class LifeCycleStrategyContext {
	
	private LifeCycleStrategy lifeCycleStrategy;

	public LifeCycleStrategyContext(LifeCycleStrategy lifeCycleStrategy) {
		this.lifeCycleStrategy = lifeCycleStrategy;
	}
	
	public void getExpenses() {
		lifeCycleStrategy.getExpenses();
	}

}
