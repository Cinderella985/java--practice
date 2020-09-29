import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature and speed: ");
		double temperature = input.nextDouble();
		double speed = input.nextDouble();
		
		if (-58 <= temperature && temperature <= 41 && speed > 2){
			double t = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed,0.16) + 0.4275 * temperature * Math.pow(speed,0.16); 
			System.out.print(t);}
			else
			System.out.print("Invaid input");
	}
}
