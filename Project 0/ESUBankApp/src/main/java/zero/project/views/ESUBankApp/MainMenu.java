package zero.project.views.ESUBankApp;

import java.util.Scanner;

//import java.util.Scanner;

//import zero.project.models.ESUBankApp.Customer;
import zero.project.util.ESUBankApp.UserInputUtil;

//This is the MainMenu class that hosts methods to
// first show the user options when they first
// open the app and a method to check which input they choose
public class MainMenu implements View{
	
	
	public void showMenu() {
		
		System.out.println("HAPPY VALENTINE'S DAY, and Welcome to Easy Saving Up (ESU) Bank!");
		System.out.println("Stacking up hearts doesn't get any easier than this, whether single or not ;D");
		//System.out.println("\n");
		//System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("1. Login");
		System.out.println("2. Create an Account");
		//System.out.println("0. Exit");
		System.out.println("------------------------------------------------------------------------------");
		//System.out.println("\n");
		
	}

	public View selectOption() {
		int selectedItem = UserInputUtil.getIntInRange(1, 2);
		CustomerView view = new CustomerView();
		AccountsView aview = new AccountsView();
		
		switch(selectedItem) {	
			case 1: view.showMenu();
			case 2: aview.showMenu();//new Customer();
			default: return null;
		}

	}

	
	public static CustomerView login(CustomerView customerview) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter your account number: ");
		int accntNum = scanner1.nextInt();		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Please enter your username: ");
		String userName = scanner2.next();
		System.out.println("Please enter your password: ");
		Scanner scanner3 = new Scanner(System.in);
		String password = scanner3.next();
		
		return customerview;
		
	}
		


}
