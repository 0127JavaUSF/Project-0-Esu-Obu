package com.project0.revature.BankingApp;

public  class Credentials {
	public String usernameC;
	String passwordC;
	
	
	
	public static Credentials(String usernameC, String passwordC) {
		//super();
		this.usernameC = usernameC;
		this.passwordC = passwordC;
	}
	
	
	
	
	public String getUsernameC(String usernameC) {
		return usernameC;
	}
	public void setUsernameC(String usernameC) {
		this.usernameC = usernameC;
	}
	public String getPasswordC() {
		return passwordC;
	}
	public void setPasswordC(String passwordC) {
		this.passwordC = passwordC;
	} 
	
	
	
	
}
