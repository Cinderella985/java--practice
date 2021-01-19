import java.util.*;

class Exe8_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five points: ");
		
		double[][] list = new double[5][2];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				list[i][j] = input.nextDouble();
			}
		}
		
		if (sameLine(list)) {
			System.out.print("The five points are on the same line");
		}
		else {
			System.out.print("The five points are not on the same line");
		}
	}
	
	public static boolean sameLine(double[][] points) {
		double k = (points[1][1] - points[0][0]) / (points[1][0] - points[0][0]);
		double b = points[0][1] - k * points[0][0];
		
		for (int i = 2; i < points.length; i++) {
			if (k * points[i][0] + b != points[i][1]) {
				return false;
			}
		}
		
		return true;
	}

}
