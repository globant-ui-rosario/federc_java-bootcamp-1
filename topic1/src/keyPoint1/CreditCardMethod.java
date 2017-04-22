package keyPoint1;

public class CreditCardMethod implements PaymentMethod {
	
	private String name;
	private String cardNumber;
	
	public CreditCardMethod(String nm, String ccNumer){
		this.name=nm;
		this.cardNumber=ccNumer;
		
	}

	@Override
	public void pay() {
		System.out.println("paid with credit card");

	}

}
