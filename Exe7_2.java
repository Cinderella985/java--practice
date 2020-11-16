import java.util.Scanner;

class Exe7_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}
		
		for (int i = 9; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
	}
}