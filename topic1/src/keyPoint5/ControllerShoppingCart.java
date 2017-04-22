package keyPoint5;

import java.util.ArrayList;

public class ControllerShoppingCart {

	private ShoppingCart actualShoppingCart;
	private CatItems catItems;
	private Client actualClient;
	private static int idPaymentTransaction = 0; // business rules: " each operation (each new shoppingcart) it only has ONE 
											     // 				  payment method; is not allow to pay with, for example
											     //					  half cash half credit card"
	
	
	
	public ControllerShoppingCart(){
		
	}
	
	public ShoppingCart createNewShoppingCart(Client c){
		actualShoppingCart = new ShoppingCart(c);
		idPaymentTransaction++; // each new shopping cart, the identificator increases by one
		return actualShoppingCart;
	}
	
	
	
	public void AddItem(String name, int quant){
		// first I search for the item
		Item item = new Item();
		item = catItems.serchItem(name);
		
		// then, once I got that item, I create a LINE (item+quantity)		
		ShoppingCartLine shoppingCartLine = new ShoppingCartLine(item, quant);
		// For last, I add this line to my actual shopping cart
		actualShoppingCart.addShoppingCartLine(shoppingCartLine);		
	}
	
	public void pay(PaymentMethod paymentMethod){
		ArrayList<ShoppingCartLine> shoppingCartLineCollection = actualShoppingCart.getShoppingCartLine();
		paymentMethod.pay(shoppingCartLineCollection);
	}

	public ArrayList<Item> getAllItems() {
		ArrayList<Item> allItems = new ArrayList<Item>();
		// get all items
		return allItems;
	}
	
	
	
}
