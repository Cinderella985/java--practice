public class H {
	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 10;
		int count = 0;
		
		System.out.println("The numbers from 100 to 200 are ");
		
		for (int number = 100; number <= 200; number++) {
			if ((number % 5 == 0 && number % 6 != 0) || (number % 5 != 0 && number % 6 == 0)) {
				count++;
			if (count % NUMBER_PER_LINE == 0) 
				System.out.println(number);
			else 
				System.out.print(number + " ");	
			}
		}
	}
}
