package compras;

import javax.swing.*;

public class Compra2 {
    public static void main(String[] args) {
        int quantMacas = Integer.parseInt(JOptionPane.showInputDialog("Quantas Maçãs?"));
        int quantMamoes = Integer.parseInt(JOptionPane.showInputDialog("Quantos Mamões?"));
        double valorAPagar = quantMacas + quantMamoes * (3.50+1);
        JOptionPane.showMessageDialog(null, "Você pagará " + valorAPagar);
    }
}
