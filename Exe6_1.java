class Exe6_1 {
	public static void main(String[] args) {
		System.out.println("The numbers from 1 to 100 are: ");
		getRentagonal(1);
	}
	
	public static void getRentagonal(int n) {
		final int numberOfRentagonal = 100;
		final int numberPerLine = 10;
		
		while (n <= 100) {
			int number = n * (3 * n - 1) / 2;
			if (n % numberPerLine == 0) 
				System.out.printf("%7d\n", number);
			else
				System.out.printf("%7d", number);
			n++;
		}
		return;
	}
}

