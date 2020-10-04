import java.util.Scanner;

public class City {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter the second city: ");
		String s2 = input.nextLine();
		
		System.out.print("Enter the third city: ");
		String s3 = input.nextLine();
		
		if (s1.compareTo(s2) < 0 && s2.compareTo(s3) < 0 && s1.compareTo(s3) < 0) {
			System.out.print("The three cities in alphabetical order are " + s1 + " "  + s2 + " " + s3);
		}
		else if (s1.compareTo(s2) < 0 && s2.compareTo(s3) > 0 && s1.compareTo(s3) < 0) {
			System.out.print("The three cities in alphabetical order are " + s1 + " " + s3 + " " + s2);
		}
		else if (s1.compareTo(s2) > 0 && s2.compareTo(s3) > 0 && s1.compareTo(s3) > 0) {
			System.out.print("The three cities in alphabetical order are " + s3 + " " + s2 + " " + s1);
		}
		else if (s1.compareTo(s2) > 0 && s2.compareTo(s3) < 0 && s1.compareTo(s3) > 0) {
			System.out.print("The three cities in alphabetical order are " + s2 + " " + s3 + " " + s1);
		}
		else if (s1.compareTo(s2) < 0 && s2.compareTo(s3) > 0 && s1.compareTo(s3) > 0) {
			System.out.print("The three cities in alphabetical order are " + s3 + " " + s1 + " " + s2);
		}
		else if (s1.compareTo(s2) > 0 && s2.compareTo(s3) < 0 && s1.compareTo(s3) < 0) {
			System.out.print("The three cities in alphabetical order are " + s2 + " " + s1 + " " + s3);
		}
	}
}