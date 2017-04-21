package keyPoint1;

public class ControllerShoppingCart {

	private ShoppingCart actualShoppingCart;
	private CatItems catItems;
	private Client actualClient;
	
	public ControllerShoppingCart(){
		
	}
	
	
	
	public void AddItem(String name, int quant){
		// first I search for the item
		Item item = new Item();
		item = catItems.serchItem(name);
		
		// then, once I got that item, I create a LINE
		
	}
	
}
