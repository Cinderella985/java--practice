import java.util.Scanner;

class Exe6_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter the first number: ");
		double num1 = input.nextDouble();
		
		System.out.print("Enter the second number: ");
		double num2 = input.nextDouble();
		
		System.out.print("Enter the third number: ");
		double num3 = input.nextDouble();
		
		displaySortNumbers(num1, num2, num3);
	}	
	
	public static void displaySortNumbers(double num1, double num2, double num3) {
		double temp;
		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num2 < num1) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		System.out.print(num1 + " " + num3 + " " + num2);		
	}
}
