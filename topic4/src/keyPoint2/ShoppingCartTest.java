package keyPoint2;

import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertTrue;

import org.easymock.EasyMock;
import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void getShoppingCartByIdTest() {

		User user = new User();
		ShoppingCart shoppingCart = new ShoppingCart(user);
		shoppingCart.setPaid(true);

		IDataShoppingCart dataShoppingCart = EasyMock.mock(IDataShoppingCart.class);
		EasyMock.reset(dataShoppingCart);
		ShoppingCartService shoppingCartService = new ShoppingCartServiceImplementation(dataShoppingCart);
		expect(dataShoppingCart.getShoppingCartById(2)).andReturn(shoppingCart);
		replay(dataShoppingCart);

		ShoppingCart shoppingCartObtained = shoppingCartService.getShoppingCartById(2);
		assertTrue(shoppingCartObtained.getPaid());
	}

	@Test
	public void createShoppingCartTest() {

		IDataShoppingCart dataShoppingCart = EasyMock.mock(DataShoppingCart.class);

		User user = new User();
		ShoppingCart sc = new ShoppingCart(user);

		expect(dataShoppingCart.saveShoppingCart(anyObject(ShoppingCart.class))).andReturn(sc);
		replay(dataShoppingCart);

		ShoppingCartService shoppingCartService = new ShoppingCartServiceImplementation(dataShoppingCart);

		ShoppingCart shoppingCart = shoppingCartService.createShoppingCart(user);
		assertTrue(sc.equals(shoppingCart));
	}

}
