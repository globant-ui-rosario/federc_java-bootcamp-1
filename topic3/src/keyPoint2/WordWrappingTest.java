package keyPoint2;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrappingTest {

	@Test
	public void test_wordWrap() {
		String text = "FEDERICO";
		int rowLength = 5;
		String wordWrapped = WordWrapping.wrap(text,rowLength);		
		assertEquals("FEDER ICO ", wordWrapped);
	}

}
