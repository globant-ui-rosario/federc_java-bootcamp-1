package keyPoint6;

import java.util.ArrayList;
import java.util.List;

public class ControllerShoppingCart implements Observable{
	
	ArrayList<Observer> users = new ArrayList<Observer>(); // list of users who are interested to know about <a new item/offer is added> or <A price is changed> or <A new transaction was made>

	private ShoppingCart actualShoppingCart;
	private CatalogueItems catalogueItems;	
	private static int idPaymentTransaction = 0; // business rules: " each operation (each new shoppingcart) it only has ONE 
											     // 				  payment method; is not allow to pay with, for example
											     //					  half cash half credit card"
	
	
	
	public ControllerShoppingCart(){
		
	}
	
	public ShoppingCart createNewShoppingCart(Client c){
		idPaymentTransaction++; // each new shopping cart, the identificator increases by one
		actualShoppingCart = new ShoppingCart(c,idPaymentTransaction);		
		notifyObserver("new transaction created"); // activates a notify
		return actualShoppingCart;
	}
	
	
	
	public void AddItem(String name, int quant){
		// first I search for the item
		Item item = catalogueItems.searchItem(name);
		
		// then, once I got that item, I create a LINE (item+quantity)		
		ShoppingCartLine shoppingCartLine = new ShoppingCartLine(item, quant);
		// For last, I add this line to my actual shopping cart
		actualShoppingCart.addShoppingCartLine(shoppingCartLine);		
	}
	
	public void pay(PaymentMethod paymentMethod){
		List<ShoppingCartLine> shoppingCartLineCollection = actualShoppingCart.getShoppingCartLine();
		paymentMethod.pay(shoppingCartLineCollection);
	}

	public ArrayList<Item> getAllItems() {
		ArrayList<Item> allItems = new ArrayList<Item>();
		// get all items
		return allItems;
	}

	public Offer createAnOffer(String string, ArrayList<Item> itemsToOffer) {
		Offer offer = new Offer("a-b-c combo", itemsToOffer);
		notifyObserver("offer created"); // activates a notify
		return offer;
		
	}

	public void changePrice(double p, Item i) {		
		catalogueItems.changePrice(p,i);
		notifyObserver("price changed"); // activates a notify
		
	}
	
	@Override
	public void addObserver(Observer o){
		users.add(o);
	}
	@Override
	public void removeObserver(Observer o){
		users.remove(o);
	}
	@Override
	public void notifyObserver(String event){
		// notify all users from the user list
		for(Observer user: users){
			user.update(event);
		}
	}
	
	
	
	
}
