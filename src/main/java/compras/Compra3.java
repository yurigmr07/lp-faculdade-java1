package compras;

import javax.swing.*;

public class Compra3 {
    public static void main(String[] args) {
        int quantMacas = Integer.parseInt(JOptionPane.showInputDialog("Quantas Maçãs?"));
        int quantMamoes = Integer.parseInt(JOptionPane.showInputDialog("Quantos Mamões?"));
        double valorAPagar = quantMacas * 1 + quantMamoes * 3.50;
        JOptionPane.showMessageDialog(null, "Você pagará " + valorAPagar);
    }
}
