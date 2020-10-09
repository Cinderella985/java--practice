import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		 
		System.out.print("Enter the number of students: ");
		int number1 = input.nextInt();
			
		System.out.print("Enter the scores of students: ");
		int number2 ,max,number3 = 0;
		number2 = input.nextInt();
		max = number2;
			
		System.out.print("Enter the name of students: ");
		String name1 ,maxname;
		name1 = input.next();
		maxname = name1;
			
		while (number3 < number1 - 1) {
			System.out.print("Enter the scores of students: ");
			number2 = input.nextInt();
			
			System.out.print("Enter the name of students: ");
			name1 = input.next();
			
			number3++;
			
			if (number2 > max) {
				max = number2;
				maxname = name1; 
			}	
		}
		
		System.out.print(maxname + " gets the highest scores");
	}
}
		
