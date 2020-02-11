package zero.project.views.ESUBankApp;

import zero.project.daos.ESUBankApp.AccountsDao;
import zero.project.transacs.ESUBankApp.Transactions;
import zero.project.models.ESUBankApp.Customer;
import zero.project.util.ESUBankApp.UserInputUtil;


public class AccountsView implements View {

	AccountsDao accountsDao = new AccountsDao();

	public void showMenu() {
		//System.out.println("HAPPY V-DAY, and Welcome to Easy Stack Up (ESU) Bank!");
		//System.out.println("Stacking up money doesn't get any easier than this, whether single or not ;D");
		//System.out.println("\n");
		//System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("1. Deposit");
		System.out.println("2. Withdrawal");
		System.out.println("3. Check Balance");
		System.out.println("4. Transfer Money");
		System.out.println("5. Close Account");
		System.out.println("0. Back");
		//System.out.println("\n");
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Please enter a number between 0 and 5");
		
	}

	@Override
	public View selectOption() {
		int selectedItem = UserInputUtil.getIntInRange(0, 5);
		Transactions transactions = new Transactions();
		
		switch(selectedItem) {
		case 0: return null;
		case 1: transactions.depositMoney();
		case 2: transactions.withdrawalMoney();
		case 3: transactions.checkBalance();
		case 4: transactions.transferMoney();
		case 5: transactions.closeAccount();
		default: return null;
		}

	}

	

}
