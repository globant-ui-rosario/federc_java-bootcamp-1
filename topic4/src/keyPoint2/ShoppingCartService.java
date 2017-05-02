package keyPoint2;

public interface ShoppingCartService {
	/** java docs (buscar)
	 * this method recieves a User as parameter
	 * @param user type User
	 * @return it returns a ShoppingCart
	 */
	public ShoppingCart createShoppingCart(User user);
	public ShoppingCart getShoppingCartById(int id); 
	
}
