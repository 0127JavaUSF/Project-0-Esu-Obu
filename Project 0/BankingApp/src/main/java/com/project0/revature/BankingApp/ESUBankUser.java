package com.project0.revature.BankingApp;

import java.util.Scanner;

public class ESUBankUser {

	public static void main(String[] args) {
		
	
		// Main Login Page
		// System.out.println("------------------------------------------------------------------------------");
		System.out.println("Welcome to ESU Bank!");
		System.out.println("Where stacking up money doesn't get any easier :D");
		System.out.println("\n");
		
		
		//User scanner to read the user's input 
		 Scanner scanner = new Scanner(System.in);
		
		// Prompt user if they need to login or not
		System.out.println("L) Login?");
		System.out.println("\n");

		// Prompt user if they need to create an account or not
		System.out.println("R) Register?");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\n");

		/*
		 * //User scanner to read the user's input //Prompt user for their user ID and
		 * password System.out.println("Please enter your User ID: "); String userID =
		 * scanner.toString();
		 * 
		 * System.out.println("Please enter your password: ");
		 */
		 
		
		//Created a char variable to switch depending on the user's input
		char option = '\0';
		do {
			
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Enter L (Login) or R (Register): ");
			System.out.println("------------------------------------------------------------------------------");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'L' :
					
				System.out.println("Enter username: ");
				for (int i = 0; i <=3; i++) {
					if (Credentials.getUsername().equals())
					
					
				}
				
				System.out.println("Enter password: ");
			
			
			
			}
			
			
			
			
			
			
			
		} while (/* */){
			
			
			
		}

	}

	ESUBankUser credentials = new ESUBankUser();
	
	public static void Credentials(String C_username, String C_password) {

	}
	
	
	public void JointAccount(String J_username, String J_password) {
		System.out.println();
	}
	
	public void SingleAccount(String S_username, String S_password) {
		System.out.println();
	}



}
