package org.nbk.designpattern.behavioural.command.example;

public class Radio implements ElectronicDevice {

	public int volume = 0;
	
	@Override
	public void turnOn() {
		System.out.println("Radio is On");

	}

	@Override
	public void turnOff() {
		System.out.println("Radio is Off");

	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Radio Volume is "+volume);

	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Radio Volume is "+volume);

	}

}
