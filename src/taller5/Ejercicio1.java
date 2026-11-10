package taller5;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1 - Calculadora de propina (JOptionPane)
*/
public class Ejercicio1 {

    public static double calcularPropina(double monto, double porcentaje) {
        return monto * porcentaje / 100;
    }

    public static double calcularTotal(double monto, double porcentaje) {
        double propina = calcularPropina(monto, porcentaje);
        return monto + propina;
    }

    public static void main(String[] args) {
        String textoMonto = JOptionPane.showInputDialog("Ingrese el monto de la cuenta:");
        String textoPorc = JOptionPane.showInputDialog("Ingrese el porcentaje de propina:");

        double monto = Double.parseDouble(textoMonto);
        double porcentaje = Double.parseDouble(textoPorc);

        double propina = calcularPropina(monto, porcentaje);
        double total = calcularTotal(monto, porcentaje);

        String mensaje = String.format("Propina: $%.2f\nTotal: $%.2f", propina, total);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}