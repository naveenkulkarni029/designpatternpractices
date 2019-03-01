package org.nbk.designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Stocks {

	private String symbol;

	private double price;

	private List<Investor> listOfInvestors = new ArrayList<>();

	protected Stocks(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stocks [symbol=");
		builder.append(symbol);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	public String getSymbol() {
		return symbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price!=this.price) {
			this.price=price;
			notifyInvestor();
		}
	}
	
	public void attachInvestor(Investor investor) {
		listOfInvestors.add(investor);
	}
	
	public void dettachInvestor(Investor investor) {
		listOfInvestors.remove(investor);
	}
	
	public void notifyInvestor() {
		for(Investor investor: listOfInvestors) {
			investor.updateStocks(this);
		}
	}
}
