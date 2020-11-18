import java.util.Scanner;

class Exe7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] array = new double[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		System.out.print("The minimum index of the smallest elsement is " + indexOfSmallestElement(array));
	}
	
	public static double indexOfSmallestElement(double[] array) {
		Scanner input = new Scanner(System.in);
		double min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		return min ;
	}
}