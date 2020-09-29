import java.util.Scanner;
 
public class Time {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT:");
		long timeZoneOffset = input.nextLong();
		
		long totalMilliseconds = System . currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		long currentSecond = totalSeconds % 60;
		long currentMinutes = totalMinutes % 60;
		long currentHours = (timeZoneOffset + totalHours) % 24;
		
		if (currentHours > 12) {
			long currentHours1 = currentHours - 12;
			System.out.println("The current time is" + currentHours1 + ":" + currentMinutes + ":" + currentSecond + "PM");
		}
		else
			System.out.println("The current time is" + currentHours + ":" + currentMinutes + ":" + currentSecond + "AM");
	}
}
