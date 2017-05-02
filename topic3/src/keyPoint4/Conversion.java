package keyPoint4;

public class Conversion {
	
	private String roman;

	
	public String getRoman() {
		return roman;
	}

	public void setRoman(String roman) {
		this.roman = roman;
	}
	
	public Conversion (String roman){
		this.setRoman(roman);
	}
	
	public int doConversion(){
		return romanToInt(this.getRoman());
	}

	public int romanToInt(String romanNumber) {
	    if(romanNumber == null){
	        return 0;
	    }
	    romanNumber = romanNumber.toUpperCase();
	    int length = romanNumber.length();
	    int sum = 0;
	    int pre = 0;
	    
	    for(int i = length - 1; i >= 0; i--){
	        int cur = romanTable(romanNumber.charAt(i));
	        
	        if(i == length - 1){
	            sum = sum + cur;
	        }else{
	           if(cur < pre){
	               sum = sum - cur;
	           }else{
	               sum = sum + cur;
	           }
	        }
	        pre = cur;
	    }
	    
	    return sum;
	}

	public int romanTable(char c){
	    int num = 0;
	    switch(c){
	        case 'I':
	            num = 1;
	            break;
	        case 'V':
	            num = 5;
	            break;
	         case 'X':
	            num = 10;
	            break;
	         case 'L':
	             num = 50;
	             break;
	         case 'C':
	             num = 100;
	             break;
	         case 'D':
	             num = 500;
	             break;
	         case 'M':
	             num = 1000;
	             break;
	         default:
	             num = 0;
	             break;
	    }
	    return num;
	}
}
