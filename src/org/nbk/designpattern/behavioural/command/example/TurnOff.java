package org.nbk.designpattern.behavioural.command.example;

public class TurnOff implements RemoteInvoker{

	private ElectronicDevice electronicDevice;
	
	public TurnOff(ElectronicDevice newDevice) {
		electronicDevice = newDevice;
	}
	@Override
	public void execute() {
		electronicDevice.turnOff();
	}

}
