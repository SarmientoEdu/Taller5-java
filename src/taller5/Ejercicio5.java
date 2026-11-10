package taller5;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Locale;

/**
 * Ejercicio 5 - Clase Estudiante + JOptionPane + BufferedReader
 *
 * El main usa la clase Estudiante (Ejercicio5 combina ambas formas de E/S):
 *  - nombre y edad con JOptionPane
 *  - notas con BufferedReader
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante:");
        if (nombre == null) {
            return;
        }
        String textoEdad = JOptionPane.showInputDialog(null, "Ingrese la edad del estudiante:");
        if (textoEdad == null) {
            return;
        }

        int edad = Integer.parseInt(textoEdad);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.err.print("Nota 1: ");
        double nota1 = Double.parseDouble(br.readLine());
        System.err.print("Nota 2: ");
        double nota2 = Double.parseDouble(br.readLine());
        System.err.print("Nota 3: ");
        double nota3 = Double.parseDouble(br.readLine());

        Estudiante estudiante = new Estudiante(nombre, edad, nota1, nota2, nota3);

        String mensaje = String.format(Locale.US, "Nombre: %s%nEdad: %d%nPromedio: %.2f",
                estudiante.getNombre(), estudiante.getEdad(), estudiante.getPromedio());
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
