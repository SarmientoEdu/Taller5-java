package taller5;

import javax.swing.JOptionPane;

/**
 * Ejercicio 3 - Área y perímetro de un rectángulo (JOptionPane)
 *
 * El autograde invoca por reflexión:
 *   calcularArea(double base, double altura)
 *   calcularPerimetro(double base, double altura)
 */
public class Ejercicio3 {

    public static double calcularArea(double base, double altura) {
        // TODO: retornar base * altura
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        // TODO: retornar 2 * (base + altura)
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        // TODO:
        try {
        // 1. Pedir base y altura con JOptionPane.showInputDialog
        String inputBase = JOptionPane.showInputDialog(null, "Ingrese la base del rectángulo:");
        if (inputBase == null) return; //si el usuario cancela
        double base = Double.parseDouble(inputBase);
        
        
        // 2. Mostrar con JOptionPane.showMessageDialog EXACTO:
        //      Área: X.XX
        //      Perímetro: Y.YY
        String inputAltura = JOptionPane.showInputDialog(null, "Ingrese la altura del rectángulo:");
        if (inputAltura == null) return; //si el usuario cancela
        double altura = Double.parseDouble(inputAltura);

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        String resultado = String.format("Área: %.2f\nPerímetro: %.2f", area, perimetro);
        JOptionPane.showMessageDialog(null, resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese un número válido.");
        }
    }
}
