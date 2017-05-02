package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class DataShoppingCart {
	
	private List<ShoppingCart> shoppingCartCollection = new ArrayList<ShoppingCart>();
	
	
	public ShoppingCart createShoppingCart(User user) {
		ShoppingCart shoppingCart = new ShoppingCart(user);
		shoppingCartCollection.add(shoppingCart);
		return shoppingCart;
	}

	public ShoppingCart getShoppingCartById(int id) {
		ShoppingCart shoppingCart= null;
		for(ShoppingCart s : shoppingCartCollection){
			if(s.getId()==id){
				shoppingCart=s;
			}
		}
		return shoppingCart;
	}

	public void pay(ShoppingCart shoppingCart) {
		shoppingCart.setPaid(true);		
	}

}
