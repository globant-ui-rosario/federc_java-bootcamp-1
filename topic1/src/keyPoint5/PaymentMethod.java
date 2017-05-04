package keyPoint5;

import java.util.ArrayList;

public interface PaymentMethod {  // strategy design pattern used
	
	
	
	public void pay(ArrayList<ShoppingCartLine> shoppingCartLineCollection);

}
