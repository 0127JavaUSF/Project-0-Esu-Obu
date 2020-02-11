package zero.project.exceptions.ESUBankApp;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends Exception {


	
	  public class InvalidProperty { 
		  final String property; 
		  final String message;
	  
		  private InvalidProperty(String property, String message) { 
			  super();
			  this.property = property;
			  this.message = message; 
		  } 
	  }
	  
	  
	  private List<InvalidProperty> errors = new ArrayList<>();
	  
	  public void addError(String property, String message) { 
		  errors.add(new InvalidProperty(property, message)); 
		  }
	  
	  public void printErrors() { 
		  errors.forEach(e -> System.out.printf("Invalid input for '%s': %s%n", e.property, e.message)); 
		  }
	  
	  public boolean hasErrors() { 
		  return errors.size() > 0; }
	 
	
	
	
	
}
