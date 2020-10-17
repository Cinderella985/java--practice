import java.util.Scanner;

class Exe5_28 { 	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		System.out.print("Enter the first day of January: ");
		int today = input.nextInt();
		
		System.out.print("\n");
		
		if (today == 1)
			System.out.println("January 1, " + year + " is Monday");
		else if(today == 2)
			System.out.println("January 1, " + year + " is Tuesday");
		else if(today == 3)
			System.out.println("January 1, " + year + " is Wednesday");
		else if(today == 4)
			System.out.println("January 1, " + year + " is Thursday");
		else if(today == 5)
			System.out.println("January 1, " + year +  " is Friday");
		else if(today == 6)
			System.out.println("January 1, " + year + " is Saturday");
		else if(today == 7)
			System.out.println("January 1, " + year + " is Sunday");
		else
			System.out.println("wrong number");
		
		int month = 1;
		int day = 0;
		int nextDay = today;
		
		while (month < 12) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
				day = 3;
			}
			else if (month == 2 && year % 4 == 0 && year % 100 !=0) {
				day = 1;
			}
			else if (month == 2 && (year % 4 == 0 || year % 100 !=0)) {
				day = 0;
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11) {
				day = 2;
			}
			nextDay = day + nextDay;
			
			if (nextDay > 7) {
				nextDay = nextDay - 7;
			}
			month++;
			
			switch(month){
				case 2: System.out.print("Februry 1,");
				break;
				case 3: System.out.print("March 1,");
				break;
				case 4: System.out.print("Apirl 1,");
				break;
				case 5: System.out.print("May 1,");
				break;
				case 6: System.out.print("June 1,");
				break;
				case 7: System.out.print("July 1,");
				break;
				case 8: System.out.print("August 1,");
				break;
				case 9: System.out.print("September 1,");
				break;
				case 10: System.out.print("October 1,");
				break;
				case 11: System.out.print("November 1,");
				break;
				case 12: System.out.print("December 1,");
				break;
			}
			
			if (nextDay == 1)
				System.out.println(" " + year + " is Monday");
			else if(nextDay == 2 )
				System.out.println(" " + year + " is Tuesday");
			else if(nextDay == 3)
				System.out.println(" " + year + " is Wednesday");
			else if(nextDay == 4)
				System.out.println(" " + year + " is Thursday");
			else if(nextDay == 5)
				System.out.println(" " + year +  " is Friday");
			else if(nextDay == 6)
				System.out.println(" " + year + " is Saturday");
			else if(nextDay == 7)
				System.out.println(" " + year + " is Sunday");
		}
	}
}