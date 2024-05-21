package com.anudip.labtwo;


class BankAccount {
	 protected double balance;

	 public BankAccount(double initialBalance) {
	     this.balance = initialBalance;
	 }

	 public void deposit(double amount) {
	     if (amount > 0) {
	         balance += amount;
	         System.out.println("Deposited: ₹" + amount);
	     } else {
	         System.out.println("Invalid deposit amount.");
	     }
	 }

	 public void withdraw(double amount) {
	     if (amount > 0 && amount <= balance) {
	         balance -= amount;
	         System.out.println("Withdrawn: ₹" + amount);
	     } else {
	         System.out.println("Invalid withdrawal amount or insufficient funds.");
	     }
	 }

	 public double getBalance() {
	     return balance;
	 }
	}


class SavingsAccount extends BankAccount {
	 private static final double WITHDRAWAL_LIMIT = 10000;

	 public SavingsAccount(double initialBalance) {
	     super(initialBalance);
	 }

	 @Override
	 public void withdraw(double amount) {
	     if (amount > 0 && amount <= WITHDRAWAL_LIMIT && amount <= balance) {
	         balance -= amount;
	         System.out.println("SavingsAccount Withdrawn: ₹" + amount);
	     } else {
	         System.out.println("Invalid withdrawal amount or exceeds savings account limit of ₹" + WITHDRAWAL_LIMIT + " or insufficient funds.");
	     }
	 }
	}


	class CheckingAccount extends BankAccount {
	 private static final double WITHDRAWAL_FEE = 50;

	 public CheckingAccount(double initialBalance) {
	     super(initialBalance);
	 }

	 @Override
	 public void withdraw(double amount) {
	     if (amount > 0 && (amount + WITHDRAWAL_FEE) <= balance) {
	         balance -= (amount + WITHDRAWAL_FEE);
	         System.out.println("CheckingAccount Withdrawn: ₹" + amount + " (Fee: ₹" + WITHDRAWAL_FEE + ")");
	     } else {
	         System.out.println("Invalid withdrawal amount or insufficient funds.");
	     }
	 }
	}


public class BankAccountTest {
	 public static void main(String[] args) {
	     BankAccount savings = new SavingsAccount(15000);
	     BankAccount checking = new CheckingAccount(15000);

	     System.out.println("Initial Savings Account Balance: ₹" + savings.getBalance());
	     savings.deposit(5000);
	     savings.withdraw(3000);
	     savings.withdraw(12000); // Should fail due to limit
	     System.out.println("Final Savings Account Balance: ₹" + savings.getBalance());

	     System.out.println("\nInitial Checking Account Balance: ₹" + checking.getBalance());
	     checking.deposit(5000);
	     checking.withdraw(3000);
	     checking.withdraw(16000); // Should fail due to insufficient funds considering the fee
	     System.out.println("Final Checking Account Balance: ₹" + checking.getBalance());
	 }
	}
