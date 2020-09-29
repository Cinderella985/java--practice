import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three numbers of triangle : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if ((a + b > c) && (a + c > b) && (b + c > a))
			System.out.print("The perimeter is" + (a + b + c));
		else
			System.out.print("Invalid input");
	}
}
