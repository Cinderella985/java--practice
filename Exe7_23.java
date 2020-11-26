class Exe7_23 {
	public static void main(String[] args) {
		boolean[] list = new boolean[100];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = false;
		}
		
		System.out.print("These cabinets are open ");
		
		for (int m = 1; m <= 100; m++) {
			for (int i = m; i <= 100; i += m) {
				list[i - 1] =! list[i - 1];
			}	
		}
		
		for (int i = 0; i < 100; i++) {
			if(list[i]) {
				System.out.println(i + 1 + "  ");
			}
		}	
	}
}
