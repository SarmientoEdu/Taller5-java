package taller5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nota 1: ");
        double n1 = Double.parseDouble(br.readLine());
        System.out.print("Nota 2: ");
        double n2 = Double.parseDouble(br.readLine());
        System.out.print("Nota 3: ");
        double n3 = Double.parseDouble(br.readLine());

        Estudiante e = new Estudiante(nombre, edad, n1, n2, n3);

        JOptionPane.showMessageDialog(null,
                "Nombre: " + e.getNombre() + "\n"
                + "Edad: " + e.getEdad() + "\n"
                + String.format("Promedio: %.2f", e.getPromedio()));
    }
}