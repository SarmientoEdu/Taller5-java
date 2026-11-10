package taller5;

import javax.swing.JOptionPane;

/**
 * Ejercicio 3 - Area y perimetro de un rectangulo (JOptionPane)
 */
public class Ejercicio3 {

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Base del rectángulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura del rectángulo:"));

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        JOptionPane.showMessageDialog(null,
                String.format("Área: %.2f\nPerímetro: %.2f", area, perimetro));
    }
}