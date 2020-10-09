import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter the number of students: ");
		int number1 = input.nextInt();
			
		System.out.print("Enter the scores of students: ");
		int number2,number3,max,number4 = 0;
		number2 = input.nextInt();
		max = number2;
		number3 = -1;
			
		System.out.print("Enter the name of students: ");
		String name1,maxname,name2,secondname;
		name1 = input.next();
		maxname = name1;
		secondname = name1;
			
		while (number4 < number1 - 2) {
			System.out.print("Enter the scores of students: ");
			number2 = input.nextInt();
			System.out.print("Enter the name of students: ");
			name1 = input.next();
			if (number2 > max) {
				max = number2;
				maxname = name1;
			}
			System.out.print("Enter the scores of students: ");
			number3 = input.nextInt();
			System.out.print("Enter the name of students: ");
			name2 = input.next();
			if (number3 < max && number3 > number2) {
				max = number3;
				secondname = name2;
			}
			number4++;
		}
		
		System.out.println(maxname + " gets the highest scores");
		System.out.println(secondname + " gets the second highest scores");
	}
}
				
