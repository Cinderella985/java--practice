import java.util.Scanner;

class Exe7_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter the number of students: ");
		int number = input.nextInt();
		int[] numbers = new int[number];
		
		System.out.print("Enter " + number + " scores: ");
		
		for (int i = 0; i < number; i++) {
			numbers[i] = input.nextInt();
		}
		
		int max = -1;
		for (int i = 0; i < number; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}	
		
		for (int i = 0; i < number; i++) {
			if (numbers[i] >= max - 10) {
				System.out.println("Student " + i + " score is " + numbers[i] + " and grade is A");
			}
			else if (numbers[i] >= max - 20) {
				System.out.println("Student " + i + " score is " + numbers[i] + " and grade is B");
			}
			else if (numbers[i] >= max - 30) {
				System.out.println("Student " + i + " score is " + numbers[i] + " and grade is C");
			}
			else if (numbers[i] >= max - 40) {
				System.out.println("Student " + i + " score is " + numbers[i] + " and grade is D");
			}
			else {
				System.out.println("Student " + i + " score is " + numbers[i] + " and grade is F");
			}
		}	
	}
}