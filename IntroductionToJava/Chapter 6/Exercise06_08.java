public class Exercise06_08 {

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = 0.0;
        celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String args[]) {
        int f = 120; //f -->fahrenheit
       
        System.out.println("Celsius             " + "Fahrenheit             " + "Fahrenheit             " + "Celsius");
        
        for (int c = 40; c > 30; c--) {//c -->celsius
            System.out.printf("%d.0\t\t\t%.1f\t\t\t%d.0\t\t\t%.1f\n", c, celsiusToFahrenheit(c), f,
                    fahrenheitToCelsius(f));
            f -= 10;
        }
    }

}
