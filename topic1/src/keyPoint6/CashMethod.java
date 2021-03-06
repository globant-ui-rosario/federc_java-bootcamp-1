package keyPoint6;

import java.util.ArrayList;
import java.util.List;

public class CashMethod implements PaymentMethod {// I must apply Iterator pattern, but i can't figure it out how to do it (relying on the design pattern documentation)
	

	@Override
	public void pay(List<ShoppingCartLine> shoppingCartLineCollection) {
		System.out.println("paid with cash --> 90% discount of the most expensive item");
		final double discount = 0.1;
		double sum = 0;
		double mostExpensiveValue = 0;
		for (ShoppingCartLine SCL: shoppingCartLineCollection){
			// save the the most expensive item in a variable			
			if(SCL.getItem().getPrice() > mostExpensiveValue){
				mostExpensiveValue = SCL.getItem().getPrice();				
			}
			// then, calculate the total as:  variable that contains the value*0.1;
			sum += SCL.getSubTotal();
		}
		
		sum = sum - (mostExpensiveValue*discount);
		
	}

}
