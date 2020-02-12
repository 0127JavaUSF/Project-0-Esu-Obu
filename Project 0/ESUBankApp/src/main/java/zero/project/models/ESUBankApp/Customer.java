package zero.project.models.ESUBankApp;

//import zero.project.util.ESUBankApp.UserInputUtil;
//import zero.project.views.ESUBankApp.AccountsView;
//import zero.project.views.ESUBankApp.CustomerView;
//import zero.project.views.ESUBankApp.View;

public class Customer {
	private int custId;
	private static String custName;
	private String email;
	public static String userName;
	public static String password;
	private int accntNum;
	//public static boolean isSingle;
	//public static boolean isChecking;
	
	
	/*
	 * public void showMenu() { System.out.println("1. Create Checking Account ");
	 * System.out.println("2. Create Savings Account ");
	 * System.out.println("3. Previous "); System.out.println("0. Exit "); }
	 * 
	 * @Override public View selectOption() { int selectedItem =
	 * UserInputUtil.getIntInRange(0, 3);
	 * 
	 * switch(selectedItem) { case 0: return null; case 1: return new
	 * AccountsView(); case 2: return null; case 3: view.MainMenu(); //return null;
	 * default: return null;
	 * 
	 * }
	 * 
	 * }
	 */
	

// Getter and Setters ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	 public static String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		Customer.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccntNum() {
		return accntNum;
	}
	public void setAccntNum(int accntNum) {
		this.accntNum = accntNum;
	}
	
///Instantiations //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public Customer(int custId, String custName, String email, String userName, String password, int accntNum) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.accntNum = accntNum;
	}


	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Customer() {
		super();
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Customer [Customer ID: " + custId + ", Customer Name: " + custName + ", Email: " + email + 
				 ", Account Number: " + accntNum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accntNum;
		result = prime * result + custId;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	
// Checks to see if the entries for eahc attribute are false or not	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (accntNum != other.accntNum)
			return false;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	
	
	
	

	
	
	
	
}
