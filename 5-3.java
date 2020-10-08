public class C {
	public static void main(String[] args) {
		int x = -1;
		
		System.out.println("kg                   lb");
		
		while (x < 199)	{
			x += 2;
			if (x < 9) {
				double y = x * 2.2;
				System.out.printf("%d%22.1f \n", x ,y);
			}
			else if (11 <= x && x <101) {
				double y = x * 2.2;
				System.out.printf("%d%21.1f \n", x ,y);
			}
			else if (101 <= x && x <=199) {
				double y = x * 2.2;
				System.out.printf("%d%20.1f \n", x ,y);
			}
		}
	}	
}
	
	
	
	
	
	
	
