import java.util.Scanner;

public class Gmt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT:");
		long timeZoneOffset = input.nextLong();
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		long currentSecond = totalSeconds % 60;
		long currentMinutes = totalMinutes % 60;
		long currentHours = ( timeZoneOffset + totalHours ) % 24;
		System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSecond);
	}
}
