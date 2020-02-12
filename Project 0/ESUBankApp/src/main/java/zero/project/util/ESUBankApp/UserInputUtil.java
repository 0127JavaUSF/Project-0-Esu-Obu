package zero.project.util.ESUBankApp;

import java.util.Scanner;

//This is a utility class that is getting user input
public class UserInputUtil {
	private static Scanner scanner = new Scanner(System.in);
	
	public static int getIntInRange(int min, int max) {
		int selectedItem = 0;
		//this do while loop prompts the user to enter a number between the
		//the 0 - 2 min/max range of values provided on Main Menu
		outer: do {
			System.out.println("Please enter a number between " + min +
				" and " + max);
			
			while(!scanner.hasNextInt()) {
				scanner.nextLine();
				continue outer;
			}
			selectedItem = scanner.nextInt();
			scanner.nextLine();
		} while(selectedItem < min || selectedItem > max);
		
		return selectedItem;
	}
	
	public static String getNextString() {
		return scanner.nextLine();
	}
	
	public static double getNextDouble() {
		return scanner.nextDouble();
		
	}

	public static int getNextInt() {
		// TODO Auto-generated method stub
		return 0;
	}


}
