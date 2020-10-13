class K {
	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 8;
		int count = 0;
		int number=2;
	
		System.out.println("The primenumbers from 2 to 1000 are \n");
		
		for (; number <= 1000; number++) {
			boolean isPrime = true;
			for (int x = 2; x <= number / 2; x++) {
				if (number % x == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
			if (count % NUMBER_PER_LINE == 0) {
				System.out.println(number);
			}
			else
				System.out.print(number + " ");
			}
		}
	}
}
			
	  
