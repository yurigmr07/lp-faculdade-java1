package compras;

import javax.swing.*;

public class Compra1 {
    public static void main(String[] args) {
        int quantMacas = Integer.parseInt(JOptionPane.showInputDialog("Quantas Maçãs?"));
        int quantMamoes = Integer.parseInt(JOptionPane.showInputDialog("Quantos Mamões?"));
        double valorAPagar = quantMacas * 3.50 + quantMamoes * 1;
        JOptionPane.showMessageDialog(null, "Você pagará " + valorAPagar);
    }
}
