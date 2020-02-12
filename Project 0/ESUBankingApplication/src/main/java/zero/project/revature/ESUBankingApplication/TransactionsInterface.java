package zero.project.revature.ESUBankingApplication;
import java.util.ArrayList;
import java.util.Scanner;

public interface TransactionsInterface {

	 default void deposit(double depositAmount) {
	}
				
	default void withdraw(double withdrawalAmount) {		
	}
		
	
	public default void checkBalance(double balance) {			
	}
		
	/*
	 * default void transferMoney(String userName, long accountNumber) { }
	 */
	public void transferMoney(String userName, long accountNumber, double transferAmount);
	
	

	
}
