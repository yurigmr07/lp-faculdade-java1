package jogos;

import java.util.Scanner;

public class ProgramaCampeonatoDeFutebol {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos jogos aconteceram no campeonato?");
        int quantJogos = Integer.parseInt(leitor.nextLine());

        String[] timesJogando = new String [quantJogos];
        String[] placaresDosJogos = new String[quantJogos];

        int k= 0;
        while(k<quantJogos){
            System.out.println("Quais os times jogando?");
            timesJogando[k]= leitor.nextLine();
            System.out.println("Qual o placar do jogo?");
            placaresDosJogos[k]= leitor.nextLine();
            k++;
        }


        int jogosSemGols =  contaTotalDeJogosSemGols(placaresDosJogos);
        System.out.println("Total de jogos sem gols: " + jogosSemGols);

        imprimirJogos(timesJogando, placaresDosJogos);
        leitor.close();
    }

    private static void imprimirJogos(String[] timesJogando, String[] placaresDosJogos){
        for (int k=0; k< timesJogando.length; k++) {
            System.out.println("Jogo: " + timesJogando[k]+", Placar: "+ placaresDosJogos[k]);
        }
    }

    private static int contaTotalDeJogosSemGols(String[] placaresDosJogos){
        int quantPlacar = 0;
        for (int i = 0; i < placaresDosJogos.length; i++) {
            if (placaresDosJogos[i].equals("0 x 0")) {
                quantPlacar++;
            }
        }
        return quantPlacar;
    }
}
