package zero.project.services.ESUBankApp;

import javax.xml.bind.ValidationException;
import zero.project.daos.ESUBankApp.AccountsDao;
import zero.project.daos.ESUBankApp.CustomerDao;
import zero.project.models.ESUBankApp.Customer;

//import zero.project.daos.ESUBankApp.AccountsDao;
//import zero.project.daos.ESUBankApp.CustomerDao;
//import zero.project.models.ESUBankApp.Customer;

public class CustomerService implements CustomerServiceInterface {

	
	  private CustomerDao customerDao; private AccountsDao accountsDao;
	  
	
	  @Override public Customer createUser(Customer customer) throws
	  ValidationException { validateUser(customer); return
	  CustomerDao.createUser(customer); }


	private void validateUser(Customer customer) {
		
		
	}
	 
	 

}
