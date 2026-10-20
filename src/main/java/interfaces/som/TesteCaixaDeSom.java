package interfaces.som;

public class TesteCaixaDeSom {
    public static void main(String[] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P", "Giannini"));
        // ...TODO: COMPLETAR
        caixa.tocarTodosOsEmissores();
    }
}
