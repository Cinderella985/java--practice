import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x3 = Math.toRadians(x1);
		double y3 = Math.toRadians(y1);
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x4 = Math.toRadians(x2);
		double y4 = Math.toRadians(y2);
		
		double d = 6371.01 * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x3) * Math.cos(y3 - y4));
		
		System.out.println("The distance between the two points is " + d + " km");
	}
}