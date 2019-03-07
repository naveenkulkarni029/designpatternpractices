package org.nbk.designpattern.behavioural.state.example;

public class Infant implements LifeCycleState{

	@Override
	public void getLifeCycle(LifeCycleStateContext ctx) {
		System.out.println("I am an Infant");
	}

	
}
