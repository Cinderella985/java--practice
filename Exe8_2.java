import java.util.*;

class Exe8_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 4-by-4 matrix row by row: ");
		
		double[][] list = new double[4][4];
		
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[0].length; j++) {
				list[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Sum of the elements in the major diagonal is " + summajorDiagonal(list));
	}
	
	public static double summajorDiagonal(double[][] m) {
		double total = 0;
		for (int i = 0; i < m[0].length; i++) {
			total += m[i][i];
		}
		
		return total;
	}

}
