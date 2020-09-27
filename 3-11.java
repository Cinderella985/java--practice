import java.util.Scanner;

public class Ki {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter month, year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		boolean yes = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
		
		switch(month){
		case 1: System.out.print("January");break;
		case 2: System.out.print("Februry");break;
		case 3: System.out.print("March");break;
		case 4: System.out.print("Apirl");break;
		case 5: System.out.print("May");break;
		case 6: System.out.print("June");break;
		case 7: System.out.print("July");break;
		case 8: System.out.print("August");break;
		case 9: System.out.print("September");break;
		case 10: System.out.print("October");break;
		case 11: System.out.print("November");break;
		case 12: System.out.print("December");break;
		}
		if (month == 2 && yes == true){
			System.out.print("" + year + "has 29 days");}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			System.out.print("" + year + "has 31 days");	
		else if (month == 2 && yes != true)
			System.out.print("" + year + "has 28 days");
		else
			System.out.print("" + year + "has 30 days");	
		}
		
		

}

