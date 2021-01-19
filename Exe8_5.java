import java.util.*;

class Exe8_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix1: ");
		double[][] matrix1 = new double[3][3];
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		double[][] matrix2  = new double[3][3];
		
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("The matrices are added as follows ");
		double[][] x = addMatrix(matrix1, matrix2);
		for (int i = 0; i < matrix1[0].length; i++) {
			System.out.print(matrix1[0][i] + " ");
		}
		System.out.print("\t\t");
		for (int i = 0; i < matrix2[0].length; i++) {
			System.out.print(matrix2[0][i] + " ");
		}
		System.out.print("\t\t");
		for (int i = 0; i < x[0].length; i++) {
			System.out.print(x[0][i] + " ");
		}
		System.out.print("\n");
		
		for (int i = 0; i < matrix1[0].length; i++) {
			System.out.print(matrix1[1][i] + " ");
		}
		System.out.print("     +      ");
		for (int i = 0; i < matrix2[0].length; i++) {
			System.out.print(matrix2[1][i] + " ");
		}
		System.out.print("     =      ");
		for (int i = 0; i < x[0].length; i++) {
			System.out.print(x[1][i] + " ");
		}
		System.out.print("\n");
		
		for (int i = 0; i < matrix1[0].length; i++) {
			System.out.print(matrix1[2][i] + " ");
		}
		System.out.print("\t\t");
		for (int i = 0; i < matrix2[0].length; i++) {
			System.out.print(matrix2[2][i] + " ");
		}
		System.out.print("\t\t");
		for (int i = 0; i < x[0].length; i++) {
			System.out.print(x[2][i] + " ");
		}
		System.out.print("\n");
	}
		
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] result = new double[3][3];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return result;
	}	
}
