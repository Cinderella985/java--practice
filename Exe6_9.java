class Exe6_9 {
	public static void main(String[] args) {
		System.out.println("Foot    Meter    Foot    Meter");
		System.out.println("________________________________");
		
		double meter = 0.0;
		double foot = 0.0;
		
		for(foot = 1.0,meter = 20.0; foot <= 10.0 && meter <= 65.0; meter += 5,foot++) {
			if (foot > 9.0)
				System.out.printf("%.1f%9.3f%8.1f%10.3f \n",foot,footToMeter(foot),meter,meterToMeter(meter));
			else
				System.out.printf("%1.1f%10.3f%8.1f%10.3f \n",foot,footToMeter(foot),meter,meterToMeter(meter));
		}
	}	
		
		public static double footToMeter(double foot) {
			return foot * 0.305;
		}
		
		public static double meterToMeter(double meter) {
			return meter * 3.279;
		}
}
