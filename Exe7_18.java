import java.util.Scanner;

class Exe7_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] list = new double[10];
		for (int x = 0; x < list.length; x++) {
			list[x] = input.nextInt();
		}
		newList(list);
	}
	
	public static void newList (double[] list) {
		for (int i = list.length - 1; i >= 0; i--) {
			double currentMin = list[i];
			int currentMinIndex = i;
		
			for (int j = i - 1; j >= 0; j--) {
				if (currentMin < list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
		
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}	
	}
}