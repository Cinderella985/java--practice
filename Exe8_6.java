import java.util.Scanner;

class Exe8_6 {
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
		
		if (matrix1[0].length != matrix2.length) {
			System.out.print("Invalid input");
			System.exit(1);
		}
		
		System.out.println("The multiplication of the matrices is ");
		double[][] x = multiplyMatrix(matrix1, matrix2);
		for (int i = 0; i < matrix1[0].length; i++) {
			System.out.printf("%.2f", matrix1[0][i]);
			System.out.print(" ");
		}
		System.out.print("\t\t");
		for (int i = 0; i < matrix2[0].length; i++) {
			System.out.printf("%.2f", matrix2[0][i]);
			System.out.print(" ");
		}
		System.out.print("\t\t");
		for (int i = 0; i < x[0].length; i++) {
			System.out.printf("%.2f", x[0][i]);
			System.out.print(" ");
		}
		System.out.print("\n");
		
		for (int i = 0; i < matrix1[0].length; i++) {
			System.out.printf("%.2f", matrix1[1][i]);
			System.out.print(" ");
		}
		System.out.print("     *   ");
		for (int i = 0; i < matrix2[0].length; i++) {
			System.out.printf("%.2f", matrix2[1][i]);
			System.out.print(" ");
		}
		System.out.print("     =   ");
		for (int i = 0; i < x[0].length; i++) {
			System.out.printf("%.2f", x[1][i]);
			System.out.print(" ");
		}
		System.out.print("\n");
		
		for (int i = 0; i < matrix1[0].length; i++) {
			System.out.printf("%.2f", matrix1[2][i]);
			System.out.print(" ");
		}
		System.out.print("\t\t");
		for (int i = 0; i < matrix2[0].length; i++) {
			System.out.printf("%.2f", matrix2[2][i]);
			System.out.print(" ");
		}
		System.out.print("\t\t");
		for (int i = 0; i < x[0].length; i++) {
			System.out.printf("%.2f", x[2][i]);
			System.out.print(" ");
		}
		System.out.print("\n");
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] result = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				double temp = 0;
				for (int x = 0; x < b.length; x++) {
					temp += a[i][x] * b[x][j];
				}
				
				result[i][j] = temp;
			}
		}
		
		return result;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	