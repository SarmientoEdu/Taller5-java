
package taller5;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio5 {

    public static void main(String[] args) throws IOException {

        String nombre = JOptionPane.showInputDialog(
            "Ingrese el nombre:"
        );

        int edad = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese la edad:")
        );

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        double nota1 = Double.parseDouble(br.readLine());
        double nota2 = Double.parseDouble(br.readLine());
        double nota3 = Double.parseDouble(br.readLine());

        Estudiante estudiante = new Estudiante(
            nombre, edad, nota1, nota2, nota3
        );

        String resultado = String.format(
            java.util.Locale.US,
            "Nombre: %s\nEdad: %d\nPromedio: %.2f",
            estudiante.getNombre(),
            estudiante.getEdad(),
            estudiante.getPromedio()
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}
