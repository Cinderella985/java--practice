import java.util.Scanner;

class Exe6_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a millis: ");
		long millis = input.nextLong();
		
		System.out.print(convertMillis(millis));
	}
	
	public static String convertMillis(long millis) {
		long second = millis / 1000;
		long hour = second / 3600;
		long minutes = (second / 60) % 60;
		long second1 = second % 60;
		
		return hour + " : " + minutes + " : " + second1;
	}
}
		
		