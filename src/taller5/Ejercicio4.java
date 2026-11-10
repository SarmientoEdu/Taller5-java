
package taller5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio4 {

    // Convierte grados Celsius a Fahrenheit
    public static double convertirFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static void main(String[] args) throws IOException {

        // Crear lector para recibir datos por teclado
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // Leer la temperatura en Celsius
        double celsius = Double.parseDouble(br.readLine());

        // Realizar la conversion
        double fahrenheit = convertirFahrenheit(celsius);

        // Mostrar el resultado con dos decimales
        System.out.printf(
            java.util.Locale.US,
            "Fahrenheit: %.2f%n",
            fahrenheit
        );
    }
}
