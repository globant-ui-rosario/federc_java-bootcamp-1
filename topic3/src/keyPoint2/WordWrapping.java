package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class WordWrapping {
	
	public static String wrap(String text, int rowLength) {
		String wordWrapped="";
		List<String> arrayStrings = new ArrayList<String>();
		int index = 0;
		while (index < text.length()) {
			arrayStrings.add(text.substring(index, Math.min(index + 5,text.length())));
		    index += rowLength;
		}
		
		for(String s: arrayStrings){
			wordWrapped = wordWrapped + s + " " ;
		}
				
		return wordWrapped;
	}

}
