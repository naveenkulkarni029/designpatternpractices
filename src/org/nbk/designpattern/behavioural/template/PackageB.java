package org.nbk.designpattern.behavioural.template;

public class PackageB extends TripPlannerTemplate {

	@Override
	protected void dayOneItenaries() {
		System.out.println("PackageB dayOneItenaries");
	}

	@Override
	protected void dayTwoItenaries() {
		System.out.println("PackageB dayTwoItenaries");
	}

	@Override
	protected void dayThreeItenaries() {
		System.out.println("PackageB dayThreeItenaries");

	}
}
