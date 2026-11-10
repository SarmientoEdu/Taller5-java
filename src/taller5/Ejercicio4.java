package taller5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 4 - Conversion Celsius a Fahrenheit (BufferedReader)
 */
public class Ejercicio4 {

    public static double convertirFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Temperatura en Celsius: ");
        double c = Double.parseDouble(lector.readLine());

        double f = convertirFahrenheit(c);
        System.out.printf("Fahrenheit: %.2f%n", f);
    }
}