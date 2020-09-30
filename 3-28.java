import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a r1's center x- and y-coordinates, width, and height : ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		System.out.print("Enter a r2's center x- and y-coordinates, width, and height : ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		
		double xDistance = x1 >= x2 ? x1 - x2 : x2 - x1 ;
		double yDistance = y1 >= y2 ? y1 - y2 : y2 - y1 ;
		
		if (xDistance < 0.5 * w1 - 0.5 * w2 && yDistance < 0.5 * h1 - 0.5 * h2)
			System.out.print("r2 is inside r1");
		else if (xDistance <= 0.5 * w1 + 0.5 * w2 && yDistance <= 0.5 * h1 + 0.5 * h2)
			System.out.print("r2 overlaps r1");
		else
			System.out.print("r2 does not overlaps r1");
	}
}
