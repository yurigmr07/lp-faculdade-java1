package Exercicio7.pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class TestePessoa {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int numPessoas = 0;

        while (numPessoas < 5){
            System.out.print("Informe seu nome: ");
            String nome = sc.next();
            System.out.println("Informe sua idade: ");
            int idade = sc.nextInt();

            Pessoa pessoa = new Pessoa(nome, idade);
            pessoas.add(pessoa);

            numPessoas++;
        }


        for (Pessoa p: pessoas){
            if (p.eDeMaior()){
                System.out.println(p.getNome() + " é de maior");
            } else {
                System.out.println(p.getNome() + " é de menor");
            }
        }

        sc.close();
    }
}
