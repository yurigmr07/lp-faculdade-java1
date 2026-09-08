package imcs;

import javax.swing.*;

public class IMC2 {
    public static void main(String[] args) {
        String pesoString = JOptionPane.showInputDialog("Digite seu peso");
        double peso = Double.parseDouble(pesoString);
        String alturaStr = JOptionPane.showInputDialog("Digite sua altura");
        int altura = Integer.parseInt(alturaStr);
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é de " + imc);
    }
}
