package taller5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {

    public static double convertirFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Temperatura en Celsius: ");
        double celsius = Double.parseDouble(br.readLine());

        System.out.printf("Fahrenheit: %.2f%n", convertirFahrenheit(celsius));
    }
}