import java.util.Scanner;

class Exe7_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 floating-numbers: ");
		double[] array = new double[10];
		System.out.print("The average number is " + average(array));
	}
	
	public static double average(double[] array) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
			sum += array[i];
		}
		
		return sum / 10;
	}
	
	public static int average(int[] array) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			sum += array[i];
		}
		
		return sum / 10;
	}
}