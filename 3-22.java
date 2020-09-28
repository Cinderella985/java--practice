import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		if (Math.pow(number1 * number1 + number2 * number2, 0.5) <= 10 )
			System.out.print("Point (" + number1 + "," + number2 + ") is in the circle");
		if (Math.pow(number1 * number1 + number2 * number2, 0.5) > 10 )
			System.out.print("Point (" + number1 + "," + number2 + ") is not in the circle");
	}
}	
		
		
		