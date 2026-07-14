package com.Account;

public class CurrentAccount extends Account {

	double withDrowLimit;
	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int actId, String actName, double intrest, double balance) {
		super(actId, actName, intrest, balance);
		// TODO Auto-generated constructor stub
	}

	public double getWithDrowLimit() {
		return withDrowLimit;
	}

	public void setWithDrowLimit(double withDrowLimit) {
		this.withDrowLimit = withDrowLimit;
	}
	
	
}
