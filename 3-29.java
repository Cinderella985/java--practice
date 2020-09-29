import java.util.Scanner;

public class Cricle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter circle1's center x- and y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.print("Enter circle2's center x- and y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double rDistance1 = (r1 > r2) ? r1 - r2 : r2 - r1 ;
		double rDistance2 = r1 + r2 ;
		
		if (Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2),0.5) <= rDistance1)
			System.out.print("circle2 is inside circle1");
		else if (Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2),0.5) <= rDistance2)
			System.out.print("circle2 is overlap circle1");
		else
			System.out.print("circle2 does not overlap circle1");
	}
}