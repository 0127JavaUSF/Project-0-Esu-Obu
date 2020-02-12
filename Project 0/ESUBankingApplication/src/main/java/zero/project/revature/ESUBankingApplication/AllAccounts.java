package zero.project.revature.ESUBankingApplication;
import java.util.ArrayList;
import java.util.Scanner;

public class AllAccounts implements AllAccountsInterface{
	static Scanner scanner = new Scanner(System.in);
	
/*	
	public AllAccounts() {
		// TODO Auto-generated constructor stub
	}*/
	
	public static void login() {
		int attempts = 0;
		while (attempts <= 3) {
			
			System.out.println("Please enter username: ");
			String userName = scanner.next();
			
			System.out.println("Please enter password: ");
			String password = scanner.next();
			
			if ((userName.equals(userName) && password.equals(password))){
				boolean isSingleUser = false;
				if (isSingleUser == true) {
				System.out.println("You have successfully logged in");
				//method call that takes them to their joint account
				// or single account
				break;
				}
			} else {
				System.out.println("Username or password is incorrect. You have " + attempts + "left" );
				attempts++;
												
			}			
		}
	}
}

/*	public static void register() {
		// TODO Auto-generated method stub
		//AllAccountsInterface.super.register();
		System.out.println("Congratulaions! You've successfully registered with ESU Bank!");
	}

	@Override
	public void retrieveData() {
	
	 * if (User.userName == ) AllAccountsInterface.super.retrieveData(); }
	 
	}
		
	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		AllAccountsInterface.super.closeAccount();
	*/


	
	

