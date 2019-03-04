package org.nbk.designpattern.behavioural.command.example;

public class VolumeDown implements RemoteInvoker {

	private ElectronicDevice electronicDevice;
	
	public VolumeDown(ElectronicDevice newDevice) {
		electronicDevice = newDevice;
	}
	
	@Override
	public void execute() {
		electronicDevice.volumeDown();
	}

	
}
