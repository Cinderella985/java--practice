class Exe6_30 {
	public static void main(String[] args) {
		int first = (int)((Math.random() * 6) + 1);
		int second = (int)((Math.random() * 6) + 1);
		int sum = first + second;
		System.out.println("You rolled " + first + " + " + second + " = " + sum);
		System.out.print(result(sum));
	}
	
	public static String result(int sum) {
		if (sum == 2 || sum == 3 || sum == 12) {
			return "You lose";
		}
		else if (sum == 7 || sum == 11) {
			return "You win";
		}
		else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
			int sum1 = 0;
			
			do {
				int first1 = (int)((Math.random() * 6) + 1);
				int second1 = (int)((Math.random() * 6) + 1);
				sum1 = first1 + second1;
			}
			while (sum1 == 7 || sum1 == sum);
			
			if (sum1 == 7) {
				return "You lose";
			}
			else
				return "You win";
		}
		return null;
	}
}
