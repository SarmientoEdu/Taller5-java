package taller5;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 5 - Clase Estudiante + JOptionPane + BufferedReader
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        // nombre y edad por ventana
        String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));

        // las notas por consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nota 1: ");
        double nota1 = Double.parseDouble(br.readLine());
        System.out.print("Nota 2: ");
        double nota2 = Double.parseDouble(br.readLine());
        System.out.print("Nota 3: ");
        double nota3 = Double.parseDouble(br.readLine());

        Estudiante est = new Estudiante(nombre, edad, nota1, nota2, nota3);

        String resumen = "Nombre: " + est.getNombre() + "\n"
                + "Edad: " + est.getEdad() + "\n"
                + String.format("Promedio: %.2f", est.getPromedio());

        JOptionPane.showMessageDialog(null, resumen);
    }
}