import java.util.Scanner;

class Exe7_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] x = new int[10];
		
		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
		}
		
		reverse(x);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}	
	}
	
	public static int[] reverse(int[] x) {
		int x1 = x[0];
		for (int i = 0, j = x.length - 1; i < x.length / 2; i++, j--) {
			int temp = x[i];
			x[i] = x[j];
			x[j] = temp;	
		}
		
		return x;
	}

}
