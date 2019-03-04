package org.nbk.designpattern.behavioural.command.example;

public class TurnOn implements RemoteInvoker {

	private ElectronicDevice electronicDevice;
	
	public TurnOn(ElectronicDevice newDevice) {
		electronicDevice = newDevice;
	}
	
	@Override
	public void execute() {
		electronicDevice.turnOn();
	}

}
