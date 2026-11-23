package Exercicio.exercicio6_2.refeicao2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int n = sc.nextInt();
        double totalGasto = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.println("Tipo de refeição: ");
            String tipoRefeicao = sc.next();
            if(tipoRefeicao.equalsIgnoreCase("almoço")) {
                System.out.println("Valor do almoço: ");
                totalGasto += sc.nextDouble();
            }
        }
        System.out.printf("Total de gasto: %.2f%n" , totalGasto);
    }
}
