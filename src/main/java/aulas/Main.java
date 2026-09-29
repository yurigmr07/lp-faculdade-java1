package aulas;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cores = new String[11];
        int contAzul = 0;
        int contRosa = 0;

        // Leitura das 11 Strings e armazenamento no array
        for (int i = 0; i < cores.length; i++) {
            System.out.print("Informe uma cor (azul ou rosa): ");
            cores[i] = sc.nextLine();
        }

        // Verificação do conteúdo do array com o método equals
        for (int i = 0; i < cores.length; i++) {
            if (cores[i].equalsIgnoreCase("azul"))
                contAzul++;
            else if (cores[i].equalsIgnoreCase("rosa"))
                contRosa++;

        }

        // Impressão da cor mais escolhida
        if (contAzul > contRosa) {
            System.out.println("A cor azul foi a mais escolhida: " + contAzul);
        } else if (contRosa > contAzul) {
            System.out.println("A cor rosa foi a mais escolhida foi: " + contRosa);
        } else {
            System.out.println("Houve um empate entre azul e rosa");
        }

        sc.close();

    }


}
