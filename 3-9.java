import java.util.Scanner;

public class Ds {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer : ");
		int x = input.nextInt();
		int d1 = x / 100000000;
		int d2 = x / 10000000 % 10;
		int d3 = x / 1000000 % 10;
		int d4 = x / 100000 % 10;
		int d5 = x / 10000 % 10;
		int d6 = x / 1000 % 10;
		int d7 = x / 100 % 10;
		int d8 = x / 10 % 10;
		int d9 = x % 10;
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)
 % 11;	
		
		if (d10 == 10)
			System.out.print("The ISBN-10 number is" + d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d7+" "+d8+" "+d9+"X");
		else{
			System.out.print("The ISBN-10 number is" + d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d7+" "+d8+" "+d9+" "+d10);
		}
	}
}
