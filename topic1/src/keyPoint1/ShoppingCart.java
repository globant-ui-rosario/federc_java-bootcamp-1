package keyPoint1;

import java.util.ArrayList;

public class ShoppingCart {
	
	public ShoppingCart(){
		
	}
	
	private Client client;
	private ShoppingCartLine shoppingCartLine;
	private ArrayList<ShoppingCartLine> shoppingCartLineCollection ; // inicializar
	
	
	public void setShoppingCartLine(ShoppingCartLine shoppingCartLine) {
		this.shoppingCartLine = shoppingCartLine;
	}

	 

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<ShoppingCartLine> getShoppingCartLine() {
		return shoppingCartLineCollection;
	}

	public void setShoppingCartLine(ArrayList<ShoppingCartLine> shoppingCartLine) {
		this.shoppingCartLineCollection = shoppingCartLineCollection;
	}

	public ShoppingCart(Client client){
		shoppingCartLineCollection = new ArrayList<ShoppingCartLine>();
		
		
	}
	
	public void addShoppingCartLine(ShoppingCartLine SCL){
		shoppingCartLineCollection.add(SCL);
	}
	
	
	
	
}
