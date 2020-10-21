import java.util.Scanner;

class Exe6_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter an integer: ");
		long number = input.nextLong();
		
		System.out.print("The number is " + sumDigits(number));
	}

	public static int sumDigits(long n) {
		int result = 0;
		
		while (n != 0) {
			long m = n % 10;
			n /= 10;
			result += m;
		}
		return result;
	}
}