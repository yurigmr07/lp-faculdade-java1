package imcs;

import javax.swing.*;

public class MeuIMC {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
        double imc = peso / (Math.pow(altura, 2));
        String mensagem = String.format("%.2f", imc);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
