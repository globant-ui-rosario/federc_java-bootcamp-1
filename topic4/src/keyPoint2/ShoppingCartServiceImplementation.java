package keyPoint2;

public class ShoppingCartServiceImplementation implements ShoppingCartService {

	private IDataShoppingCart dataShoppingCart;

	public ShoppingCartServiceImplementation(IDataShoppingCart dataShoppingCart) {
		this.setDataShoppingCart(dataShoppingCart);
	}

	public IDataShoppingCart getDataShoppingCart() {
		return dataShoppingCart;
	}

	public void setDataShoppingCart(IDataShoppingCart dataShoppingCart) {
		this.dataShoppingCart = dataShoppingCart;
	}

	@Override
	public ShoppingCart createShoppingCart(User user) {
		ShoppingCart shoppingCart = new ShoppingCart(user);
		return dataShoppingCart.saveShoppingCart(shoppingCart);

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
