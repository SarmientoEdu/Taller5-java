package taller5;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 5 - Clase Estudiante + JOptionPane + BufferedReader
 *
 * El main usa la clase Estudiante (Ejercicio5 combina ambas formas de E/S):
 *  - nombre y edad con JOptionPane
 *  - notas con BufferedReader
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        try {
        // TODO:
        // 1. Pedir nombre con JOptionPane.showInputDialog
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        if (nombre == null) return; //si el usuario cancela

        // 2. Pedir edad con JOptionPane.showInputDialog + Integer.parseInt
        String inputEdad = JOptionPane.showInputDialog("Ingrese la edad del estudiante:");
        if (inputEdad == null) return; //si el usuario cancela
        int edad = Integer.parseInt(inputEdad);

        // 3. Leer tres notas con BufferedReader + Double.parseDouble
        
        System.out.print("Ingrese la primera nota: ");
        double nota1 = Double.parseDouble(lector.readLine());

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = Double.parseDouble(lector.readLine());

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = Double.parseDouble(lector.readLine());

        // 4. Crear objeto Estudiante con el constructor
        Estudiante estudiante = new Estudiante(nombre, edad, nota1, nota2, nota3);

        // 5. Mostrar con JOptionPane.showMessageDialog EXACTO: 
        //      Nombre: [nombre]
        //      Edad: [edad]
        //      Promedio: X.XX
        System.out.println("\n--- Resumen del Estudiante ---");
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.printf("Promedio: %.2f\n", estudiante.getPromedio());

    } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
            }
    }

}
