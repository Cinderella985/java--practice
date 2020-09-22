import java.util.Scanner;

 class Pounds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds");
	double pounds = input.nextDouble();
	double kilograms = pounds * 0.454;
	System.out.print( pounds + "pounds is" + kilograms + "kilograms")
	}
 }
