package Exercicio.exercicio6_1;

import java.util.Scanner;

public class ProgramaDescontos {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());

        Produto[] produtos = new Produto[quant];


        for (int k = 0; k < quant; k++) {
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));


            double valorComDesconto = calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n", valorComDesconto);

            produtos[k] = p;
        }

        double calculo = calculaSomatorioDescontos(produtos);
        System.out.println("Soma dos descontos: " + calculo);

        String maior = verificaProdutoComMaiorDesconto(produtos);
        System.out.println("Produto com maior desconto: " + maior);

        leitor.close();
    }

    public static double calculaValorComDesconto(double valorProduto) {
        if (valorProduto < 50) {
            return (valorProduto);
        } else if (valorProduto < 100) {
            return (valorProduto - (valorProduto * 0.05));
            //5% de desconto se valor entre 50 e 100 (sem incluir 100)
        } else {
            return (valorProduto - (valorProduto * 0.10));
            //10% de desconto
        }
    }

    private static double calculaSomatorioDescontos(Produto[] produtos) {
        double somaDesconto = 0;
        for (int k = 0; k < produtos.length; k++) {
            double preco = produtos[k].getPreco();
            double desconto = preco - calculaValorComDesconto(preco);
            somaDesconto += desconto;
        }
        return somaDesconto;
    }

    private static String verificaProdutoComMaiorDesconto(Produto[] produtos) {
        String maiorNome = "";
        double maiorDesconto = 0;
        for (int i = 0; i < produtos.length; i++) {
            double preco = produtos[i].getPreco();
            double desconto = preco - calculaValorComDesconto(preco);
            if (desconto > maiorDesconto) {
                maiorDesconto = desconto;
                maiorNome = produtos[i].getNome();
            }
        }
        return maiorNome ;
    }


}
