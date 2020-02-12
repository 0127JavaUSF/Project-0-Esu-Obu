package zero.project.views.ESUBankApp;

//import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import zero.project.daos.ESUBankApp.AccountsDao;
import zero.project.daos.ESUBankApp.CustomerDao;
//import zero.project.transacs.ESUBankApp.Transactions;
import zero.project.models.ESUBankApp.Account;
import zero.project.models.ESUBankApp.Customer;
import zero.project.util.ESUBankApp.UserInputUtil;


public class AccountsView implements View {

		AccountsDao accountsDao = new AccountsDao();
	
		@Override
		public void showMenu() {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1. Load Account");
			System.out.println("2. Create Account");
			System.out.println("3. Get Account Users");
			System.out.println("0. Back");
			//System.out.println("\n");
			
			System.out.println("------------------------------------------------------------------------------");
			//System.out.println("Please enter a number between 0 and 3: ");
			
		}
	
		@Override
		public View selectOption() {
			int selectedItem = UserInputUtil.getIntInRange(0, 3);
			
			switch(selectedItem) {
			case 0: return new MainMenu();
			case 1: this.loadAccount(); return this;
			case 2: this.createAccount(); return this;
			case 3: this.printAccountUsers(); return this;
			default: return null;
			}		
			
		}
		
		public void printAccountUsers() {
			Account account = loadAccount();
			List<Customer> customers = accountsDao.getCustomers(account);
			System.out.println("|      Customer ID      |      Full Name      |               Email              |    Account No.  | ");
			customers.forEach(r -> {
				System.out.printf("|%23d |%-21s |%-34s |%17d |%n", 
						r.getCustId(), r.getCustName(), r.getEmail(), r.getAccntNum());
				});
		}
		
		public Account loadAccount() {
			System.out.println("------------------------------------------------------------------------------");
			Scanner scanner = new Scanner(System.in);
			//Prompt user for their account number
			System.out.println("Enter your account number: ");
			System.out.println("------------------------------------------------------------------------------");
			int accntNum = scanner.nextInt();
			while(scanner.hasNext()) {
				
				//Pull data from search into class
				Account account = AccountsDao.getAccount(accntNum);
				
			/*
			 * //check if account number is same as in database if (Account.getAccntNum() ==
			 * accntNum) { CustomerView.showMenu(); }
			 */
				
			}
			return null;
			
				
				
				//System.out.println(account);
					
		}
			
			
			
		
		
		public void createAccount() {			
				System.out.println("------------------------------------------------------------------------------");	
				System.out.println("Enter full name please: "); 
				String accntHolder = UserInputUtil.getNextString();
				//String custName = accntHolder;
				System.out.println("Enter a valid email: "); 
				String email = UserInputUtil.getNextString();
				System.out.println("Please create a username: ");
				String userName = UserInputUtil.getNextString();
				System.out.println("Please create a password: ");
				String password = UserInputUtil.getNextString();
				//Create customers
				Customer customer = new Customer(0, accntHolder, email, userName, password, 0);
				customer = CustomerDao.createUser(customer);
				System.out.println(customer);
				
				//Prompt customer for which type of account they want to create
				System.out.println("Which of the following accounts are you creating today?");
				System.out.println("1. Single Lady/Solo Dolo Checking");
				System.out.println("2. Single Lady/Solo Dolo Savings");
				System.out.println("3. Mrs./Mr. Checking");
				System.out.println("4. Mrs./Mr. Savings");
				
				int selectedItem = UserInputUtil.getIntInRange(1, 4);
				//Transactions transactions = new Transactions();
				
				String accntType = UserInputUtil.getNextString();
				do {
					switch(selectedItem) {
					case 1: accntType = "Single Lady/Solo Dolo Checking";
										break;
					case 2: accntType = "Single Lady/Solo Dolo Savings";
										break;
					case 3: accntType = "Mrs./Mr. Checking";
										break;
					case 4: accntType = "Mrs./Mr. Savings";
										break;
					default: System.out.println("Please enter a valid number from the option above");
				    }
					
				}while (selectedItem > 0 && selectedItem <= 4);
				 //Prompt custoemr to enter intitial deposit amount
				System.out.println("How many hearts do you wish to deposit in this account?");			
				double balance = UserInputUtil.getNextDouble();
				
				//Send customer's account informtion to dao to add to database
				Account account = new Account(0, accntType, accntHolder, 0, balance); 
				account = AccountsDao.createAccount(account); 
				System.out.println(account);
				
				//System.out.println("Please enter a number between 0 and 2: ");			 
		}
		
		
		


}
