package aulas;

import java.util.Scanner;

public class Adivinha {
    public static int sorteiaNumeroInteiro(int maximo) {
        int x = (int)(Math.random()*(maximo+1)); //gera número inteiro aleatório entre [0-maximo]
        return x;
    }

    static final int MAXIMO = 100;
    static final int PONTOS_INICIAIS = 100;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int pontos = PONTOS_INICIAIS;
        int numeroSecreto = sorteiaNumeroInteiro(MAXIMO);


        boolean acertou = false;
        int tentativas = 0;

        System.out.println("Saldo de pontos inicial : " + pontos);
        do {
            System.out.println("Tente adivinhar y [0-100]:");
            int numLido = leitor.nextInt();
            tentativas ++;
            pontos -= 2;
            if (numLido == numeroSecreto){
                System.out.println("Parabéns! Você acertou. Número de tentativas:"+tentativas+". Saldo de pontos final: " + pontos );
                acertou = true;
            } else {
                if ( numLido < numeroSecreto)
                    System.out.printf("o número sorteado é maior que %d\n", numLido);
                else
                    System.out.printf("o número sorteado é menor que %d\n", numLido);
            }


        } while (!acertou);



        leitor.close();
    }
}
