package org.nbk.designpattern.behavioural.state;

public interface TransactionState {
	
	public abstract void status(TransactionStateContext ctx);

}
