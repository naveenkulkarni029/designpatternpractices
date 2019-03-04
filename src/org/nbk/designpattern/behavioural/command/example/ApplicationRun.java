package org.nbk.designpattern.behavioural.command.example;

public class ApplicationRun {
	
	public static void main(String[] args) {
		ElectronicDevice myDevice= Remote.getRemoteType();
		TurnOn on = new TurnOn(myDevice);
		on.execute();
	}

}
