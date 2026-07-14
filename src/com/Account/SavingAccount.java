package com.Account;

public class SavingAccount extends Account{

	double minBalance;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int actId, String actName, double intrest, double balance) {
		super(actId, actName, intrest, balance);
		// TODO Auto-generated constructor stub
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	
}
