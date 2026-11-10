package taller5;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {

        String entradaBase = JOptionPane.showInputDialog(
            "Ingrese la base del rectángulo:"
        );

        double base = Double.parseDouble(entradaBase);

        String entradaAltura = JOptionPane.showInputDialog(
            "Ingrese la altura del rectángulo:"
        );

        double altura = Double.parseDouble(entradaAltura);

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        JOptionPane.showMessageDialog(
            null,
            String.format(
                "Área: %.2f\nPerímetro: %.2f",
                area,
                perimetro
            )
        );
    }
}