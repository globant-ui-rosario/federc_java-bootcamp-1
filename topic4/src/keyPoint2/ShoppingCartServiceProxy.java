package keyPoint2;

import java.util.List;

public class ShoppingCartServiceProxy implements ShoppingCartService {
	ShoppingCartService implementation;
	
	public ShoppingCartServiceProxy(ShoppingCartService implementation) {
		this.implementation = implementation;
	}

	@Override
	public void createShoppingCart(ShoppingCart shoppingCart) {
		implementation.createShoppingCart(shoppingCart);

	}
	

	@Override
	public List<ShoppingCart> getAllShoppingCart() {
		return implementation.getAllShoppingCart();
	}

}
