package keyPoint2;


import java.util.List;

public interface ShoppingCartService {
	/** java docs (buscar)
	 * this method recieves a User as parameter
	 * @param user type User
	 * @return it returns a ShoppingCart
	 */
	public ShoppingCart createShoppingCart(User user); // crear el shopping cart con cliente seteado
	public List<ShoppingCart> getAllShoppingCart(); 
	// obtener uno cocnreto

}
