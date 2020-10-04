import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char x1 = input.next().charAt(0);
		
		System.out.println("The Unicode for the character " + x1 + " is " + (int)x1);
	}
}