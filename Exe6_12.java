class Exe6_12 {
	public static void main(String[] args) {
		
		printChars('1', 'Z', 10);
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int count = 1;
		for (int i = ch1; i <= 57; count++, i++) {
			if (count % numberPerLine == 0)
				System.out.println((char)i);
			else
				System.out.print((char)i + " ");
		}
		for (int m = ch2 - 25; m <= 90; count++, m++) {
			if (count % numberPerLine == 0)
				System.out.println((char)m);
			else
				System.out.print((char)m + " ");
		}
	}	
}

