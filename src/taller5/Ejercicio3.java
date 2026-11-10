
package taller5;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Ejercicio3 {

    // Calcula el area del rectangulo
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Calcula el perimetro del rectangulo
    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {

        // Solicitar la base
        String entradaBase = JOptionPane.showInputDialog(
            "Ingrese la base del rectangulo:"
        );

        // Solicitar la altura
        String entradaAltura = JOptionPane.showInputDialog(
            "Ingrese la altura del rectangulo:"
        );

        // Convertir los datos a numeros
        double base = Double.parseDouble(entradaBase);
        double altura = Double.parseDouble(entradaAltura);

        // Realizar los calculos
        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        // Preparar el resultado con dos decimales
        String resultado = String.format(
            Locale.US,
            "Área: %.2f\nPerímetro: %.2f",
            area,
            perimetro
        );

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
