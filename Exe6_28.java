class Exe6_28 {
	public static void main(String[] args) {
		System.out.println("p                       2^p-1");
		System.out.println("________________________________");
		int p = 1;
		
		while (p < 31) {
			p++;
			
			if(prime(p)) {
				if (p > 10) {
					System.out.println(p + "                       " + (int) (Math.pow(2, p) - 1));
				}
				else {
					System.out.println(p + "                        " + (int) (Math.pow(2, p) - 1));
				}	
			}
		}
	}
	
	public static boolean prime(int p) {
		int number = (int)(Math.pow(2, p) - 1);
		
		for (int x = 2; x <= number / 2; x++) {
			if (number % x == 0) {
				return false;
			}
		}
		
		return true;
	}
}
