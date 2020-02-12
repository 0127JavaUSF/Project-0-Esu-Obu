package zero.project.transacs.ESUBankApp;

import java.util.Scanner;

import zero.project.daos.ESUBankApp.AccountsDao;
import zero.project.models.ESUBankApp.Account;
import zero.project.util.ESUBankApp.UserInputUtil;

//import zero.project.models.ESUBankApp.Account;
//import zero.project.models.ESUBankApp.Customer;
//import zero.project.views.ESUBankApp.AccountsView;

public  class Transactions {
	public String userName;
	public String password;
	public static double amount;
	public static double balance;
	public static double previousTransaction;
	private int accntNUm;
	private int routingNum;
	private boolean isChecking;
	private boolean isSingle;
	/*
	 * public static boolean isSingle; public boolean isChecking;
	 */ 
	
	
	
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
	public static void depositMoney() {	
		//scanner object created
		Scanner scanner = new Scanner(System.in);
		//Prompt user for deposit amount
		System.out.println("Please enter your deposit amount: ");	
		
		amount = scanner.nextDouble();
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction += balance;
			System.out.println("Deposit of " +  amount + " heart(s) was successful. Current balance = " + previousTransaction);
		}
		/*
		 * //Extra remarks based on whether user has single or join account if (isSingle
		 * == true) {
		 * System.out.println("It's okay to save a little love for youself."); } else {
		 * System.out.println("You must be saving up some money for your hot date, huh?"
		 * ); }
		 */		
		
	}
	
	
	public void withdrawalMoney() {
	//Prompt user for withdrawal amount
		System.out.println("Please enter your withdrawal amount: ");	
	    Scanner scanner = new Scanner(System.in);
		amount = scanner.nextDouble();
		System.out.println("Is " + amount + " hearts correct? Type yes or no.");
		//checks if amount is greater than 0
		
		Transactions.balance = Transactions.balance - amount;
		previousTransaction += Transactions.balance;
		String answer = scanner.next();	
		
		while (answer.equals("no"))
		{
			System.out.println("Please enter try again: ");
			amount = scanner.nextDouble();
			break;
		} 
		if (amount > 0) {
			System.out.println("Deposit of " +  amount + " heart(s) was successful. Current balance is " + previousTransaction + " hearts");
			} else if (amount == 0) {//checks if amount = 0
				System.out.println("Insufficient amount of hearts int your account. Withdrawal cannot be processed");
			} else { //if less than 0, it returns this
				System.out.println("Insufficient amount of hearts int your account. Withdrawal cannot be processed");
			}
			
		/*
		 * //Extra remarks based on whether user has single or join account if (isSingle
		 * == true || amount > 50) {
		 * System.out.println("It's okay to save a little bit of love for youself."); }
		 * else { System.out.
		 * println("You must be saving up some love for your special someone, huh?"); }
		 * 
		 * return;
		 */

		
	}
		
		
	public void transferMoney() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your account number: ");
		accntNUm = scanner.nextInt();	
		
		
		System.out.println("Please enter the routing number of the person you wish to send some hearts to: ");
		routingNum = scanner.nextInt();				
		//checks if routing number is valid
		if(routingNum == Account.getRoutingNum()) {
			
			
		}
		
		
	}
	
	
	
	public void checkBalance() {
		System.out.println("Enter your account number ");
		int accntNum = UserInputUtil.getNextInt();
		AccountsDao.getAccount(accntNum);
		double balance = Account.getBalance();
		System.out.println("You have a balance of " + balance + "hearts");
	}

	
    public void closeAccount() {
	  System.out.println("Enter account number of the heart you are breaking... "
	  		+ "\n Uh, I mean account you wish to close ");
	  int accntNum = UserInputUtil.getNextInt();
	  AccountsDao.closeAccount(accntNum);
	  System.out.println("You have officially broken heart number " + accntNum 
			  +"\n ... It is officially closed");
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
