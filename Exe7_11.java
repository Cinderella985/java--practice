import java.util.Scanner;

class Exe7_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] x = new double[10];
		
		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextDouble();
		}
		
		System.out.printf("The mean is %.2f" , mean(x));
		System.out.println();
		System.out.printf("The standard deviation is %.5f" , deviation(x));
	}
	
	public static double mean(double[] x) {
		double sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		
		return sum / 10;
	}
	
	public static double deviation(double[] x) {
		double sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			sum += Math.pow(x[i] - mean(x), 2);
		}
		
		return Math.sqrt(sum / 9);	
	}
}

	