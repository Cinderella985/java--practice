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
		
		if (s1.compareTo(s2) < 0) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		if (s2.compareTo(s3) < 0) {
			String temp1 = s2;
			s2 = s3;
			s3 = temp1;
		}	
		if (s1.compareTo(s2) < 0) {
			String temp2 = s1;
			s1 = s2;
			s2 = temp2;
		}	
		System.out.print("The three cities in alphabetical order are " + s3 + " " + s2 + " " + s1)	;		
	}
}
