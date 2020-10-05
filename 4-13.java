import java.util.Scanner;

public class Letter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char x1 = input.next().charAt(0);
		
		if (x1 == 'a' || x1 == 'A') {
			System.out.print(x1 + " is a vowel");
		}
		else if (x1 == 'e' || x1 == 'E') {
			System.out.print(x1 + " is a vowel");
		}
		else if (x1 == 'i' || x1 == 'I') {
			System.out.print(x1 + " is a vowel");
		}
		else if (x1 == 'o' || x1 == 'O') {
			System.out.print(x1 + " is a vowel");
		}
		else if (x1 == 'u' || x1 == 'U') {
			System.out.print(x1 + " is a vowel");
		}
		
		else if (Character.isLetter(x1)){
			System.out.print(x1 + " is a consonant");
		}
		else {
			System.out.print(x1 + " is an invalid input");
		}
	}
	
	
}
