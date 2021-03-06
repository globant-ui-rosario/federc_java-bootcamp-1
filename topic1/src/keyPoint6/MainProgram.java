package keyPoint6;

import java.util.ArrayList;
import java.util.Iterator;

public class MainProgram {
	
	public static void main(String[] args) {
		
		
		// after reading a Client, I obtain:
		String cname="John";
		int cardnumber=555555555;
		String email="john@a.com";
		String password="*****";		
		Client c = new Client();
		c.setEmail(email);
		c.setIdcard(cardnumber);
		c.setName(cname);
		c.setPassword(password);
				
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
		
		Offer offer = CSC.createAnOffer("a-b-c combo", itemsToOffer);
		
		
		
		// I display the offer
		System.out.println(offer); // offer name + total price
		ArrayList<Item> items = offer.getItems();
		for(Item i: items){
			System.out.println(i); // item name + individual price
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
				
		// In any moment, if it is decided to alter the price of one item...
		double p = 0;
		Item i = new Item();
		CSC.changePrice(p,i);
		
		
		
		
    }

}
