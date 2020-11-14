class Exe6_32 {
	public static void main(String[] args) {
		int first = 0;
		int second = 0;
		int sum = first + second;
		int count1 = 0;
		int count2 = 0;
		
		while (count1 <= 10000) {
			if (result(sum)) {
				count2++;
			}
			
			count1++;
		}
		
		System.out.print(count2);
	}	
	
	public static boolean result(int sum) {
		int first = (int)((Math.random() * 6) + 1);
		int second = (int)((Math.random() * 6) + 1);
		int sum2 = first + second;
		
		if (sum2 == 2 || sum2 == 3 || sum2 == 12) {
			return false;
		}
		else if (sum2 == 7 || sum2 == 11) {
			return true;
		}
		else if (sum2 == 4 || sum2 == 5 || sum2 == 6 || sum2 == 8 || sum2 == 9 || sum2 == 10) {
			int sum1 = 0;
			int first1;
			int second1;
			first1 = (int)((Math.random() * 6) + 1);
			second1 = (int)((Math.random() * 6) + 1);
			sum1 = first1 + second1;
				
			if (sum1 == 7) {
				return false;
			}
			else if (sum1 == sum2)
				return true;
		}
		
		return result(sum);
	}
}





