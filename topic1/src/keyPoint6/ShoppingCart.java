package keyPoint6;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private int idPaymentTransaction;
	
	public int getIdPaymentTransaction() {
		return idPaymentTransaction;
	}

	public void setIdPaymentTransaction(int idPaymentTransaction) {
		this.idPaymentTransaction = idPaymentTransaction;
	}

	public ShoppingCart(){
		
	}
	
	public ShoppingCart(Client c, int id){
		this.setClient(c);
		this.setIdPaymentTransaction(id);
		}
	
	private Client client;
	private ShoppingCartLine shoppingCartLine;
	private List<ShoppingCartLine> shoppingCartLineCollection;
	
	
	public void setShoppingCartLine(ShoppingCartLine shoppingCartLine) {
		this.shoppingCartLine = shoppingCartLine;
	}

	 

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<ShoppingCartLine> getShoppingCartLine() {
		return shoppingCartLineCollection;
	}

	public void setShoppingCartLine(List<ShoppingCartLine> shoppingCartLine) {
		this.shoppingCartLineCollection = shoppingCartLineCollection;
	}

		
	public void addShoppingCartLine(ShoppingCartLine SCL){
		shoppingCartLineCollection.add(SCL);
	}
	
	
	
	
}
