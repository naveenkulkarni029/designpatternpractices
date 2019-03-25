package org.nbk.designpattern.behavioural.template;

public abstract class TripPlannerTemplate {
	
	public final void getPackage() {
		startTrip();
		dayOneItenaries();
		dayTwoItenaries();
		dayThreeItenaries();
		endTrip();
	}

	protected abstract void dayOneItenaries();
	protected abstract void dayTwoItenaries();
	protected abstract void dayThreeItenaries();
	
	private final void startTrip() {
		System.out.println("TripPlanner StartTrip");
	}
	
	private final void endTrip() {
		System.out.println("TripPlanner endTrip");
	}

}
