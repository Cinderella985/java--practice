import java.util.*;

class Exe8_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		System.out.print("Enter the array: ");
		double[][] list = new double[rows][columns];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				list[i][j] = input.nextDouble();
			}	
		}
		int[] maxi = locateLargest(list);
		int first = maxi[0];
		int second = maxi[1];
		
		System.out.print("The location of the largest element is at (" + first + ", " + second + ") ");
	}
	
	public static int[] locateLargest(double[][] a) {
		int rowIndex = 0;
		int colIndex = 0;
		double max = a[rowIndex][colIndex];
		
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					rowIndex = i;
					colIndex = j;
				}
			}
		}
		
		int[] result = new int[2];
		result[0] = rowIndex;
		result[1] = colIndex;
		
		return result;
		
	}

}
