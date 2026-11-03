package titureco;

public class Praia extends AtrativoTuristico{
    private boolean propriaParaBanho;
    private boolean perigoTubarao;
    private String tipoOrla;

    public Praia() {
    }

    public Praia(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado, boolean propriaParaBanho, boolean perigoTubarao, String tipoOrla){
        super(nome, latitude, longitude, comoChegar, cidade, estado);
        this.propriaParaBanho = propriaParaBanho;
        this.perigoTubarao = perigoTubarao;
        this.tipoOrla = tipoOrla;
    }
}
