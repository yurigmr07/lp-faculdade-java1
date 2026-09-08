package entrada;

import javax.swing.*;

public class Main {
    static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String cidade = JOptionPane.showInputDialog("Digite seu cidade");

        JOptionPane.showMessageDialog(null,"Oi " + nome  + "! Que legal saber que você é da cidade " + cidade );

    }
}
