package taller5;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio5 {

    public static void main(String[] args) throws IOException {

        // Pedir nombre
        String nombre = JOptionPane.showInputDialog(
            "Ingrese el nombre del estudiante:"
        );

        // Pedir edad
        String entradaEdad = JOptionPane.showInputDialog(
            "Ingrese la edad del estudiante:"
        );

        int edad = Integer.parseInt(entradaEdad);

        // Crear BufferedReader
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // Pedir las tres notas
        System.out.println("Ingrese la primera nota:");
        double nota1 = Double.parseDouble(br.readLine());

        System.out.println("Ingrese la segunda nota:");
        double nota2 = Double.parseDouble(br.readLine());

        System.out.println("Ingrese la tercera nota:");
        double nota3 = Double.parseDouble(br.readLine());

        // Crear objeto Estudiante
        Estudiante estudiante = new Estudiante(
            nombre, edad, nota1, nota2, nota3
        );

        // Obtener promedio
        double promedio = estudiante.getPromedio();

        // Mostrar resultado
        JOptionPane.showMessageDialog(
            null,
            String.format(
                "Nombre: %s\nEdad: %d\nPromedio: %.2f",
                nombre,
                edad,
                promedio
            )
        );
    }
}