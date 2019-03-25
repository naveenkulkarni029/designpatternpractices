package org.nbk.designpattern.behavioural.template;

public class ApplicationRun {

	public static void main(String[] args) {
		
		TripPlannerTemplate tripPlanner = new PackageA();
		tripPlanner.getPackage();
		
		tripPlanner = new PackageB();
		tripPlanner.getPackage();
	}
	
}
