package keyPoint1;

public class CashMethod implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("paid with cash");
	}

}
