package com.Account;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ref=new SavingAccount(01,"Dev",123,5678);
		ref.deposite(123);
		
		
		System.out.println(ref);
	}

}
