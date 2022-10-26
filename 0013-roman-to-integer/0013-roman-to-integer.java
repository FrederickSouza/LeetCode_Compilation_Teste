class Solution {
    public int romanToInt(String s) {
		int value = 0;
		
		for(int i = s.length()-1; i>=0 ; i--) {
			switch(s.charAt(i)) {
				case 'I' -> value += 1 * (value >= 5 ? -1 : 1);
				case 'V' -> value += 5;
				case 'X' -> value += 10 * (value >= 50 ? -1 : 1);
				case 'L' -> value += 50;
				case 'C' -> value += 100 * (value >= 500 ? -1 : 1);
				case 'D' -> value += 500;
				case 'M' -> value += 1000;
			}
		}
		return value;
    }
}