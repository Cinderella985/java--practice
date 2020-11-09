import java.util.Scanner;

class Exe6_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		int high = str.length() - 1;
		int low = 0;
		char uppercaseLetter = ' ';
		char x = ' ';
		
		while (low <= high) {
			if ((str.charAt(low) >= 'A' && str.charAt(low) <= 'Z') || (str.charAt(low) >= 'a' && str.charAt(low) <= 'z')) {
				uppercaseLetter = str.toLowerCase().charAt(low);
				System.out.print(getNumber(uppercaseLetter));
			}
			else {
				x = str.charAt(low);
				System.out.print(x);
			}
			
			low++;
		}
	}
	
	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter == 'a' || uppercaseLetter == 'b' || uppercaseLetter == 'c') {
			return 2;
		}
		else if (uppercaseLetter == 'd' || uppercaseLetter == 'e' || uppercaseLetter == 'f') {
			return 3;
		}
		else if (uppercaseLetter == 'g' || uppercaseLetter == 'h' || uppercaseLetter == 'i') {
			return 4;
		}
		else if (uppercaseLetter == 'j' || uppercaseLetter == 'k' || uppercaseLetter == 'l') {
			return 5;
		}
		else if (uppercaseLetter == 'm' || uppercaseLetter == 'n' || uppercaseLetter == 'o') {
			return 6;
		}
		else if (uppercaseLetter == 'p' || uppercaseLetter == 'q' || uppercaseLetter == 'r' || uppercaseLetter == 's') {
			return 7;
		}
		else if (uppercaseLetter == 't' || uppercaseLetter == 'u' || uppercaseLetter == 'v') {
			return 8;
		}
		else {
			return 9;
		}
	}
}






