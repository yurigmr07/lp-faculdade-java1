package interfaces.geometria;

import java.util.ArrayList;

public class CalculadoraDeAreas {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Quadrado(2));
        // ...TODO: COMPLETAR
        double areaTotal = 0.0;
        for (Figura f : figuras) {
            System.out.println(f.calcularArea());
            // ...TODO: COMPLETAR
        }
        System.out.printf("Área total: %.1f\n", areaTotal);
    }
}
