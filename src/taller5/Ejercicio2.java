package taller5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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
        // TODO: retornar (n1 + n2 + n3) / 3.0
        return (n1 + n2 + n3) / 3.0;
    }

    public static String obtenerEstado(double promedio) {
        // TODO: retornar "APROBADO" si promedio >= 70, si no "REPROBADO"
        return promedio >= 70 ? "APROBADO" : "REPROBADO";
    }

    public static void main(String[] args) throws IOException {
        // TODO:
        // 1. Crear BufferedReader sobre System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2. Leer las tres notas con br.readLine()
        try {
            System.out.print("Ingrese la primera nota: ");
            double n1 = Double.parseDouble(br.readLine());
            System.out.print("Ingrese la segunda nota: ");
            double n2 = Double.parseDouble(br.readLine());
            System.out.print("Ingrese la tercera nota: ");
            double n3 = Double.parseDouble(br.readLine());

            // 3. Calcular promedio y estado
            double promedio = calcularPromedio(n1, n2, n3);
            String estado = obtenerEstado(promedio);

            // 4. Mostrar con System.out.printf EXACTO:
            //      Promedio: X.XX
            //      Estado: APROBADO   (o REPROBADO)
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.printf("Estado: %s%n", estado);

        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
        }
    }
}
