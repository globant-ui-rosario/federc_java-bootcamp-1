package keyPoint1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmountToTextTest {

	@Test
	public void testFor_100_to_text() {
		String text = EnglishNumberToText.convert(100);
		assertEquals("one hundred",text);
	}
	
	@Test
	public void testFor_801_to_text() {
		String text = EnglishNumberToText.convert(801);
		assertEquals("eight hundred one",text);
	}
	
	@Test
	public void testFor_dollarAndCent_to_text() {
		String text = EnglishNumberToText.convertdollarAndCent(123.45);
		assertEquals("one hundred twenty three and forty five cents",text);
	}

}
