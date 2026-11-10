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
        double base = Double.parseDouble(JOptionPane.showInputDialog("Base:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));

        String salida = String.format("Área: %.2f%nPerímetro: %.2f",
                calcularArea(base, altura), calcularPerimetro(base, altura));
        JOptionPane.showMessageDialog(null, salida);
    }
}