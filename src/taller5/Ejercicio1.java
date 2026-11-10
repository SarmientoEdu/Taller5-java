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
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto de la cuenta:"));
        double porcentaje = Double.parseDouble(JOptionPane.showInputDialog("Porcentaje de propina:"));

        String salida = String.format("Propina: $%.2f%nTotal: $%.2f",
                calcularPropina(monto, porcentaje), calcularTotal(monto, porcentaje));
        JOptionPane.showMessageDialog(null, salida);
    }
}