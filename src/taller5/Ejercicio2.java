package taller5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        System.out.print("Nota 1: ");
        double n1 = Double.parseDouble(br.readLine());
        System.out.print("Nota 2: ");
        double n2 = Double.parseDouble(br.readLine());
        System.out.print("Nota 3: ");
        double n3 = Double.parseDouble(br.readLine());

        double promedio = calcularPromedio(n1, n2, n3);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Estado: " + obtenerEstado(promedio));
    }
}