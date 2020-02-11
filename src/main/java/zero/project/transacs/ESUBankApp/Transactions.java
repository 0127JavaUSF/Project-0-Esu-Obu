package zero.project.transacs.ESUBankApp;

import java.util.Scanner;

import zero.project.models.ESUBankApp.Account;

//import zero.project.models.ESUBankApp.Account;
//import zero.project.models.ESUBankApp.Customer;
//import zero.project.views.ESUBankApp.AccountsView;

public  class Transactions {
	private String userName;
	private String password;
	private double amount;
	private double balance;
	private double previousTransaction;
	private int accntNUm;
	private int routingNum;
	public boolean isSingle;
	public boolean isChecking; 
	
	
	
//Constructor	
	public Transactions(String userName, String password, double amount, double balance, int accntNum, boolean isSingle, boolean isChecking) {
		super();
		this.userName = userName;
		this.password = password;
		this.amount = amount;
		this.balance = balance;
		this.accntNUm = accntNum;
		this.isSingle = isSingle;
		this.isChecking = isChecking;
	}

	/*
	 * if (this.isSingle == true && this.isChecking == true) { String status =
	 * "Single-checking";
	 * 
	 * } else {
	 * 
	 * }
	 */
	
public Transactions() {
		// TODO Auto-generated constructor stub
	}

//Transaction Methods that will be called
	public void depositMoney() {	
		//scanner object created
		Scanner scanner = new Scanner(System.in);
		//Prompt user for deposit amount
		System.out.println("Please enter your deposit amount: ");	
		
		amount = scanner.nextDouble();
		if (amount != 0) {
			this.balance = this.balance + this.amount;
			previousTransaction += this.balance;
			System.out.println("Deposit of " +  this.amount + " heart(s) was successful. Current balance = " + previousTransaction);
		}
		//Extra remarks based on whether user has single or join account
		if (isSingle == true) {
			System.out.println("It's okay to save a little love for youself.");
		} else {
			System.out.println("You must be saving up some money for your hot date, huh?");
		}			
		
	}
	
	
	public void withdrawalMoney() {
	//Prompt user for withdrawal amount
		System.out.println("Please enter your withdrawal amount: ");	
	    Scanner scanner = new Scanner(System.in);
		amount = scanner.nextDouble();
		System.out.println("Is " + amount + " hearts correct? ");
		//checks if amount is greater than 0
		
		this.balance = this.balance - amount;
		previousTransaction += this.balance;
		String answer = scanner.next();
		
		while (answer.equals("y"))
		{
			if (amount > 0) {
			System.out.println("Deposit of " +  amount + " heart(s) was successful. Current balance is " + previousTransaction + " hearts");
			} else if (amount == 0) {//checks if amount = 0
				System.out.println("Insufficient amount of hearts int your account. Withdrawal cannot be processed");
			} else { //if less than 0, it returns this
				System.out.println("Insufficient amount of hearts int your account. Withdrawal cannot be processed");
			}
			
			//Extra remarks based on whether user has single or join account
			if (isSingle == true || amount > 50) {
				System.out.println("It's okay to save a little bit of love for youself.");
			} else {
				System.out.println("You must be saving up some love for your special someone, huh?");
			}
			
		}
			
		
	}
		
		
	public void transferMoney() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your account number: ");
		accntNUm = scanner.nextInt();	
		
		
		System.out.println("Please enter the routing number of the person you wish to send some love to: ");
		routingNum = scanner.nextInt();				
		//checks if routing number is valid
		if(routingNum == Account.getRoutingNum()) {
			
			
		}
		
		
	}
	
	public void checkBalance() {
		
	}

	
    public void closeAccount() {
	  
    }
	  
	  
	
/// Getters and Setters ///////////////////////////////////////////////////////////////
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getAccntNUm() {
		return accntNUm;
	}

	public void setAccntNUm(int accntNUm) {
		this.accntNUm = accntNUm;
	}

	public int getRoutingNum() {
		return routingNum;
	}

	public void setRoutingNum(int routingNum) {
		this.routingNum = routingNum;
	}

	public boolean isSingle() {
		return isSingle;
	}

	public void setSingle(boolean isSingle) {
		this.isSingle = isSingle;
	}

	public boolean isChecking() {
		return isChecking;
	}

	public void setChecking(boolean isChecking) {
		this.isChecking = isChecking;
	}
	
	
	
	
	
	
	
	

	 
	
	
	
	
}
