package com.onkar.bank;// collection of logical classes

public class BankAccount {
	//static variable
	private static int autoAccountNo;
	
	
	//instance variable/ class variable (we cannot use instance variable if object are not created/not exist.
private int accountNo;
private String accountHolderName;
private double accountBalance;
//init block (befor each constructor init block will executed)
{
	
	accountNo=++autoAccountNo;
}
//constructor overloading
//default constructor (at time of object creator constructor get automatically call)
public BankAccount() {
	
	accountHolderName="Unknown";
	accountBalance=0;
	
	
}
//parameterize constructor
public BankAccount(String accountHolderName,double accountBalance){

	this.accountHolderName=accountHolderName;
	this.accountBalance=accountBalance;
	
	
	
}
//reinitialise or modify existing member values we use setter method
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
//getter methods
public String getAccountHolderName() {
	return accountHolderName;
}

public double getAccountBalance() {
	return accountBalance;
}
//service methods
public void withdraw(double amount)
{
	if(amount<=0)
		{
		System.out.println("enter positive value");
		
		}
	else if(amount>accountBalance){
		System.out.println("enter valid value");
	}
	else
	{
		this.accountBalance-=amount;
	}
}
public void deposit(double amount)
{
	if(amount<=0)
		{
		System.out.println("enter valid input");
		}
	else{
		
		this.accountBalance+=amount;
		}
}
public static void main(String[] args)
{
	BankAccount acc=new BankAccount();
	BankAccount acc2=new BankAccount("onkar",50000);
}
}


