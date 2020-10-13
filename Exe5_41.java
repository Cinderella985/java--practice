import java.util.Scanner;

class Exe5_41 { 	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		int x1 = input.nextInt();
		
		int max = x1;
		int count = 0;
		
		while (x1 != 0) {
			x1 = input.nextInt();
			if (x1 > max) {
				max = x1;
				count = 0;
			}
			if (x1 == max) {
				count++;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}
