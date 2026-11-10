package taller5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio4 {

    public static double convertirFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Ingrese la temperatura en Celsius:");

        double celsius = Double.parseDouble(br.readLine());

        double fahrenheit = convertirFahrenheit(celsius);

        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
    }
}