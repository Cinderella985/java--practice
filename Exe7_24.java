class Exe7_24 {
	public static void main(String[] args) {
		final int CARDS = 52;
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King"};
		boolean[] found = new boolean[4];
		
		int number = 0;
		int count = 0;
		while(count < 4) {
			number++;
			int index = (int)(Math.random() * CARDS);
			if(!found[index / 13]) {
				found[index / 13] = true;
				count++;
			}
			
			String suit = suits[index / 13];
			String rank = ranks[index % 13];
			System.out.println(rank + " of " + suit);
		}
		
		System.out.println("Number of picks: " + number);
	}
}
