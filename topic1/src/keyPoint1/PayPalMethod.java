package keyPoint1;

public class PayPalMethod implements PaymentMethod {
	
	private String email;
	private String password;
	
	public PayPalMethod (String mail, String psw){
		this.email=mail;
		this.password=psw;
	}

	@Override
	public void pay() {
		System.out.println("paid with PayPal");

	}

}
