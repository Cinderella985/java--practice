import java.util.Scanner;

public class Minutes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes:" );
		long minutes = input.nextInt();
		long years = days / 365;
		long days = minutes % 365;
		System.out.println( minutes + "minutes is approximately" + years + "and" + days );
	}

}
