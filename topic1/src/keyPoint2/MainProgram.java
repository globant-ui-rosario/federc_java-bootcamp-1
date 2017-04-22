package keyPoint2;

public class MainProgram {
	
	public static void main(String[] args) {

		// after reading a Client, I obtain:
		Client c = new Client("John");
		
		// before reading items to add, I create the Controller
		ControllerShoppingCart CSC = new ControllerShoppingCart();
		
		// I create a new shoppingCart, using the controller
		ShoppingCart shoppingCart = CSC.createNewShoppingCart();
		
		// I read items[name+quantity], one by one until client decides to finish
		String name = "a";			//
		int quant = 3;				// iteration
		CSC.AddItem(name, quant);   // 
		
		
		// when client decides to finish, client enters a pay method
		
				//pay by credit card
				CSC.pay(new CreditCardMethod("John","555555555"));
				
				//pay by paypal
				CSC.pay(new PayPalMethod("john@a.com", "*****"));
				
				//pay by cash
				CSC.pay(new CashMethod());
				
				
		
		
    }

}
