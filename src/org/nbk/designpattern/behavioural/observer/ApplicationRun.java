package org.nbk.designpattern.behavioural.observer;

public class ApplicationRun {
	
	public static void main(String[] args) {
		IBM ibm = new IBM("IBM", 120.22);
		ibm.attachInvestor(new InvestorImpl("Naveen"));
		ibm.attachInvestor(new InvestorImpl("ershad"));
		ibm.setPrice(125.00);
		ibm.setPrice(80.55);
		
	}

}
