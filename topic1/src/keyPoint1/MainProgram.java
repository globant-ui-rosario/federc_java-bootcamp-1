package keyPoint1;

public class MainProgram {
	
	public static void main(String[] args) {

		// after reading a Client, I obtain:
		Client c = new Client("John");
		
		// before reading items to add, I create the Controller
		ControllerShoppingCart CSC = new ControllerShoppingCart();
		
		// after reading items[name+quantity], one by one until finish
		CSC.AddItem(name, quant);
		
		
    }

}
