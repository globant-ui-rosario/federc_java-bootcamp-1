package keyPoint3;

import java.util.ArrayList;

public class PayPalMethod implements PaymentMethod {  // I must apply Iterator pattern, but i can't figure it out how to do it (relying on the design pattern documentation)
	
	private String email;
	private String password;
	
	public PayPalMethod (String mail, String psw){
		this.email=mail;
		this.password=psw;
	}

	@Override
	public void pay(ArrayList<ShoppingCartLine> shoppingCartLineCollection) {
		
		System.out.println("paid with PayPal --> cheapest item for free");		
		float sum=0;
		for (int index = 0; index < shoppingCartLineCollection.size() ; index++){
			 
			//delete cheapest item
			// then, calculate the total as: sum += price*quant;			
		}
		
		System.out.println("you get: "+ sum);

	}

}
