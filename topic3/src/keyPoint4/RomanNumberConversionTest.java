package keyPoint4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumberConversionTest {

	@Test
	public void testForConvert_C_to_100() {
		assertEquals(new Conversion("C").doConversion(), 100);
	}

	@Test
	public void testForConvert_X_to_10() {
		assertEquals(new Conversion("XXI").doConversion(), 21);
	}

	@Test
	public void testForConvert_V_to_5() {
		assertEquals(new Conversion("v").doConversion(), 5);
	}

}
