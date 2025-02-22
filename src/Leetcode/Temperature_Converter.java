package Leetcode;

import java.util.Arrays;

public class Temperature_Converter {
    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];    // Create an array to store the converted values
        arr[0] = celsius + 273.15;       // Convert Celsius to Kelvin
        arr[1] = celsius * 1.80 + 32.00; // Convert Celsius to Fahrenheit

        return arr; // Return the array with both conversions
    }

    // Main method for testing
    public static void main(String[] args) {
        Temperature_Converter obj = new Temperature_Converter();

        double celsius = 25.0; // Example input: 25°C
        double[] result = obj.convertTemperature(celsius);

        System.out.println("Celsius: " + celsius);
        System.out.println("Kelvin: " + result[0]);
        System.out.println("Fahrenheit: " + result[1]);

        // Optional: Print as an array format
        System.out.println("Converted Temperatures: " + Arrays.toString(result));
    }
}

