package com.Account;

public class SalaryAccount extends Account {

	int timeLimit;
	
	public SalaryAccount() {
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(int actId, String actName, double intrest, double balance) {
		super(actId, actName, intrest, balance);
		// TODO Auto-generated constructor stub
	}

	public int getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	
	
	
}
