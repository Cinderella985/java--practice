public class Caculate2 {
	public static void main(String[] args) {	
		int i = 1; 
		double e = 1;
		double number = 1;

		for (int x =1; x <= 10; x++ ) {
			for (i = 1; i <= 10000 * x; i++) {
				number = number / i;
				e += number;
			}
				System.out.println(e);
		}
	}
}
/* e = 0.0;
 * for (int i = 20; i > 0; i--) {
 * 		e = (e + 1.0) / i;
 * }
 * e++;
 * System.out.println(e);
 * 
 * 
 * 
 * */
 