package zero.project.views.ESUBankApp;

import java.util.Scanner;

import zero.project.daos.ESUBankApp.CustomerDao;
import zero.project.exceptions.ESUBankApp.ValidationException;
//import zero.project.exceptions.ESUBankApp.ValidationException;
//import zero.project.exceptions.ESUBankApp.ValidationException;
import zero.project.models.ESUBankApp.Customer;
import zero.project.services.ESUBankApp.CustomerServiceInterface;
import zero.project.transacs.ESUBankApp.Transactions;
import zero.project.util.ESUBankApp.UserInputUtil;
import zero.project.views.ESUBankApp.MainMenu;
import zero.project.views.ESUBankApp.View;


public class CustomerView implements View {
	
	CustomerServiceInterface customerService;
	
		
		
		public void showMenu() {
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
			Transactions transactions = new Transactions();
			
			switch(selectedItem) {
			case 0: new MainMenu(); return null;
			case 1: Transactions.depositMoney();
			case 2: transactions.withdrawalMoney();
			case 3: transactions.checkBalance();
			case 4: transactions.transferMoney();
			case 5: transactions.closeAccount();
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
	
	public CustomerView() {
		return;
	}



	 
	
	

}
