import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int menorNum = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menorNum) {
                menorNum = numeros[i];
            }
        }

        System.out.println("Menor número: " + menorNum);

        sc.close();
    }
}
