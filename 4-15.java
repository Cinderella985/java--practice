import java.util.Scanner;

public class Telephone {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char x1 = input.next().toLowerCase().charAt(0);
		
		if (x1 == 'a' || x1 == 'b' || x1 == 'c') {
			System.out.print("The corresponding number is 2");
		}
		else if (x1 == 'd' || x1 == 'e' || x1 == 'f') {
			System.out.print("The corresponding number is 3");
		}
		else if (x1 == 'g' || x1 == 'h' || x1 == 'i') {
			System.out.print("The corresponding number is 4");
		}
		else if (x1 == 'j' || x1 == 'k' || x1 == 'l') {
			System.out.print("The corresponding number is 5");
		}
		else if (x1 == 'm' || x1 == 'n' || x1 == 'o') {
			System.out.print("The corresponding number is 6");
		}
		else if (x1 == 'p' || x1 == 'q' || x1 == 'r' || x1 == 's') {
			System.out.print("The corresponding number is 7");
		}
		else if (x1 == 't' || x1 == 'u' || x1 == 'v') {
			System.out.print("The corresponding number is 8");
		}
		else if (x1 == 'w' || x1 == 'x' || x1 == 'y' || x1 == 'z') {
			System.out.print("The corresponding number is 9");
		}
		else {
			System.out.print(x1 + " is an invalid input");
		}
	}
}
		
