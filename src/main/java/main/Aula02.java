package main;

import javax.swing.*;

public class Aula02 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idadeString = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(idadeString);
        String alturaString = JOptionPane.showInputDialog("Digite seu altura: ");
        double altura = Double.parseDouble(alturaString);

        JOptionPane.showMessageDialog(null, "Oi " + nome+ ". Sua idade é: " + idade + " e sua altura é: " + altura);
    }
}
