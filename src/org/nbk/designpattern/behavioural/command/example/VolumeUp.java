package org.nbk.designpattern.behavioural.command.example;

public class VolumeUp implements RemoteInvoker{

	private ElectronicDevice electronicDevice;
	
	public VolumeUp(ElectronicDevice newDevice) {
		electronicDevice = newDevice;
	}
	
	@Override
	public void execute() {
		electronicDevice.volumeUp();
	}

}
