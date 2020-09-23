import java.util.Scanner;

public class Minutes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes:" );
		long minutes = input.nextLong();
		long days = minutes / (24 * 60);
		long years = days / 365;
		long day = days % 365;
		System.out.println( minutes + " minutes is approximately " + years + " years and " + day + " days");
	}
}

