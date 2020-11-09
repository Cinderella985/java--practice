class Exe6_29 {
	public static void main(String[] args) {
		final int prime = 1000;
		int number = 2;
		
		System.out.println("The first 1000 primenumbers are \n");
		
		while (number < prime) {
			if (isPrime(number) && isRight(number)) {
				System.out.println("(" + number + ", " + (number + 2) + ")");
			}
			
			number++;
		}
	}
		
	public static boolean isPrime(int number) {
		for (int x = 2; x <= number / 2; x++) {
			if (number % x == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isRight(int number) {
		for (int x = 2; x <= (number + 2) / 2; x++) {
			if ((number + 2) % x == 0) {
				return false;
			}
		}
		
		return true;
	}
}