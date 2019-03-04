package org.nbk.designpattern.behavioural.command.example;

public class Television implements ElectronicDevice {

	private int volume=0;
	
	@Override
	public void turnOn() {
		System.out.println("Television is On");

	}

	@Override
	public void turnOff() {
		System.out.println("Television is Off");

	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Television Volume is "+volume);

	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Television Volume is "+volume);

	}
}
