package org.nbk.designpattern.behavioural.state;

public class TransactionStateContext {

	private TransactionState transactionState;

	public TransactionState getTransactionState() {
		return transactionState;
	}

	public void setTransactionState(TransactionState transactionState) {
		this.transactionState = transactionState;
	}

	public TransactionStateContext() {
	}

	public TransactionStateContext(TransactionState transactionState) {
		this.transactionState = transactionState;
	}
	
	public void status() {
		transactionState.status(this);
	}

}
