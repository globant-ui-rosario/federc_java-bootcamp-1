package keyPoint4;

import java.util.ArrayList;
import java.util.Iterator;

public class MainProgram {
	
	public static void main(String[] args) {

		// after reading a Client, I obtain:
		Client c = new Client("John");
		
		// before reading items to add, I create the Controller
		ControllerShoppingCart CSC = new ControllerShoppingCart();
		
		// I create a new shoppingCart, using the controller
		ShoppingCart shoppingCart = CSC.createNewShoppingCart(c);
		
		// I consider "list of items to display (exercise 4)" as the list that the client watches before select them
		ArrayList<Item> allItems = new ArrayList<Item>();
		allItems= CSC.getAllItems();
		System.out.println("Displaying Menu of Items:");
		Iterator<Item> iterator = allItems.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			System.out.println(item);
		}
		
		// I read items[name+quantity], one by one until client decides to finish
		String name = "a";						//
		int quant = 3;							// iteration
		CSC.AddItem(name, quant);   			// 
		
		
		// when client decides to finish, client enters a pay method
		
				//pay by credit card
				CSC.pay(new CreditCardMethod("John","555555555"));
				
				//pay by paypal
				CSC.pay(new PayPalMethod("john@a.com", "*****"));
				
				//pay by cash
				CSC.pay(new CashMethod());
				
				
		
		
    }

}
