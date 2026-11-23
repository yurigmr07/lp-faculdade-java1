package atendimento;

import java.util.Scanner;

public class ProgramaAtendimentosMedicos {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos atendimentos você quer cadastrar?");
        int quantAtendimentos = Integer.parseInt(leitor.nextLine());
        AtendimentoMedico [] atendimentos = new AtendimentoMedico [quantAtendimentos];
        for (int k=0; k< quantAtendimentos; k++) {
            System.out.println("Qual o código do atendimento?");
            String codigo= leitor.nextLine();
            System.out.println("Qual o dia do atendimento?");
            String diaAtendimento = leitor.nextLine();
            System.out.println("Qual a categoria do atendimento? CLÍNICA,"
                    + "ORTOPÉDICO ou CARDIOLÓGICO");
            String categoriaAtendimento = leitor.nextLine();
            atendimentos[k]  = new AtendimentoMedico(codigo, diaAtendimento, categoriaAtendimento);
        }
        imprimeAtendimentos(atendimentos);

        int totalCardiologicos = contaQuantidadeDeAtendimentosCardiologicos(atendimentos);
        System.out.println("Quantidade de atendimentos cardiológicos: " + totalCardiologicos);

        System.out.println("Qual data você quer consultar?");
        String dataConsulta = leitor.nextLine();
        if (existiramAtendimentosNaData(dataConsulta, atendimentos)) {
            System.out.println("Existiram atendimentos na data " + dataConsulta);
        } else {
            System.out.println("Não existiram atendimentos na data " + dataConsulta);
        }

        leitor.close();
    }

    private static void imprimeAtendimentos(AtendimentoMedico[] atendimentos) {
        System.out.println("Atendimentos feitos:");
        int i=0;
        while (i< atendimentos.length) {
            System.out.println("Ficha:"+atendimentos[i].getCodigoAtendimento()+", Data:"+atendimentos[i].getDiaAtendimento()
                    +", Categoria:"+       atendimentos[i].getCategoriaAtendimento());
            i+=1;
        }
    }


    private static int contaQuantidadeDeAtendimentosCardiologicos(AtendimentoMedico[] atendimentos) {
        int quantidade = 0;
        for (int i = 0; i < atendimentos.length; i++) {
            if (atendimentos[i].getCategoriaAtendimento().equalsIgnoreCase("cardiológico")) {
                quantidade++;
            }
        }
        return quantidade;
    }


    private static boolean existiramAtendimentosNaData(String data, AtendimentoMedico[] atendimentos) {
        for (int i = 0; i < atendimentos.length; i++) {
            if (atendimentos[i].getDiaAtendimento().equals(data)) {
                return true;
            }
        }
        return false;
    }
}
