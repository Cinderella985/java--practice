import java.util.Scanner;

class Temperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius:");
		double celsius = input.nextDouble();
		double fahrenheit = ( 9.0 / 5 ) * celsius + 32;
		System.out.print( "Celsius" + celsius + " is Fahrenheit degree = "+ fahrenheit);
	}
}

