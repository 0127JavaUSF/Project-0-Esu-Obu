package zero.project.views.ESUBankApp;

import zero.project.daos.ESUBankApp.AccountsDao;
import zero.project.daos.ESUBankApp.CustomerDao;
import zero.project.models.ESUBankApp.Account;
//import zero.project.exceptions.ESUBankApp.ValidationException;
import zero.project.models.ESUBankApp.Customer;
import zero.project.services.ESUBankApp.CustomerServiceInterface;
import zero.project.util.ESUBankApp.UserInputUtil;
import zero.project.views.ESUBankApp.MainMenu;
import zero.project.views.ESUBankApp.View;


public class CustomerView implements View {
	
	CustomerServiceInterface customerService;
	
	public String userName;
	public String password;
	public static double amount;
	public static double balance;
	private int accntNum;
	private int routingNum;
	private boolean isChecking;
	private boolean isSingle;	
		
		
		public void showMenu() {
			System.out.println("\n");
			System.out.println("Welcome to your account options.");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal");
			System.out.println("3. Check Balance");
			System.out.println("4. Transfer Money");
			System.out.println("5. Close Account");
			System.out.println("6. Create User Pofile");
			System.out.println("0. Back");			
			System.out.println("------------------------------------------------------------------------------");
			
			
		}
	
	
	  @Override 
	  public View selectOption() { 	  
			int selectedItem = UserInputUtil.getIntInRange(0, 6);
			
			switch(selectedItem) {
			case 0: new MainMenu(); return null;
			case 1: depositMoney();
			case 2: withdrawalMoney();
			case 3: checkBalance();
			case 4: transferMoney();
			case 5: closeAccount(); return null;
			case 6: createUser();
			default: return null;
			}    	  
		   
	  }


	private void createUser() {
		Customer  createUser = null;
		  
		 while (createUser == null) {
			 String custName = UserInputUtil.getNextString();
			 String email = UserInputUtil.getNextString();
			 String userName = UserInputUtil.getNextString();
			 String password = UserInputUtil.getNextString();
			 
			 Customer customer = new Customer(0, custName, email, userName, password, 0);  
			 customer = CustomerDao.createUser(customer);
		 }
	}
	

//Transaction Methods that will be called


	public static void depositMoney() {
		//Prompt user for accntNumber
		System.out.println("Enter account number: ");
		int accntNum = UserInputUtil.getNextInt();
	
		//Confirm accnt number entered is correct in the DB
		if (AccountsDao.getAccount(accntNum) == null) {
			do {
				System.out.println("Please enter a valid account number.");
				accntNum = UserInputUtil.getNextInt();	
			} while (AccountsDao.getAccount(accntNum) == null);
		}
		
		Account account = AccountsDao.getAccount(accntNum);
		double balance = Account.getBalance();
		
		//Prompt user for deposit amount
		System.out.println("How many hearts do you wish to deposit? ");			
		double amount = UserInputUtil.getNextDouble();
		//get the current balance associated with the accnt
		
		
		//complete transaction
		if (balance >= 0 ) {
			balance += amount;
			System.out.println("Deposit of " +  amount + " heart(s) was successful. Current balance = " + balance);
		}
		AccountsDao.updateBalance(balance);
		
	}
/////////////////////////////////////////////////////////////	
	
	public void withdrawalMoney() {
		//Prompt user for accntNumber
		System.out.println("Enter account number: ");
		int accntNum = UserInputUtil.getNextInt();
		
		//Confirm accnt number entered is correct in the DB
		if (AccountsDao.getAccount(accntNum) == null) {
			do {
				System.out.println("Please enter a valid account number.");
				accntNum = UserInputUtil.getNextInt();	
			} while (AccountsDao.getAccount(accntNum) == null);
		}
		
		Account account = AccountsDao.getAccount(accntNum);
		AccountsDao.getAccount(accntNum);
		double balance = Account.getBalance();
		
		
		//Prompt user for withdrawal amount
		System.out.println("How many hearts do you wish to withdrawal? ");	
	    amount = UserInputUtil.getNextDouble();
	    
		if (amount > balance ) {
			System.out.println("You're account is lacking some love. Withdrawal cannot be processed.");
		
		} else {
			balance = balance - amount;
			System.out.println("Deposit of " +  amount + " heart(s) was successful. Current balance is " + balance + " hearts");
				if (amount > 100 ) {
					System.out.println("You must be saving lots of hearts for someone special, huh?"); 
				}
		}

		//AccountsDao.getAccount(accntNum);
		//balance = Account.getBalance();	
		AccountsDao.updateBalance(balance);
		 		
}		
////////////////////////////////////////////////		
		
	public void transferMoney() {
		System.out.println("Please enter your account number: ");
		int accntNum = UserInputUtil.getNextInt();			
		System.out.println("Please enter the accnt number of the account you wish to send some hearts to: ");
		int routingNum = UserInputUtil.getNextInt();
		Account account = AccountsDao.getAccount(getRoutingNum());
		double balance = Account.getBalance();		
		//checks if routing number is valid
		if(AccountsDao.getAccount(getRoutingNum()) == null) {
			
			
		}
		
		
	}
	
//////////////////////////////////////////////////	
	
	public void checkBalance() {
		System.out.println("Enter your account number ");
		int accntNum = UserInputUtil.getNextInt();
		AccountsDao.getAccount(accntNum);
		double balance = Account.getBalance();
		System.out.println("You have a balance of " + balance + "hearts");
	}

/////////////////////////////////////////////////////	
    public void closeAccount() {
	  System.out.println("Enter account number of the heart you are breaking... "
	  		+ "\n Uh, I mean account you wish to close ");
	  int accntNum = UserInputUtil.getNextInt();
	  AccountsDao.closeAccount(accntNum);
	  System.out.println("You have officially broken heart number " + accntNum 
			  +"\n ... It is officially closed");
    }
	  
//////////////////////////////////////////////////////////////	  
	
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


	public int getAccntNum() {
		return accntNum;
	}

	public void setAccntNUm(int accntNUm) {
		this.accntNum = accntNUm;
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
