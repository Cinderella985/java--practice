import java.util.Scanner;
class Inch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet" );
		double feet = input.nextDouble();
		double meters = feet * 0.305;
		System.out.print(" Feet " + feet + " is " + meters + " meters ");
	}
 }
