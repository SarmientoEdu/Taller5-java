
package taller5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio2 {

    // Calcula el promedio de las tres notas
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    // Determina si el estudiante aprueba
    public static String obtenerEstado(double promedio) {
        if (promedio >= 70) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // Lectura de las tres notas
        double nota1 = Double.parseDouble(br.readLine());
        double nota2 = Double.parseDouble(br.readLine());
        double nota3 = Double.parseDouble(br.readLine());

        // Cálculo del promedio y estado
        double promedio = calcularPromedio(nota1, nota2, nota3);
        String estado = obtenerEstado(promedio);

        // Mostrar resultados con dos decimales
        System.out.printf(
            java.util.Locale.US,
            "Promedio: %.2f%nEstado: %s%n",
            promedio,
            estado
        );
    }
}