package keyPoint6;


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
		final double discount=0.9;
		System.out.println("paid with credit card --> 10% discount");
		int sum = 0;
		for(ShoppingCartLine line : shoppingCartLineCollection) {
			
			
			
			sum += line.getSubTotal();	
		}
		
		System.out.println("you get: "+ sum*discount);
		

	}

}
