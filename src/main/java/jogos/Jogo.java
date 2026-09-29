package jogos;

public class Jogo {
    private String time1;
    private String time2;
    private int numGolsTime1;
    private int numGolsTime2;

    public Jogo(){

    }

    public Jogo(String time1, String time2, int numGolsTime1, int numGolsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.numGolsTime1 = numGolsTime1;
        this.numGolsTime2 = numGolsTime2;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public int getNumGolsTime1() {
        return numGolsTime1;
    }

    public void setNumGolsTime1(int numGolsTime1) {
        this.numGolsTime1 = numGolsTime1;
    }

    public int getNumGolsTime2() {
        return numGolsTime2;
    }

    public void setNumGolsTime2(int numGolsTime2) {
        this.numGolsTime2 = numGolsTime2;
    }



    @Override
    public String toString() {
        return "Jogo: " + time1 + " x " + time2 + ", " + numGolsTime1 +" x "+ numGolsTime2 +", placar total do jogo: " + (numGolsTime1 + numGolsTime2);
    }
}
