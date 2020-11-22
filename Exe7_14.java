import java.util.*;

class Exe7_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		int[] numbers = new int[5];
		for (int x = 0; x < 5; x++) {
			numbers[x] = input.nextInt();
		}
		System.out.print("The biggest division of the five numbers is" + gcd(numbers));
	}
	
	public static int gcd(int...numbers) {
		int x1 = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < x1) {
				x1 = numbers[i];
			}
		}
		int sum = 1;
		int x = 1;
		while (x < x1) {
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] % x == 0) {
					sum = x;
				}
			}
			
			x++;
		}
		return sum;
		
	}
}
