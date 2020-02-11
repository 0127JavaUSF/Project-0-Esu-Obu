package zero.project.services.ESUBankApp;

import javax.xml.bind.ValidationException;
import zero.project.models.ESUBankApp.Customer;


public interface CustomerServiceInterface {

	public Customer createCustomer(Customer customer) throws ValidationException;
}
