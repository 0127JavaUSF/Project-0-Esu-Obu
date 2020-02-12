package zero.project.views.ESUBankApp;

//This is an interface that can be implemented by any class and reps a menu for navigation
public interface View {
	 void showMenu(); //changed to static because of MainMenu case 1
		 View selectOption();
	
		 //CustomerView showMenu(CustomerView customerview);
	
	
}
