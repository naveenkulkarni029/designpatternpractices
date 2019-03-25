package org.nbk.designpattern.behavioural.template;

public class PackageA extends TripPlannerTemplate{

	@Override
	protected void dayOneItenaries() {
		System.out.println("PackageA dayOneItenaries");
		
	}

	@Override
	protected void dayTwoItenaries() {
		System.out.println("PackageA dayTwoItenaries");
		
	}

	@Override
	protected void dayThreeItenaries() {
		System.out.println("PackageA dayThreeItenaries");
		
	}
}
