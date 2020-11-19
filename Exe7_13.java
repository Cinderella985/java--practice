public class Exe7_13 {
	public static void main(String[] args) {
		System.out.println(printNumber(1, 2, 3, 4));
	}
	
	public static int printNumber(int...numbers) {
		int result = (int)(Math.random() * 54 + 1);
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != result) {
				return result;
			}
		}
		
		return printNumber(numbers);
	}
}
