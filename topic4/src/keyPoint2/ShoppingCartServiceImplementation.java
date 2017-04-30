package keyPoint2;


import java.util.List;



public class ShoppingCartServiceImplementation implements ShoppingCartService {
	
	private DataShoppingCart dataShoppingCart;

	public ShoppingCartServiceImplementation() {
		dataShoppingCart = new DataShoppingCart();
	}

	@Override
	public void createShoppingCart(ShoppingCart shoppingCart) {
		dataShoppingCart.createShoppingCart(shoppingCart);

	}

	@Override
	public List<ShoppingCart> getAllShoppingCart() {
		return dataShoppingCart.getAllShoppingCart();

	}

}
