package org.nbk.designpattern.behavioural.command;

public class ConcreteCommandImplA extends Command {

	public ConcreteCommandImplA(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.action();
		
	}

}
