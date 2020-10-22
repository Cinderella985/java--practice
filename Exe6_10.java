class Exe6_10 {
	public static void main(String[] args) {
		System.out.println("The primes from 1 to 1000 are \n");
		
		printPrimeNumber(1000);
	}
	
	public static void printPrimeNumber(int n) {
		final int perLine = 10;
		int count = 0;
		int number = 2;
		
		while (number < n) {
			if (isPrime(number)) {
				count++;
			if (count % perLine == 0) 
				System.out.printf("%-5d\n", number);
			else 
				System.out.printf("%-5d", number);
			}
			number++;
		}
	}
	
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0)
				return false;
		}
		return true;
	}
}
