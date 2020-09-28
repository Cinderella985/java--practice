import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		if ( number1 < 5 &&  number2 < 2.5 )
			System.out.print("Point (" + number1 + "," + number2 + ") is in the rectangle");
		if ( number1 > 5 &&  number2 > 2.5 )
			System.out.print("Point (" + number1 + "," + number2 + ") is not in the rectangle");
	}
}	
		
		
		