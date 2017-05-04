package keyPoint2;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {

	private ShoppingCart shoppingCart;
	private ShoppingCartService shoppingCartService;

	@Before
	public void setUp() {
		portfolio = new Portfolio();
		portfolio.setName("Veera's portfolio.");
		marketMock = EasyMock.createMock(StockMarket.class);
		portfolio.setStockMarket(marketMock);
	}

	@Test
	public void getShoppingCartByIdTest() {

		expect(shoppingCart.setPaid(true)).andReturn(true).times(1);

		// Setup is finished need to activate the mock
		replay(shoppingCart);
		int shoppingCartId = 3;
		DataShoppingCart dataShoppingCart = new DataShoppingCart();
		ShoppingCartService shoppingCartService = new ShoppingCartServiceImplementation(dataShoppingCart);
		ShoppingCart shoppingCart = shoppingCartService.getShoppingCartById(shoppingCartId);
		assertEquals(true, shoppingCart.getPaid());
	}

}
