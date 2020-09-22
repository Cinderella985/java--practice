import java.util.Scanner;

class Volume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder:" );
	double radius = input.nextDouble();
	double length = input.nextDouble();
	double area = radius * radius * 3.14159;
	double volume = area * length;
	System.out.print(" The area is " + area + " The volume is " + volume);
	}
 }

