import java.util.Scanner;

public class Pentagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the bounding circle: ");
		double r = input.nextDouble();
		double a = Math.toRadians(18);
		double b = Math.toRadians(162);
		double c = Math.toRadians(234);
		double d = Math.toRadians(-54);
		
		double x1 = r * Math.cos(a);
		double y1 = r * Math.sin(a);
		
		double x2 = 0;
		double y2 = r;
		
		double x3 = r * Math.cos(b);
		double y3 = r * Math.sin(b);
		
		double x4 = r * Math.cos(c);
		double y4 = r * Math.sin(c);
		
		double x5 = r * Math.cos(d);
		double y5 = r * Math.sin(d);
		
		System.out.println("The coordinates of five points on the pentagon are");
		System.out.printf("(%5.2f,%5.2f)\n",x1,y1);
		System.out.printf("(%5.2f,%5.2f)\n",x2,y2);
		System.out.printf("(%5.2f,%5.2f)\n",x3,y3);
		System.out.printf("(%5.2f,%5.2f)\n",x4,y4);
		System.out.printf("(%5.2f,%5.2f)\n",x5,y5);	
	}
}