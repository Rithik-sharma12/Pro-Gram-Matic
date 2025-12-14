Class TempConversion{
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }    
}

public class Maths {

    public static void main(String[] args) {
        System.out.println("Maths class");
        double celsius = 25.0;
        double fahrenheit = TempConversion.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        double fahrenheit2 = 77.0;
        double celsius2 = TempConversion.fahrenheitToCelsius(fahrenheit2);
        System.out.println(fahrenheit2 + " Fahrenheit is " + celsius2 + " Celsius");

    }    
}

/*

temp conversion

celsius to frahen
frahen to celsius
*/