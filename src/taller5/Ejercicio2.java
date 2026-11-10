package taller5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Locale;

/**
 * Ejercicio 2 - Promedio de tres notas (BufferedReader)
 *
 * El autograde invoca por reflexión:
 *   calcularPromedio(double n1, double n2, double n3)
 *   obtenerEstado(double promedio)
 *
 * El main debe usar BufferedReader para leer las notas.
 */
public class Ejercicio2 {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static String obtenerEstado(double promedio) {
        if (promedio >= 70) {
            return "APROBADO";
        }
        return "REPROBADO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.err.print("Nota 1: ");
        double n1 = Double.parseDouble(br.readLine());
        System.err.print("Nota 2: ");
        double n2 = Double.parseDouble(br.readLine());
        System.err.print("Nota 3: ");
        double n3 = Double.parseDouble(br.readLine());

        double promedio = calcularPromedio(n1, n2, n3);
        String estado = obtenerEstado(promedio);

        System.out.printf(Locale.US, "Promedio: %.2f%n", promedio);
        System.out.println("Estado: " + estado);
    }
}
