package zero.project.services.ESUBankApp;

import javax.xml.bind.ValidationException;
import zero.project.models.ESUBankApp.Customer;


public interface CustomerServiceInterface {

	public Customer createUser(Customer customer) throws ValidationException;
	
}
