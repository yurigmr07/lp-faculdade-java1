package aulas;

import java.util.Scanner;

public class Adivinha {
    public static int sorteiaNumeroInteiro(int maximo) {
    int x = (int) (Math.random()*(maximo+1)); //gera número inteiro aleatório entre [0-maximo]
    return x;
    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxNum = 100;
        int pontos = 100;
        int y = sorteiaNumeroInteiro(maxNum);


        boolean acertou = false;
        int tentativas = 0;

        System.out.println("Saldo de pontos inicial : " + pontos);
        do {
            System.out.println("Tente adivinhar y [0-100]:");
            int numLido = Integer.parseInt(leitor.next());
            tentativas ++;
            pontos -= 2;
            if (numLido == y){
                System.out.println("Parabéns! Você acertou. Número de tentativas:"+tentativas+". Saldo de pontos final: " + pontos );
                acertou = true;
            } else {
                if ( numLido < y)
                    System.out.printf("o número sorteado é maior que %d\n", numLido);
                else
                    System.out.printf("o número sorteado é menor que %d\n", numLido);
            }


        } while (acertou != true);



        leitor.close();
    }
}
