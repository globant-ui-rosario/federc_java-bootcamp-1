package keyPoint5;

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
		
		// I create an offer
		ArrayList<Item> itemsToOffer = new ArrayList<Item>();
		iterator = itemsToOffer.iterator();
		Item it1 = new Item("a",3);
		Item it2 = new Item("b",5);
		Item it3 = new Item("c",2);
		itemsToOffer.add(it1);
		itemsToOffer.add(it2);
		itemsToOffer.add(it3);
		Offer offer = new Offer("a-b-c combo", itemsToOffer);
		
		
		// I display the offer ; agregar tostring offer
		System.out.println(offer.getName()+"----$: "+offer.getTotal()); // offer name + total price
		ArrayList<Item> items = offer.getItems();
		for(Item i: items){
			System.out.println(i.getName()+"----$: "+i.getPrice()); // item name + individual price
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
