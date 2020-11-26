import java.util.Scanner;

class Exe7_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		 
		System.out.print("Enter three coeficients: ");
		double[] eqn = new double[3];
		
		for (int i = 0; i < eqn.length; i++) {
			eqn[i] = input.nextDouble();
		}
		
		double[] roots = new double[2];
		
		System.out.print("The number of roots are " + solveQuadratic(eqn, roots));
	}
	
	public static int solveQuadratic(double[] eqn, double[] roots) {
		double a = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
		
		if (a == 0) {
			return 1;
		}
		else if (a < 0) {
			return 0;
		}
		else {
			return 2;
		}
	}

}
