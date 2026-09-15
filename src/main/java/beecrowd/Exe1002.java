package beecrowd;

import java.util.Scanner;

public class Exe1002 {
    public static final double PI =  3.14159;

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        double calculo = Math.pow(raio,2) * PI;

        System.out.printf("A= %.4f",calculo );
    }
}
