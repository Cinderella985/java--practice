import java.util.Scanner;

public class Hexagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double r = input.nextDouble();
		
		double area = (6 * r * r) / (4 * Math.tan(Math.PI / 6));
		
		System.out.println("The area of the pentagon is " + (int)(area * 100 + 0.5) / 100.0);
	}
}