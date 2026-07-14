package com.Account;

public abstract class Account {
	int actId;
	String actName;
	double Intrest;
	double Balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int actId, String actName, double intrest, double balance) {
		super();
		this.actId = actId;
		this.actName = actName;
		Intrest = intrest;
		Balance = balance;
	}

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public double getIntrest() {
		return Intrest;
	}

	public void setIntrest(double intrest) {
		Intrest = intrest;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public void deposite(double amt)
	{
		Balance+=amt;
	}
	
	public void withdrow(double amt)
	{
		Balance-=amt;
	}
	
	

}
