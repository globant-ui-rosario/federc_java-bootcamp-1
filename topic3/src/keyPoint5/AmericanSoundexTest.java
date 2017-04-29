package keyPoint5;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmericanSoundexTest {

	@Test
	public void testAmericanSoundex() {
		AmericanSoundex americanSoundex = new AmericanSoundex();
	 	String name = "federico";	
        assertEquals(americanSoundex.soundex(name),"F362");
	}

}
