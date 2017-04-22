package keyPoint6;

import java.util.ArrayList;

public class ShoppingCart {
	
	public ShoppingCart(){
		
	}
	
	public ShoppingCart(Client c){
		this.setClient(c);
		}
	
	private Client client;
	private ShoppingCartLine shoppingCartLine;
	private ArrayList<ShoppingCartLine> shoppingCartLineCollection;
	
	
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

		
	public void addShoppingCartLine(ShoppingCartLine SCL){
		shoppingCartLineCollection.add(SCL);
	}
	
	
	
	
}
