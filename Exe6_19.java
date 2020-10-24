import java.util.Scanner;

class Exe6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter the first side: ");
		double side1 = input.nextDouble();
		
		System.out.print("Enter the second side: ");
		double side2 = input.nextDouble();
		
		System.out.print("Enter the third side: ");
		double side3 = input.nextDouble();
		
		if (area(side1, side2, side3) == 0.0)
			System.out.print("Invalid input");
		else
		System.out.print(area(side1, side2, side3));
	}
	
	public static boolean isValid (double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1 && side1 - side2 < side3 && side1 - side3 < side2 && side2 - side3 < side1 )
			return true;
		else
			return false;
	}
	
	public static double area (double side1, double side2, double side3) {
		if (isValid(side1, side2, side3)) {
			double s = 0.5 * (side1 + side2 + side3);
			double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
			return area;
		}
		return 0;
	}
	
}