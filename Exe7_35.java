import java.util.*;

class Exe7_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] words = {"write", "that", "public", "private", "program"};
		char s;
		
		do {
			play(words);
			System.out.println("Do you want to guess another word? Enter y or n: ");
		}while ((s = input.next().charAt(0)) == 'y');
	}
	
	public static void play(String[] words) {
		Scanner input = new Scanner(System.in);
		int miss = 0;
		char s;
		Random x = new Random();
		int i = x.nextInt(words.length);//返回一个随机的单词
		char[] ch = new char[words[i].length()];
		
		for (int j = 0; j < words[i].length(); j++) {
			ch[j] = '*';
		}
		
		do {
			System.out.print("(Guess)Enter a letter in word ");
			System.out.print(ch);
			System.out.println(">");
			s = input.next().charAt(0);
			if (words[i].indexOf(s) == -1) {
				System.out.println(s + " is not in the words");
				miss++;
			}
			
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == s) {
					System.out.println(s + " is already in the word ");
				}
				break;
			}
		}while (guessWord(words[i], ch, s));
		
		System.out.println("The word is " + words[i] + " You miss " + miss + " time");
		
	}
	
	public static boolean guessWord(String str, char[] ch, char s) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == s) {
				ch[i] = s;
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == '*') {
				return true;
			}
		} 
		
		return false;
	}
}
