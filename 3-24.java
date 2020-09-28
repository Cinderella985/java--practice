import java.util.Scanner;

public class Card {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 1 + (int)(Math.random() * 13);
		int number2 = (int)(Math.random() * 4);
	
		if (number1 == 1 )
			System.out.print("The card you picked is Ace  ");
		else if (number1 == 11 )
			System.out.print("The card you picked is Jack ");
		else if (number1 == 12 )
			System.out.print("The card you picked is Queen");
		else if (number1 == 12 )
			System.out.print("The card you picked is King");
		else
			System.out.print("The card you picked is " + number1);
						
		if (number2 == 0)
			System.out.print("of Clubs");
		else if (number2 == 1 )
			System.out.print("of Diamonds ");
		else if (number2 == 2 )
			System.out.print("of Hearts");
		else
			System.out.print("of Spades");
	}
}