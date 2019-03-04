package org.nbk.designpattern.behavioural.command.example;

public class Remote {

	public static ElectronicDevice getRemoteType() {
		return new Television();
	}
	
}
