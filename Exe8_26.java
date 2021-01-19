import java.util.*;

class Exe8_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		
		double[][] list = new double[3][3];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				list[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("\nThe row-sorted array is");
		double[][] list1 = sortRows(list);
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[0].length; j++) {
				System.out.print(list1[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static double[][] sortRows(double[][] m) {
		double[]result1 = new double[3];
		for (int i = 0; i < m[0].length; i++) {
			result1[i] = m[0][i];
		}
		Arrays.sort(result1);
		
		double[]result2 = new double[3];
		for (int i = 0; i < m[0].length; i++) {
			result2[i] = m[1][i];
		}
		Arrays.sort(result2);
		
		double[]result3 = new double[3];
		for (int i = 0; i < m[0].length; i++) {
			result3[i] = m[2][i];
		}
		Arrays.sort(result3);
		
		double[][] result = new double[3][3];
		for (int i = 0; i < result[0].length; i++) {
			result[0][i] = result1[i];
		}
		
		for (int i = 0; i < result[1].length; i++) {
			result[1][i] = result2[i];
		}
		
		for (int i = 0; i < result[2].length; i++) {
			result[2][i] = result3[i];
		}
		
		return result;
	}

}
