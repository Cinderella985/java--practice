import java.util.Scanner;

class Exe8_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] list = new double[6][2];
		System.out.print("Enter 6 points: ");
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				list[i][j] = input.nextDouble();
			}
		}
		
		double[] points = getRightmostLowestPoint(list);
		System.out.print("The rightmost lowest point is (" + points[0] + ", " + points[1] + ")");
	}
	
	public static double[] getRightmostLowestPoint(double[][] points) {
		double maxX = points[0][0];
		double maxY = points[0][1];
		
		for (int i = 1; i < points.length; i++) {
			if (points[i][1] < maxY) {
				maxY = points[i][1];
				maxX = points[i][0];
			}
			
			else if (points[i][1] == maxY && points[i][0] > maxX) {
				maxY = points[i][1];
				maxX = points[i][0];
			}
		}
		
		double[] result = new double[2];
		result[0] = maxX;
		result[1] = maxY;
		
		return result;
	}
}