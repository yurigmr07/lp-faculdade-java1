package herancaearquivo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaFuncionarios {
    public static void main(String[] args) {
        String arquivo = "funcionariosHoristas.txt";
        List<FuncionarioHorista> lista = new ArrayList<>();

        // 1) Tenta carregar o arquivo
        try {
            lista = GravadorDeFuncionariosHoristas.lerFuncionarios(arquivo);
            System.out.println("Funcionários lidos do arquivo:");
            for (FuncionarioHorista f : lista) {
                System.out.println(f);
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado ou erro de leitura. Começando com lista vazia.");
        } catch (RuntimeException e) {
            System.out.println("Arquivo com formato inválido: " + e.getMessage());
        }

        // 2) Lê mais um funcionário
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            System.out.print("Data de nascimento (aaaa-mm-dd): ");
            LocalDate nascimento = LocalDate.parse(sc.nextLine());
            System.out.print("Valor da hora (use ponto, ex: 25.5): ");
            double valorHora = Double.parseDouble(sc.nextLine());
            System.out.print("Horas trabalhadas: ");
            int horas = Integer.parseInt(sc.nextLine());

            FuncionarioHorista novo = new FuncionarioHorista(nome, cpf, nascimento, valorHora, horas);

            if (lista.contains(novo)) {
                System.out.println("Já existe funcionário com esse CPF. Nada foi gravado.");
            } else {
                lista.add(novo);
                // 3) Grava a lista atualizada
                GravadorDeFuncionariosHoristas.gravarFuncionarios(lista, arquivo);
                System.out.println("Lista atualizada gravada com " + lista.size() + " funcionário(s).");
            }
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Dado inválido: " + e.getMessage());
        }
        sc.close();
    }
}
