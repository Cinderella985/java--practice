import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number1 = input.nextInt();
		
		double total = 0;
		double average = 0;
		int count1 = 0;
		int count2 = 0;
		
		if (number1 == 0) {
			System.out.println("No numbers are entered except 0 ");
			System.exit(0);
		}
		
		while (number1 != 0) {
			if (number1 > 0) 
				count1++;
			if (number1 < 0) 
				count2++;
			total += number1;
			average = total / (count1 + count2);
			number1 = input.nextInt();
		}
		
		System.out.println("The numbers of positives is " + count1);
		System.out.println("The numbers of negatives is " + count2);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}
