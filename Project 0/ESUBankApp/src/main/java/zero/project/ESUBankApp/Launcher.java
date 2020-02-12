package zero.project.ESUBankApp;

import zero.project.views.ESUBankApp.MainMenu;
import zero.project.views.ESUBankApp.View;

public class Launcher {

	public static void main(String[] args) {
		View view = new MainMenu();
		
		while(view != null) {
			view.showMenu();
			view = view.selectOption();
			
		}
		
		System.out.println("Thank you for visiting E$U Bank!");

	}

}
