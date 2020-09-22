import java.util.Scanner;

 class Number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000" );
		int number = input.nextInt();
		int a = number % 10;
		int b = number / 100;
		int c = number / 10;
		int d = c % 10;
		int e = a + b + d;
		System.out.print(" The sum of the digits is " + e);
	}
 }
