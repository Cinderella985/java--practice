import java.util.Scanner;

public class Xc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string s1: ");
		String s1 = input.next();
		
		System.out.print("Enter a string s2: ");
		String s2 = input.next();
		
		if (s1.contains(s2)) {
			System.out.print(s2 + " is a substring of " + s1);
		}
		else {
			System.out.print(s2 + " is not a substring of " + s1);
		}
	}
}
		
		