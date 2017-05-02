package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {		
		
		ShoppingCartService shoppingCartServiceImplementation = new ShoppingCartServiceImplementation();
		ItemService itemServiceImplementation = new ItemServiceImplementation();
		
		User user = new User("Federico"); // buscar uno existente , no crearlo
		// sacar logica del main
		// falta pagar
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
