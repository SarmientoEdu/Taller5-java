package taller5;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1 - Calculadora de propina (JOptionPane)
 *
 * El autograde invoca por reflexión:
 *   calcularPropina(double monto, double porcentaje)
 *   calcularTotal(double monto, double porcentaje)
 *
 * El main debe usar JOptionPane para interactuar con el usuario.
 */
public class Ejercicio1 {

    public static double calcularPropina(double monto, double porcentaje) {
        return monto * porcentaje / 100;
    }

    public static double calcularTotal(double monto, double porcentaje) {
        return monto + calcularPropina(monto, porcentaje);
    }

    public static void main(String[] args) {
        double monto = Double.parseDouble(
                JOptionPane.showInputDialog("Monto de la cuenta:"));
        double porcentaje = Double.parseDouble(
                JOptionPane.showInputDialog("Porcentaje de propina:"));

        double propina = calcularPropina(monto, porcentaje);
        double total = calcularTotal(monto, porcentaje);

        JOptionPane.showMessageDialog(null,
                String.format("Propina: $%.2f\nTotal: $%.2f", propina, total));
    }
}