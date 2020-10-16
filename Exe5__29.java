import java.util.Scanner;

public class Exe5__29 { 	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		System.out.print("Enter the number as the first day: ");
		int today = input.nextInt();
		
		int month = 1;
		int days = 0;
		int sum = 0;
		
		while (month <= 12) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
				days = 31;
			}
			else if (month == 2 && year % 4 == 0 && year % 100 !=0) {
				days = 29;
			}
			else if (month == 2 && (year % 4 == 0 || year % 100 !=0)) {
				days = 28;
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11) {
				days = 30;
			}
			
			//当年一月一号到1900年1月1号的天数
			for (int i = 1900; i < year; i++) {
				if (i % 4 == 0 && i % 100 != 0 || year % 400 == 0) {
					sum += 366;
				}
				else {
					sum += 365;
				}
			}
		
			//当月一号到当年一月一号的天数
			for (int i = 1; i < month; i++) {
				if (i == 2) {
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						sum += 29;
					}
					else {
						sum += 28;
					}
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11) {
					sum += 30;
				}
				else {
					sum += 31;
				}
			}
			//加上本月一号
			sum += 1;
			System.out.print("\n");
		
			switch(month){
			case 1:	System.out.println("       January " + year);break;
			case 2: System.out.println("       Februry " + year);break;
			case 3: System.out.println("       March " + year);break;
			case 4: System.out.println("       Apirl " + year);break;
			case 5: System.out.println("       May " + year);break;
			case 6: System.out.println("       June " + year);break;
			case 7: System.out.println("       July " + year);break;
			case 8: System.out.println("       August " + year);break;
			case 9: System.out.println("       September " + year);break;
			case 10: System.out.println("      October " + year);break;
			case 11: System.out.println("      November " + year);break;
			case 12: System.out.println("      December " + year);break;
			}
			month++;
			System.out.println("____________________________________");
			System.out.println(" Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		
			for (int i = 0; i < sum % 7; i++) { 
				System.out.print("\t");
			}
			for (int i = 1; i <= days; i++) {
				if (sum % 7 == 6) {
					System.out.println(i);
				}	
				else {
					System.out.print(i + "\t");
				}
			sum++;
			}
			
		}
	}
}