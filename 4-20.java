import java.util.Scanner;

public class Yo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String x1 = input.next();
		
		System.out.println("The length of " + x1 + " is " + x1.length());
		System.out.println("The length of " + x1 + " is " + x1.charAt(0));
	}
}