import java.util.Scanner;

public class N {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of sides: ");
		double r = input.nextDouble();
		
		System.out.print("Enter the side: ");
		double s = input.nextDouble();
		
		double area = (r * s * s) / (4 * Math.tan(Math.PI / r));
		
		System.out.println("The area of the polygon is " + area);
	}
}