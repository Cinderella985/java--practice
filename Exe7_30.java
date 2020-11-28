import java.util.Scanner;

class Exe7_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		 
		System.out.print("Enter the number of values: ");
		int length = input.nextInt();
		int[] values = new int[length];
		
		System.out.print("Enter the values: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}
		
		if (isConsecutiveFour(values)) {
			System.out.print("The list has consecutive fours");	
		}
		else {
			System.out.print("The list has no consecutive fours");	
		}
	}
		
	public static boolean isConsecutiveFour(int[] values) {
		int sum = 0;
			
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1]) {
				sum++;
			}
		}
			
		if (sum == 3) {
			return true;
		}
		else {
			return false;
		}
	}	
}