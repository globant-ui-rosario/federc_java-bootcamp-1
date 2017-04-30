package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {		
		
		ShoppingCartServiceImplementation shoppingCartServiceImplementation = new ShoppingCartServiceImplementation();
		ItemServiceImplementation itemServiceImplementation = new ItemServiceImplementation();
		
		User user = new User("Federico");
		Item item1 = itemServiceImplementation.getItemByName("car");
		Item item2 = itemServiceImplementation.getItemByName("bike");
		List<Item> itemsCollection = new ArrayList<Item>();
		itemsCollection.add(item1);
		itemsCollection.add(item2);
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setUser(user);
		shoppingCart.setItemsCollection(itemsCollection);
		shoppingCartServiceImplementation.createShoppingCart(shoppingCart);
		
	}

}
