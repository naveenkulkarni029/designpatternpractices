package org.nbk.designpattern.behavioural.state.example;

public class ApplicationRun {

	public static void main(String[] args) {
		LifeCycleState lifeCycleState = new Infant();
		LifeCycleStateContext lifeCycleStateContext = new LifeCycleStateContext();
		lifeCycleStateContext.setLifeCycleState(lifeCycleState);
		lifeCycleStateContext.getLifeCycle();

	}

}
