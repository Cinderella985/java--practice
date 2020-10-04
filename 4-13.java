import java.util.Scanner;

public class Letter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char x1 = input.next().toLowerCase().charAt(0);
		
		if (x1 == 'a') {
			System.out.print(x1 + " is a vowel");
		}
		else if (x1 == 'e') {
			System.out.print(x1 + " is a vowel");
		}
		else if (x1 == 'i') {
			System.out.print(x1 + " is a vowel");
		}
		else if (x1 == 'o') {
			System.out.print(x1 + " is a vowel");
		}
		else if (x1 == 'u') {
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