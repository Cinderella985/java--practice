public class Caculate {
	public static void main(String[] args) {	
	int i = 1; 
	double sum = 0;
	double up = 0;
	double number = 1;
	
	for (int x =1; x <= 10; x++ ) {
		for (i = 1; i <= x * 10000  ; i++) {
			up = Math.pow(-1, i + 1);
			double down1 = 2 * i - 1;
			number = (up / down1) * 4;
			sum += number;
		}
			System.out.println(sum);
			sum=0;
		}		
	}
}