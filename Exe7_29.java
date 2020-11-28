class Exe7_29 {
	public static void main(String[] args) {
		int[] deck = new int[52];
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		for (int i = 0; i < deck.length; i++) {
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		int sum = 0;
		
		for (int i = 0; i < 4; i++) {
			int number = numbers[deck[i] % 13];
			sum += number;
		}
		
		if (sum == 24) {
			System.out.print("The number of picks that yield the sum of 24 is 1");
		}
		else {
			System.out.print("The number of picks that yield the sum of 24 is 0");
		}	
	}
}
