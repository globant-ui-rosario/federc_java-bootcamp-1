package keyPoint3;

public interface ShoppingCartService {
	/** 
	 * This method receives a user. Then, creates and returns a ShoppingCart with that user setted.
	 * @author Aguirre Federico working on Java Bootcamp 2017
	 * @param receives existing user
	 * @return a ShoppingCart with user setted
	 */
	public ShoppingCart createShoppingCart(User user);
	
	/** 
	 * This method receives a ShoppingCart id. Then, searches and returns a specific ShoppingCart.
	 * @author Aguirre Federico working on Java Bootcaamp 2017
	 * @param receives an id
	 * @return a specific ShoppingCart
	 */
	public ShoppingCart getShoppingCartById(int id);
	
	/** 
	 * This method receives the current ShoppingCart (that is fully complete with an user and items collection) in order to pay for it. 
	 * @author Aguirre Federico working on Java Bootcaamp 2017
	 * @param receives current ShoppingCart
	 */
	public void pay(ShoppingCart shoppingCart);
	
}
