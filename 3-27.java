import java.util.Scanner;

public class Dadlic {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		if (number1 <= 200 - 2 * number2 && number1 >= 0 && number2 <= 100 - 0.5 * number1 && number2 >= 0)
			System.out.print("The point is in the triangle");
		else
			System.out.print("The point is not in the triangle");
	}
}
