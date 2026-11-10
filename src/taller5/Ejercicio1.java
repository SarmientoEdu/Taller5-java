
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

        String entradaMonto = JOptionPane.showInputDialog(
            "Ingrese el monto de la cuenta:"
        );

        double monto = Double.parseDouble(entradaMonto);

        String entradaPorcentaje = JOptionPane.showInputDialog(
            "Ingrese el porcentaje de propina:"
        );

        double porcentaje = Double.parseDouble(entradaPorcentaje);

        double propina = calcularPropina(monto, porcentaje);

        double total = calcularTotal(monto, porcentaje);

        JOptionPane.showMessageDialog(
            null,
            String.format(
                "Propina: $%.2f\nTotal: $%.2f",
                propina,
                total
            )
        );
    }
}

