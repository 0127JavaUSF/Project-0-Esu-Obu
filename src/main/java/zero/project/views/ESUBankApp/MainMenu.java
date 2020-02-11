package zero.project.views.ESUBankApp;

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
		
		System.out.println("HAPPY V-DAY, and Welcome to Easy $tack Up (E$U) Bank!");
		System.out.println("$tacking up hearts doesn't get any easier than this, whether single or not ;D");
		//System.out.println("\n");
		//System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("1. Login");
		System.out.println("0. Create an Account");
		//System.out.println("0. Exit");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\n");
		
	}

	public View selectOption() {
		int selectedItem = UserInputUtil.getIntInRange(0, 1);
		
		switch(selectedItem) {
		case 0: return new AccountsView();
		case 1: return new CustomerView();
		//case 2: return null;
		default: return null;
		}

	}

		


}
