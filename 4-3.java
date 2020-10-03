import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Atlanta (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.print("Enter Orlando (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("Enter Savannah (latitude and longitude) in degrees: ");
		double x5 = input.nextDouble();
		double y5 = input.nextDouble();
	
		System.out.print("Enter Charlotte (latitude and longitude) in degrees: ");
		double x7 = input.nextDouble();
		double y7 = input.nextDouble();
		
		double area1 = 0.5 * Math.abs((x2 - x1) * (y7 - y1) - (y2 - y1) * (x7 - x1));
		double area2 = 0.5 * Math.abs((x2 - x5) * (y7 - y5) - (y2 - y5) * (x7 - x5));
		double totalArea = area1 + area2;
		
		System.out.println("The area is " + totalArea);
	}
}