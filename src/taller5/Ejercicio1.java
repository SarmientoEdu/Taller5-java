package taller5;

import javax.swing.JOptionPane;
import java.util.Locale;

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
        return monto * porcentaje / 100.0;
    }

    public static double calcularTotal(double monto, double porcentaje) {
        return monto + calcularPropina(monto, porcentaje);
    }

    public static void main(String[] args) {
        String textoMonto = JOptionPane.showInputDialog(null, "Ingrese el monto de la cuenta:");
        if (textoMonto == null) {
            return;
        }
        String textoPorcentaje = JOptionPane.showInputDialog(null, "Ingrese el porcentaje de propina:");
        if (textoPorcentaje == null) {
            return;
        }

        double monto = Double.parseDouble(textoMonto);
        double porcentaje = Double.parseDouble(textoPorcentaje);

        double propina = calcularPropina(monto, porcentaje);
        double total = calcularTotal(monto, porcentaje);

        String mensaje = String.format(Locale.US, "Propina: $%.2f%nTotal: $%.2f", propina, total);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
