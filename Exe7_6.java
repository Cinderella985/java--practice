class Exe7_6 {
	public static void main(String[] args) {
		final int NUMPERLINE = 50;
		int[] primeNumber = new int[NUMPERLINE];
		int count = 0;
		int number1 = 2;
		boolean isPrime = false;
		
		System.out.println("The first 50 prime numbers are");
		
		while (count < NUMPERLINE) {
			isPrime = true;
			for (int i = 0; i < count && primeNumber[i] <= Math.sqrt(number1); i++) {
				if (number1 % primeNumber[i] == 0) {
					isPrime = false;
				}
				else {
					isPrime = true;
					break;
				}
			}
				
			if (isPrime) {
				primeNumber[count] = number1;
				count++;
			}
				
			if (count % 10 == 0) {
				System.out.println(number1);
			}
			else {
				System.out.print(number1 + " ");
			}
				
			number1++;		
		}
	}
}
