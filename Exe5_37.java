import java.util.Scanner;

class Exe5_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer in decimal system: ");
		int x1 = input.nextInt();
		
		String x2 = "";
		
		while (x1 != 0) {
			x2 = x1 % 2 + x2;
			x1 = x1 / 2;
		}
		System.out.print(x2);
	}
}
		
