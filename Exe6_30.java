 class Exe6_30 {
	public static void main(String[] args) {
		int first = (int)((Math.random() * 6) + 1);
		int second = (int)((Math.random() * 6) + 1);
		int sum = first + second;
		System.out.println("You rolled " + first + " + " + second + " = " + sum);
		
		if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
			System.out.println("point is " + sum);
		}
		
		System.out.println(result(sum));
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
				String x1 = Integer.toString(first1);
				String x2 = Integer.toString(second1);
				
				if (sum1 == 7) {
					return "You rolled " + x1 + " + " + x2 +  " = " + sum1 + "\n"
							+ "You lose";
				}
				else if (sum1 == sum) {
					return "You rolled " + x1 + " + " + x2 +  " = " + sum1 + "\n"
							+ "You win";
				}
			}
			while (sum1 == 7 || sum1 == sum);
		}
		
		return result(sum);
	}
}
