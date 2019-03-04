package org.nbk.designpattern.behavioural.command.example;

public class ApplicationRun {
	
	public static void main(String[] args) {
		ElectronicDevice myDevice= Remote.getRemoteType();
		TurnOn on = new TurnOn(myDevice);
		on.execute();
		
		VolumeUp volumeUp = new VolumeUp(myDevice);
		volumeUp.execute();
		volumeUp.execute();
		volumeUp.execute();
	}

}
