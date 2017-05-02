package keyPoint2;


import java.util.List;



public class ShoppingCartServiceImplementation implements ShoppingCartService {
	
	private DataShoppingCart dataShoppingCart;

	public ShoppingCartServiceImplementation(DataShoppingCart ds) {
		this.setDataShoppingCart(ds);
	}

	public DataShoppingCart getDataShoppingCart() {
		return dataShoppingCart;
	}

	public void setDataShoppingCart(DataShoppingCart dataShoppingCart) {
		this.dataShoppingCart = dataShoppingCart;
	}

	@Override
	public ShoppingCart createShoppingCart(User user) {
		ShoppingCart shoppingCart = new ShoppingCart(user);
		dataShoppingCart.createShoppingCart(shoppingCart);

	}

	@Override
	public List<ShoppingCart> getAllShoppingCart() {
		return dataShoppingCart.getAllShoppingCart();

	}

}
