import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		String x1 = input.next();
		
	
		boolean yes = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
		
		
		if (yes == true && x1.equals("Feb")) {
			System.out.print(x1 + " " + year + " has 29 days");
		}
		else if (x1.equals("Jan") || x1.equals("Mar") || x1.equals("May") || x1.equals("July") || x1.equals("Aug") || x1.equals("Oct") || x1.equals("Dec")) {
			System.out.print(x1 + " " + year + " has 31 days");
		}
		else if (yes == false && x1.equals("Feb")) {
			System.out.print(x1 + " " + year + " has 28 days");
		}
		else if (x1.equals("Apr") || x1.equals("Jun") || x1.equals("Sep") || x1.equals("Nov")) {
			System.out.print(x1 + " " + year + " has 31 days");
		}
		else {
			System.out.print(x1 + " is not a correct month name");
		}
	}
}
