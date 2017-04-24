package keyPoint6;

import java.util.ArrayList;
import java.util.List;

public class CreditCardMethod implements PaymentMethod {
	
	private String name;
	private String cardNumber;
	
	public CreditCardMethod(String nm, String ccNumer){
		this.name=nm;
		this.cardNumber=ccNumer;
		
	}

	@Override
	public void pay(List<ShoppingCartLine> shoppingCartLineCollection) {
		System.out.println("paid with credit card --> 10% discount");
		int sum = 0;
		for (int index = 0; index < shoppingCartLineCollection.size() ; index++){
			
			double price = shoppingCartLineCollection.get(index).getItem().getPrice();
			int quant = shoppingCartLineCollection.get(index).getQuant();
			
			sum += price*quant;			
		}
		
		System.out.println("you get: "+ sum*0.9);
		

	}

}
