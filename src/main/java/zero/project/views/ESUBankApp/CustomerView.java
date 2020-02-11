package zero.project.views.ESUBankApp;

//import zero.project.exceptions.ESUBankApp.ValidationException;
import zero.project.models.ESUBankApp.Customer;
import zero.project.services.ESUBankApp.CustomerServiceInterface;
import zero.project.util.ESUBankApp.UserInputUtil;
import zero.project.views.ESUBankApp.MainMenu;
import zero.project.views.ESUBankApp.View;


public class CustomerView implements View {
	CustomerServiceInterface customerService;
	
		@Override
		public void showMenu() {
			System.out.println("Welcome, " + Customer.getCustName());
			System.out.println("1. Create Customer Account");
			System.out.println("0. Back");
			System.out.println("------------------------------------------------------------------------------");
		}
	
	
	  @Override 
	  public View selectOption() { 
		  int selectedItem = UserInputUtil.getIntInRange(0, 1);
	  
		  switch (selectedItem) { 
		  	case 1: createCustomer(null); 
		  		return this; 
			case 0:
			default: return new MainMenu(); 
		  }
	  
	  
	  }
	 

	
	  private void createCustomer(Customer customer) {	  
		  System.out.println("Please enter your name: "); 
		  UserInputUtil.getNextString(); 
		  Math.random();
		  System.out.println("Please enter a username: "); 
		  UserInputUtil.getNextString();
		  System.out.println("Please enter a password: "); 
		  UserInputUtil.getNextString();
		  System.out.println("Please enter a valid email: "); 
		  UserInputUtil.getNextString(); Math.random();
		  
		/*
		 * try {
		 * 
		 * createCustomer = customerService.createCustomer(customer); }
		 * catch(ValidationException e) { e.printErrors(); }
		 */
		  
			/*
			 * Customer createCustomer = null;
			 * System.out.println("Please enter your name: "); String custName =
			 * UserInputUtil.getNextString(); int custID = (int) Math.random();
			 * System.out.println("Please enter a username: "); String userName =
			 * UserInputUtil.getNextString();
			 * System.out.println("Please enter a password: "); String password =
			 * UserInputUtil.getNextString();
			 * System.out.println("Please enter a valid email: "); String email =
			 * UserInputUtil.getNextString(); int accntNum = (int) Math.random();
			 */
			  
		  
		  
		  
		  
		  }
	 
	
	

}
