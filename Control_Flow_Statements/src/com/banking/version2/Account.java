package com.banking.version2;

public class Account {
	private String account_number;
	private String name;
	private double balance;
	private final static double MINIMUM_BALACE = 1000.00;

	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		if(account_number ==null) {
			System.out.println("Invalid Account Number");
			System.exit(0);
		}else {
			this.account_number=account_number;
		}
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name ==null) {
			System.out.println("Invalid Name");
			System.exit(0);
		}else {
			this.name=name;
		}
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance <=0.0) {
			System.out.println("Invalid balance");
			System.exit(0);
		}else {
			this.balance=balance;
		}
		this.balance = balance;
	}
	public static double getMinimumBalace() {
		return MINIMUM_BALACE;
	}
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited Sucessfully...........");
		System.out.println("Available balnce is"+balance);
	
	}
	public void withdraw(double amount) {
		if(balance >=1000.00) {
			balance = balance - amount;
		System.out.println("Amount Withdrawn Sucessfully...........");
		System.out.println("Available balance is"+balance);
	
	}else {
		System.out.println("Insufficent funds");
	}
}

}