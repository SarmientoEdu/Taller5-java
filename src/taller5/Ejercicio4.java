package taller5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio4 {

    public static double convertirFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = Double.parseDouble(entrada.readLine());

        double fahrenheit = convertirFahrenheit(celsius);

        System.out.printf("Temperatura en Fahrenheit: %.2f%n", fahrenheit);
    }
}
