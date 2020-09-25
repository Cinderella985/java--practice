import java.util.Scanner;

public class Sa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today day: ");
		System.out.print("Enter the number of days elapsed since today: ");
		int today = input.nextInt();
		if (today == 1)
			System.out.print("Monday");
		else if(today == 2)
			System.out.print("Tuesday");
		else if(today == 3)
			System.out.print("Wednesday");
		else if(today == 4)
			System.out.print("Thursday");
		else if(today == 5)
			System.out.print("Friday");
		else if(today == 6)
			System.out.print("Saturday");
		else if(today == 0)
			System.out.print("Sunday");
		else
			System.out.print("wrong number");
		
		int number = input.nextInt();
		int day = today + number % 7;
		switch(day){
			case 0: System.out.print("Sunday");break;
			case 1: System.out.print("Monday");break;
			case 2: System.out.print("Tuesday");break;
			case 3: System.out.print("Wednesday");break;
			case 4: System.out.print("Thursday");break;
			case 5: System.out.print("Friday");break;
			case 6: System.out.print("Saturday");break;
		}
	}
	
}