import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an ASCII code: ");
		int x1 = input.nextInt();
		
		char ch = (char)x1;
		
		System.out.println("The character for ASCII code " + x1 + " is " + ch);
	}
}