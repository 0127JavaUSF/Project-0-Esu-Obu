package zero.project.revature.ESUBankingApplication;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		//new User();
		
		String customerName;
		long accountNumber = 1L + (long) (Math.random() * (10L - 1L));
		String accountType;
		boolean isSingleUser;
		String secondUserUN;
		
		
		//private ArrayList<Account> accounts; 
		
		
		// Main Login Page
		// System.out.println("------------------------------------------------------------------------------");
		System.out.println("Welcome to Easy Stack Up (ESU) Bank!");
		System.out.println("Where stacking up money doesn't get any easier :D");
		System.out.println("\n");
		System.out.println("\n");
		
		
		//User scanner to read the user's input 
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user if they need to login or register
		System.out.println(" Do you need to (L) Login? "
							+ "Or do you need to (R) Register?");
		//System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Enter the letter L (Login) or R (Register)");
		System.out.println("------------------------------------------------------------------------------");
		char answer = scanner.next().charAt(0);
		System.out.println("\n");
		System.out.println("\n");
		
		if (answer != '\u0000') {
			//System.out.println(showOptions());		
		    //private void char[] showOptions() {			
			
				switch(answer) 
				{
					
						case 'L': 
							AllAccounts.login();
							
				/*
				 * case 'R': AllAccounts.register();
				 */
							
						default:
							System.out.println("Invalid option! Please try again");
							break;				
				
				} while (answer != '\u0000'){
				
				System.out.println();
		
				}}
			
	 }	
	
	
		//Declare some of the user's attributes
//		String userName;
//		String password;
//		double balance;
//		double previousTransaction;
//		ArrayList <Integer> accountsList = new ArrayList<>();
		
		
//		  User(userName, password, balance,previousTransaction, ArrayList <Integer> accountsList ) { 
//			  this.userName = userName; 
//			  this.password = password; 
//			  this.balance = balance;
//			  this.previousTransaction = previousTransaction; 
//			  this.accountsList =accountsList;
//		  
//		  }
//		  
//		  User(previousTransaction, ArrayList<Integer> accountsList) {
//		  //super(); this.previousTransaction = previousTransaction; this.accountsList
//		  = accountsList; }
//		  
//		  public User() { this("eobu", "dfg543", 450.0, 200.0, accountsList); }
//		 
//
// 
//		}

	
	  private static char[] showOptions() { // TODO Auto-generated method stub
	  return null; }
	 
}
