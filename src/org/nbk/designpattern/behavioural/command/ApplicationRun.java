package org.nbk.designpattern.behavioural.command;

public class ApplicationRun {

	public static void main(String[] args) {
		System.out.println("Dusky acha hai");
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommandImplA(receiver);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.executeCommand();
	}
}
