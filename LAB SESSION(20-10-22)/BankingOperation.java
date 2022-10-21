package com.Assignments;
/*
 * /*
 * Problem 2.
Banking Operations relate a class with customer private instance
variables as accountNumber,accountName,accountBalance and
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two
customers

 */
 
public class BankingOperation {
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	double amount;
	BankingOperation(int accountNumber,String accountName,double accountBalance){
		this.accountNumber=accountNumber;
		this.accountName=accountName;
		this.accountBalance=accountBalance;
	}
	public void setAmount(double amount) {
		this.amount=amount;
		this.accountBalance=this.accountBalance+amount;
	}
	public void getAmount() {
		System.out.println("AccountBalance " +this.accountBalance);
		System.out.println("AccountName " +this.accountName);
	}
	public void withdrawAmount(int withAmount) {
		this.accountBalance=this.accountBalance-withAmount;
	}
}
