class Exe6_8 {
	public static void main(String[] args) {
		System.out.println("Celsius\t\tFahrenheit     Fahrenheit      Celsius");
		System.out.println("______________________________________________________");
	
	
		double celsius = 40;
		double farenheit = 120;
	
		for (int x = 1; x <= 10; celsius--, farenheit -= 10, x++) {
			if (farenheit < 100.0 && celsiusToFahrenheit(celsius) < 100.0)
				System.out.println(celsius + "              " + celsiusToFahrenheit(celsius) + "            " + farenheit + "\t\t" + fahrenheitToCelsius(farenheit));
			else
				System.out.println(celsius + "             " + celsiusToFahrenheit(celsius) + "           " + farenheit + "\t\t" + fahrenheitToCelsius(farenheit));
		}
	}
	
	public static double celsiusToFahrenheit(double celsius) {
		return (int)((((9.0 / 5) * celsius + 32)) * 100) / 100.0;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (int)(((5.0 / 9) * (fahrenheit - 32)) * 100) / 100.0;
	}
}