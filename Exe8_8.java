import java.util.Scanner;

class Exe8_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of points: ");
		int num = input.nextInt();
		
		double[][] points = new double[num][2];
		System.out.print("Enter " + num + " points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[0].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		int p1 = 0, p2 = 1;
		double shortDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
		
		int k = 0;
		int[][] indices = new int[points.length][2];
		
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance =  distance(points[i][0], points[i][1], points[j][0], points[j][1]);
					
				if (shortDistance > distance ) {
					k = 0;
					indices[k][0] = i;
					indices[k][1] = j;
					shortDistance = distance;
				}
				
				else if (distance == shortDistance) {
					indices[k][0] = i;
					indices[k][1] = j;
					k++;
					
				}
			}
		}
		
		for(int i = 0; i < k; i++) {
			p1 = indices[i][0];
			p2 = indices[i][1];
			System.out.println(p1);
			System.out.println("The closest two points are ( " + points[p1][0] + " , " + points[p1][1] + " ) and  ( " + points[p2][0] + " , " + points[p2][1] + " ) ");
		}
		
		System.out.println("Their distance is " + shortDistance);
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}