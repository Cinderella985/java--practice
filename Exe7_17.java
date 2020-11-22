import java.util.Scanner;

class Exe7_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();
		int[] number = new int[n];
		String[] name = new String[n];
		Double[] grades = new Double[n];
		
		System.out.print("Enter the grades of students: ");
		for (int x = 0; x < grades.length; x++) {
			grades[x] = input.nextDouble();
		}
		
		System.out.print("Enter the name of students: ");
		for (int x = 0; x < grades.length; x++) {
			name[x] = input.next();
		}
		
		for (int i = 0; i < grades.length; i++) {
			double currentMax = grades[i];
			int currentMaxIndex = i;
		
			for (int j = i + 1; j < grades.length; j++) {
				if (currentMax > grades[j]) {
					currentMax = grades[j];
					currentMaxIndex = j;
				}
			}
		
			if (currentMaxIndex != i) {
				String temp = name[currentMaxIndex];
				name[currentMaxIndex] = name[i];
				name[i] = temp;
				grades[currentMaxIndex] = grades[i];
				grades[i] = currentMax;
			}
		}
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print(name[i] + " ");
		}
	}
}