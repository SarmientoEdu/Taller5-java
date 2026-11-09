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
        // TODO: retornar la propina = monto * porcentaje / 100        
        return (monto * porcentaje) / 100;
    }

    public static double calcularTotal(double monto, double porcentaje) {
        // TODO: retornar monto + propina
        return monto + calcularPropina(monto, porcentaje);
    }

    public static void main(String[] args) {
        try {
        // TODO:
        // 1. Pedir monto con JOptionPane.showInputDialog
        String inputMonto = JOptionPane.showInputDialog(null, "Ingrese el monto:");
        if (inputMonto == null) return; //si el usuario cancela
        double monto = Double.parseDouble(inputMonto);

        // 2. Pedir porcentaje con JOptionPane.showInputDialog
        // 3. Convertir con Double.parseDouble
        String inputPorcentaje = JOptionPane.showInputDialog(null, "Ingrese el porcentaje de propina:");
        if (inputPorcentaje == null) return; //si el usuario cancela
        double porcentaje = Double.parseDouble(inputPorcentaje);

        // 4. Calcular con los métodos de arriba
        double propina = calcularPropina(monto, porcentaje);
        double total = calcularTotal(monto, porcentaje);

        // 5. Mostrar con JOptionPane.showMessageDialog el formato EXACTO:
        //      Propina: $X.XX
        //      Total: $Y.YY
        String mensaje = String.format("Monto: $%.2f\nPropina: $%.2f\nTotal: $%.2f", monto, propina, total);
        JOptionPane.showMessageDialog(null, mensaje);
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese un número válido.");
        }
    }
}
        
           
