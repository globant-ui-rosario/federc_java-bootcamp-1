package keyPoint2;

public interface IDataShoppingCart {

	public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart);

	public ShoppingCart getShoppingCartById(int id);

	public void pay(ShoppingCart shoppingCart);

}