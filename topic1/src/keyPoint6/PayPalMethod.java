package keyPoint6;

import java.util.ArrayList;
import java.util.List;

public class PayPalMethod implements PaymentMethod {  // I must apply Iterator pattern, but i can't figure it out how to do it (relying on the design pattern documentation)
	
	private String email;
	private String password;
	
	public PayPalMethod (String mail, String psw){
		this.email=mail;
		this.password=psw;
	}

	@Override
	public void pay(List<ShoppingCartLine> shoppingCartLineCollection) {
		
		System.out.println("paid with PayPal --> cheapest item for free");		
		double sum=0;
		double cheapestItem = 999;		
		for (ShoppingCartLine SCL: shoppingCartLineCollection){
			 if(SCL.getItem().getPrice()< cheapestItem){
				 cheapestItem = SCL.getItem().getPrice();
				  }
			 sum +=SCL.getSubTotal();
		}
		
		System.out.println("you get: "+ (sum-cheapestItem));

	}

}
