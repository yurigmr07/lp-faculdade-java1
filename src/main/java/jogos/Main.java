package jogos;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time1 = sc.next();
        String time2 = sc.next();
        int numGolsTime1 = sc.nextInt();
        int numGolsTime2 = sc.nextInt();

        Jogo jogo = new Jogo(time1, time2, numGolsTime1, numGolsTime2);

        System.out.println(jogo);


        sc.close();
    }
}
