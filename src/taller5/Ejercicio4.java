package taller5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 4 - Conversión Celsius a Fahrenheit (BufferedReader)
 *
 * El autograde invoca por reflexión:
 *   convertirFahrenheit(double celsius)
 *
 * Fórmula: F = C * 9/5 + 32
 */
public class Ejercicio4 {

    public static double convertirFahrenheit(double celsius) {
        // TODO: retornar celsius * 9.0 / 5.0 + 32.0
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static void main(String[] args) throws IOException {
        // TODO:
        // 1. Crear BufferedReader sobre System.in
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
           try {

        // 2. Pedir la temperatura en Celsius
            System.out.print("Ingrese la temperatura en Celsius: ");
            double celsius = Double.parseDouble(lector.readLine());
            double fahrenheit = convertirFahrenheit(celsius);

        // 3. Mostrar con System.out.printf EXACTO:
        //      Fahrenheit: X.XX
            System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
        }
    }
}
