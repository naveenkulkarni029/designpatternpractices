package org.nbk.designpattern.behavioural.state.example;

public class LifeCycleStateContext {

	private LifeCycleState lifeCycleState;

	public LifeCycleStateContext() {
	}
	
	public void setLifeCycleState(LifeCycleState lifeCycleState) {
		this.lifeCycleState = lifeCycleState;
	}
	
	public LifeCycleStateContext(LifeCycleState lifeCycleState) {
		this.lifeCycleState = lifeCycleState;
	}

	public LifeCycleState getLifeCycleState() {
		return lifeCycleState;
	}
	
	public void getLifeCycle() {
		lifeCycleState.getLifeCycle(this);
	}
}
