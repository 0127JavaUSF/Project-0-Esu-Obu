package zero.project.models.ESUBankApp;

//import zero.project.views.ESUBankApp.View;
import zero.project.daos.ESUBankApp.*;

public class Account{
	private static int accntNum;
	private String accntType;
	//private boolean isSingle;
	public String accntHolder;
	private static int routingNum;
	private static double balance;
	
	
	/*
	 * public void Account1(int accntNum2, String accntType2, String accntHolder2,
	 * int routingNum2, double balance2) { // TODO Auto-generated constructor stub }
	 */
	/*
	 * public void Account2(int accntNum2, String accntType2, String accntHolder2,
	 * int routingNum2, double balance2) { // TODO Auto-generated constructor stub }
	 * public void Account3(int accntNum2, String accntType2, String accntHolder2,
	 * int routingNum2, double balance2) { // TODO Auto-generated constructor stub }
	 * public void Account4(int accntNum2, String accntType2, String accntHolder2,
	 * int routingNum2, double balance2) { // TODO Auto-generated constructor stub }
	 */
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//This converts all the customers's data in a string that will be returned to their account view	
	@Override
	public String toString() {
		return "Account [Account Num: " + accntNum + ", Account Type: " + accntType + ", Account Holder:" + accntHolder
				+ ", Routing Number: " + routingNum + ", Balance: $" + balance + "]";
	}
	public Account(int accntNum, String accntType, String accntHolder, int routingNum, double balance) {
		super();
		this.accntNum = accntNum;
		this.accntType = accntType;
		this.accntHolder = accntHolder;
		this.routingNum = routingNum;
		this.balance = balance;
	}

	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	/*
	 * @Override public void showMenu() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * 
	 * @Override public View selectOption() { // TODO Auto-generated method stub
	 * return null; }
	 * /////////////////////////////////////////////////////////////////////////////
	 * ///////////////////////////
	 */	public Account(String accntHolder2) {
		// TODO Auto-generated constructor stub
	}
	public static int getAccntNum() {
		return accntNum;
	}
	public void setAccntNum(int accntNum) {
		this.accntNum = accntNum;
	}
	public String getAccntType() {
		return accntType;
	}
	public void setAccntType(String accntType) {
		this.accntType = accntType;
	}

	/*
	 * public boolean isSingle() { return isSingle; } public void setSingle(boolean
	 * isSingle) { this.isSingle = isSingle; }
	 */
	public String getAccntHolder() {
		return accntHolder;
	}
	public void setAccntHolder(String accntHolder) {
		this.accntHolder = accntHolder;
	}
	public static int getRoutingNum() {
		return routingNum;
	}
	public void setRoutingNum(int routingNum) {
		Account.routingNum = routingNum;
	}
	public static double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		Account.balance = balance;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accntHolder == null) ? 0 : accntHolder.hashCode());
		result = prime * result + accntNum;
		result = prime * result + ((accntType == null) ? 0 : accntType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + routingNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accntHolder == null) {
			if (other.accntHolder != null)
				return false;
		} else if (!accntHolder.equals(other.accntHolder))
			return false;
		if (accntNum != other.accntNum)
			return false;
		if (accntType == null) {
			if (other.accntType != null)
				return false;
		} else if (!accntType.equals(other.accntType))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (routingNum != Account.routingNum)
			return false;
		return true;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String loadAccount(String accntHolder2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
