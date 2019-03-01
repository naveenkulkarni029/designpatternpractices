package org.nbk.designpattern.behavioural.observer;

public class InvestorImpl implements Investor{

	private String name;
	private Stocks stocks;

	public InvestorImpl(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Stocks getStocks() {
		return stocks;
	}

	public void setStocks(Stocks stocks) {
		this.stocks = stocks;
	}
	
	public void updateStocks(Stocks stocks) {
		System.out.println("Stock update");
		System.out.println(this.name);
		System.out.println(stocks);
	}
	
}
