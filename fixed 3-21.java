import java.util.Scanner;

public class Ho {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		System.out.print("Enter month: 1-12: ");
		System.out.print("Enter the day of the month: ");
		int c = input.nextInt();
		int m = input.nextInt();
		int q = input.nextInt();
		int j = c / 100;
		int k = c % 100;
		int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;		
		
		if (m == 1){
			int c1 = c-1;
			int m1 = 13;
			int j1 = c1 / 100;
			int k1 = c1 % 100;
			h = (q + 26 * (m1 + 1) / 10 + k1 + k1 / 4 + j1 / 4 + 5 * j1) % 7;
			}	
			
		else if (m == 2){
			int c2 = c-1;
			int m2 = 13;
			int j2 = c2 / 100;
			int k2 = c2 % 100;
			h = (q + 26 * (m2 + 1) / 10 + k2 + k2 / 4 + j2 / 4 + 5 * j2) % 7;
			}
		
		else {
			h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
			}
		
		
		switch(h){
		case 0: System.out.print("Day of the week is Saturday");
		break;
		case 1: System.out.print("Day of the week is Sunday");
		break;
		case 2: System.out.print("Day of the week is Monday");
		break;
		case 3: System.out.print("Day of the week is Tuesday");
		break;
		case 4: System.out.print("Day of the week is Wednesday");
		break;
		case 5: System.out.print("Day of the week is Thursday");
		break;
		case 6: System.out.print("Day of the week is Friday");
		break;
		}
		
	}
}