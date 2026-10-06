package refeicao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Quantas refeições foram servidas hoje?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
        RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];



        for (int k = 0; k < quantidadeRefeicoes; k++) {
            System.out.println("Matrícula do(a) aluno(a) " + (k + 1) );
            String matricula = leitor.nextLine();
            System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR");
            String tipoRefeicao = leitor.nextLine();
            refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
            System.out.printf("%s\n", refeicoes[k]);
        }

        int contAlmoco = quantidadeDeAlmoco(refeicoes);

        System.out.println("Houve alguma refeição do tipo CAFÉ? ");
        verificaCafe(refeicoes);

// TODO: Código a acrescentar

        System.out.println("Quantidade de refeições do tipo ALMOÇO realizadas: " + contAlmoco);
        System.out.printf("FIM DO PROGRAMA");
        leitor.close();
    }

    private static void verificaCafe(RefeicaoRealizada[] refeicoes) {
        boolean houveCafe = false;
        for (int k = 0; k < refeicoes.length; k++) {
            if (refeicoes[k].getTipoRefeicao().equalsIgnoreCase("café")) {
                houveCafe = true;
            }
        }
        if (houveCafe)
            System.out.println("SIM");
        else
            System.out.println("NÃO");
    }

    private static int quantidadeDeAlmoco(RefeicaoRealizada[] refeicoes) {
        int contAlmoco = 0;
        for (int k = 0; k < refeicoes.length; k++) {
            if (refeicoes[k].getTipoRefeicao().equalsIgnoreCase("almoço")) {
                contAlmoco++;
            }
        }
        return contAlmoco;
    }

}
