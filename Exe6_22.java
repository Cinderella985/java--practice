import java.util.Scanner;

class Exe6_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");
		long n = input.nextLong();
		
		System.out.print(sqrt(n));	
	}
	
	public static double sqrt(long n) {
		double lastGuess = 1.0;
		double nextGuess = (lastGuess + n / lastGuess) / 2;
		
		while (nextGuess - lastGuess >= 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		
		return nextGuess;
	}
}