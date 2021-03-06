import java.util.Scanner;

class Exe6_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter a credit card number as a long integer: ");
		long number = input.nextLong();
		
		if (isValid(number))
			System.out.println(number + " is valid ");
		else
			System.out.println(number + " is invalid ");
	}
	
	public static boolean isValid(long number) {
		return ((getSize(number) >= 13) && (getSize(number) <= 16) && (prefixMatched(number, 4) || prefixMatched(number, 5)	|| prefixMatched(number, 6) || prefixMatched(number, 37)) && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0));
	}
	
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		number = number / 10;
		
		while (number != 0) {
			sum += getDigit((int)(number % 10) * 2);
			number = number / 100;
		}
		
		return sum;
	}
	
	public static int getDigit(int number) {
		return number % 10 + (number / 10);
	}
	
	public static int sumOfOddPlace(long number) {
		int result = 0;
		
		while (number != 0) {
			result += (int)(number % 10);
			number = number / 100;
		}
		
		return result;	
	}
	
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}
	
	public static int getSize(long d) {
		int numberOfLength = 0;
		
		while (d != 0) {
			d /= 10;
			numberOfLength++;
		}
		
		return numberOfLength;
	}
	
	public static long getPrefix(long number, int k) {
		int i = 0;
		long result = number;
		
		for (i = 0; i < getSize(number) - k; i++) {
			result /= 10;
		}
		
		return result;
		
	}
}