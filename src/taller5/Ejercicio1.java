
package taller5;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static double calcularPropina(double monto, double porcentaje) {
        return monto * porcentaje / 100;
    }

    public static double calcularTotal(double monto, double porcentaje) {
        return monto + calcularPropina(monto, porcentaje);
    }

    public static void main(String[] args) {
        String entradaMonto = JOptionPane.showInputDialog("Ingrese el monto de la cuenta:");
        String entradaPorcentaje = JOptionPane.showInputDialog("Ingrese el porcentaje de propina:");

        double monto = Double.parseDouble(entradaMonto);
        double porcentaje = Double.parseDouble(entradaPorcentaje);

        double propina = calcularPropina(monto, porcentaje);
        double total = calcularTotal(monto, porcentaje);

        String resultado = String.format(
            java.util.Locale.US,
            "Propina: $%.2f\nTotal: $%.2f",
            propina, total
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}
