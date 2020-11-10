class Exe6_26 {
	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 10;
		final int prime = 100;
		int count = 0;
		int number = 2;
		
		System.out.println("The first 100 primenumbers are \n");
		
		while (count < prime) {
			if (isPrime(number) && isRight(number)) {
				count++;
				if (count % NUMBER_PER_LINE == 0) {
					System.out.println(number);
				}
				else {
					System.out.print(number + " ");
				}
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
		int high;
		int low = 0;
		String number1 = Integer.toString(number);
		
		for (high = number1.length() - 1;low <= high; low++, high--) {
			number1 = Integer.toString(number);
			if (number1.charAt(low) != number1.charAt(high)) {
				return false;
			}
		}
		
		return true;
	}
}
