// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 1
// Filename: Converter.java (inside tempconvert package)

package mte3.tempconvert;
import java.util.Scanner;

public class Converter {
    
    private static class CelsiusToFahrenheit implements TempConvert {

        @Override
        public double convert(double temp) {    return temp * (9.0 / 5.0) + 32;    }
        
    } // CelciusToFahrenheit closed
    /*private static class FahrenheitToCelsius implements TempConvert {

        @Override
        public double convert(double temp ){    return (temp - 32) * (5.0/9.0); }
    }*/
    /*private static class FahrenheitToKelvin implements TempConvert {

        @Override
        public double convert(double temp){     return (temp - 32) * (5.0/9.0) + 273.15; }
    }*/
    private static TempConvert foo(){
        return FahrenheitToCelsius implements TempConvert{
                @Override
                public double convert(double temp ){    return (temp - 32) * (5.0/9.0); }
            };
    }
    public static void main(String[] args) {
        FunctionalInterface FahrenheitToCelsius = FunctionalInterface (temp) -> (temp - 32) * (5.0/9.0);
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter temperature (for conversion): ");
            double temp = scanner.nextDouble();
            // (part 1) conversion from C to F
            double fahrenheit = new CelsiusToFahrenheit().convert(temp);
            System.out.println( "C to F:" + fahrenheit );
            // (part 2) conversion from F to C
            
            double celsius = new FahrenheitToCelsius(temp);
            System.out.println( "F to C:" + fahrenheit );
            // (part 3) conversion from F to K
            double kelvin = (temp) -> (temp - 32) * (5.0/9.0); //new FahrenheitToKelvin().convert(temp);
            System.out.println( "F to K:" + () );

        }  // try { } block closed

    } // main () method closed

} // Converter { } class closed