package com.atminterface.main;

import java.util.Scanner;

class Bankaccount{
	private double bankbalance;

	

	public Bankaccount(double bankbalance) {
	
		this.bankbalance = bankbalance;
	}

	public double getBankbalance() {
		return bankbalance;
	}

	public void setBankbalance(double bankbalance) {
		this.bankbalance = bankbalance;
	}
	
	public void deposite(double amount) {
		bankbalance += amount;
	}
	
	public boolean withdraw(double amount) {
		if(amount > 0 && amount <= bankbalance ) {
			bankbalance -= amount;
			return true;
		}
		else {
			return false; 
		}
	}
}

class ATM{
	private Bankaccount userbankaccount;

	

	public ATM(Bankaccount userbankaccount) {
		
		this.userbankaccount = userbankaccount;
	}

	public Bankaccount getUserbankaccount() {
		return userbankaccount;
	}

	public void setUserbankaccount(Bankaccount userbankaccount) {
		this.userbankaccount = userbankaccount;
	}
	
    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    
    public void processOption(int option, Scanner scanner) {
        switch (option) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                if (userbankaccount.withdraw(withdrawAmount)) {
                    System.out.println("Withdrawal successful. Remaining balance: " + userbankaccount.getBankbalance());
                } else {
                    System.out.println("Insufficient funds or invalid amount for withdrawal.");
                }
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                userbankaccount.deposite(depositAmount);
                System.out.println("Deposit successful. Updated balance: " + userbankaccount.getBankbalance());
                break;

            case 3:
                System.out.println("Current balance: " + userbankaccount.getBankbalance());
                break;

            case 4:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
	
	
}
public class atminterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Bankaccount userAccount = new Bankaccount(1000);
		
		  ATM atm = new ATM(userAccount);
		
	    while (true) {
            atm.displayMenu();
            System.out.print("Enter option (1-4): ");
            int option = sc.nextInt();
            atm.processOption(option, sc);
        }
	}

}
