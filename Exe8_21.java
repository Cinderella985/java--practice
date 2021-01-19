import java.util.*;

class Exe8_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of cities: ");
		int cities = input.nextInt();
		
		double[][] list = new double[cities][2];
		System.out.println("Enter the coordinates of the cities: ");
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				list[i][j] = input.nextDouble();
			}
		}
		
		double minTotal = totalDistance(list, 0);
		int minIndex = 0;
		
		for (int i = 0; i < list.length; i++) {
			double total = totalDistance(list, i);
			
			if (minTotal > total) {
				minTotal = total;
				minIndex = i;
			}
		}
		
		System.out.println("The central city is at (" + list[minIndex][0] + " , " + list[minIndex][1] + ")");
		System.out.println("The total distance to all other cities is " + minTotal);
	}
	
	public static double totalDistance(double[][] list, int i) {
		double total = 0;
		for (int j = 0; j < list.length; j++) {
			total += distance(list[i], list[j]);
		}
		return total;	
	}
	
	public static double distance(double[] c1, double[] c2) {
		return Math.sqrt((c1[0] - c2[0]) * (c1[0] - c2[0]) + (c1[1] - c2[1]) * (c1[1] - c2[1]));
	}

}
