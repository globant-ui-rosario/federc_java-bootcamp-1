package keyPoint2;


public class ShoppingCartServiceImplementation implements ShoppingCartService {
	
	private DataShoppingCart dataShoppingCart;

	public ShoppingCartServiceImplementation(DataShoppingCart dataShoppingCart) {
		this.setDataShoppingCart(dataShoppingCart);
	}

	public DataShoppingCart getDataShoppingCart() {
		return dataShoppingCart;
	}

	public void setDataShoppingCart(DataShoppingCart dataShoppingCart) {
		this.dataShoppingCart = dataShoppingCart;
	}

	@Override
	public ShoppingCart createShoppingCart(User user) {
		return dataShoppingCart.createShoppingCart(user);

	}

	@Override
	public ShoppingCart getShoppingCartById(int id) {
		return dataShoppingCart.getShoppingCartById(id);

	}
	
	@Override
	public void pay(ShoppingCart shoppingCart) {
		dataShoppingCart.pay(shoppingCart);

	}

}
