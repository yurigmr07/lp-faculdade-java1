package interfaces.geometria;

public class Quadrado implements Figura{
    private double lado;

    public Quadrado(){

    }

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    public double calcularArea() {
        return Math.pow(this.lado,2);
    }
}
