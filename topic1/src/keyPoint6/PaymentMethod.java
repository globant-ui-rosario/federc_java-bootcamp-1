package keyPoint6;

import java.util.ArrayList;
import java.util.List;

public interface PaymentMethod {  // strategy design pattern used
	
	
	
	public void pay(List<ShoppingCartLine> shoppingCartLineCollection);

}
