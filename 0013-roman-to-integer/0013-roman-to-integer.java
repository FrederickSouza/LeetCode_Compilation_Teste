class Solution {
    public int romanToInt(String s) {
		int digit = 0;
		int result = 0;
		int prev = 0;
		
		for (int i = s.length()-1 ; i>=0; i--) {
			switch(s.charAt(i)) {
				case 'I' -> digit = 1;
				case 'V' -> digit = 5;
				case 'X' -> digit = 10;
				case 'L' -> digit = 50;
				case 'C' -> digit = 100;
				case 'D' -> digit = 500;
				case 'M' -> digit = 1000;
			}
			
			if (digit >= prev) {
				result += digit; 
			} else {
				result -= digit;
			}
			
			prev = digit;
		}
		
		return result;
    }
}