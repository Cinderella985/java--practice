import java.util.Scanner;

class Exe7_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		double[] grades = new double[count];
		double sum = 0;
		double grade;
		
		do {
			System.out.print("Enter the grades for students: ");
			grade = input.nextDouble();
			
			if (grade >= 0) {
				grades[count] = grade;
				sum += grade;
				count++;
			}
		}while(grade >= 0);
		
		System.out.print("count is " + count);
		double average = sum / count;
		
		int big = 0;
		int low = 0;
		
		for (int i = 0; i < count; i++) {
			if (grades[i] >= average) {
				big++;
			}
			else {
				low++;
			}	
		}
		
		System.out.println("Average is " + average);
		System.out.println("The number of bigger: " + big);
		System.out.println("The number of smaller: " + low);

	}
}
