package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class DataShoppingCart implements IDataShoppingCart {

	private List<ShoppingCart> shoppingCartCollection = new ArrayList<ShoppingCart>();

	/* (non-Javadoc)
	 * @see keyPoint2.IDataShoppingCart#saveShoppingCart(keyPoint2.ShoppingCart)
	 */
	@Override
	public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart) {

		shoppingCartCollection.add(shoppingCart);
		return shoppingCart;
	}

	/* (non-Javadoc)
	 * @see keyPoint2.IDataShoppingCart#getShoppingCartById(int)
	 */
	@Override
	public ShoppingCart getShoppingCartById(int id) {
		ShoppingCart shoppingCart = null;
		for (ShoppingCart s : shoppingCartCollection) {
			if (s.getId() == id) {
				shoppingCart = s;
			}
		}
		return shoppingCart;
	}

	/* (non-Javadoc)
	 * @see keyPoint2.IDataShoppingCart#pay(keyPoint2.ShoppingCart)
	 */
	@Override
	public void pay(ShoppingCart shoppingCart) {
		shoppingCart.setPaid(true);
	}

}
