package zero.project.views.ESUBankApp;

import java.util.Scanner;

import zero.project.models.ESUBankApp.Customer;
import zero.project.util.ESUBankApp.UserInputUtil;

//This is the MainMenu class that hosts methods to
// first show the user options when they first
// open the app and a method to check which input they choose
public class MainMenu implements View{
	
	//public static String response;

	/*
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); MainMenu mainmenu = new MainMenu(); mainmenu.showMenu();
	 * String response = scanner.nextLine(); mainmenu.selectOption(); }
	 */
	
	
	public void showMenu() {
		
		System.out.println("HAPPY VALENTINE'S DAY, and Welcome to Easy $tack Up (E$U) Bank!");
		System.out.println("$tacking up hearts doesn't get any easier than this, whether single or not ;D");
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
		case 1: login(view); view.showMenu();
		case 2: aview.showMenu();//new Customer();
		//case 2: return null;
		default: return null;
		}

	}

	
	public static CustomerView login(CustomerView customerview) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your account number: ");
		int accntNum = scanner.nextInt();
		System.out.println("Please enter your userName: ");
		String userName = UserInputUtil.getNextString();
		System.out.println("Please enter your password: ");
		String pssword = scanner.toString();
		return customerview;
		
	}
		


}
