package keyPoint2;

import java.util.ArrayList;

public class ControllerShoppingCart {

	private ShoppingCart actualShoppingCart;
	private CatItems catItems;
	private Client actualClient;
	
	
	
	public ControllerShoppingCart(){
		
	}
	
	public ShoppingCart createNewShoppingCart(){
		actualShoppingCart = new ShoppingCart();
		return actualShoppingCart;
	}
	
	
	
	public void AddItem(String name, int quant){
		// first I search for the item
		Item item = new Item();
		item = catItems.serchItem(name);
		
		// then, once I got that item I create a LINE (item+quantity)		
		ShoppingCartLine shoppingCartLine = new ShoppingCartLine(item, quant);
		// For last, I add this line to my actual shopping cart
		actualShoppingCart.addShoppingCartLine(shoppingCartLine);		
	}
	
	public void pay(PaymentMethod paymentMethod){
		ArrayList<ShoppingCartLine> shoppingCartLineCollection = actualShoppingCart.getShoppingCartLine();
		paymentMethod.pay(shoppingCartLineCollection);
	}
	
	
	
}
