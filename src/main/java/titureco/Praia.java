package titureco;

public class Praia extends AtrativoTuristico{

    public static final String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
    public static final String TIPO_ONDAS_FORTES = "Ondas Fortes";
    public static final String TIPO_ONDAS_MEDIAS = "Ondas Médias";

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

    public boolean isPropriaParaBanho() {
        return propriaParaBanho;
    }
    public void setPropriaParaBanho(boolean ehPropria) {
        this.propriaParaBanho = ehPropria;
    }

    public boolean isPerigoTubarao() {
        return perigoTubarao;
    }

    public void setPerigoTubarao(boolean perigoTubarao) {
        this.perigoTubarao = perigoTubarao;
    }

    public String getTipoOrla() {
        return tipoOrla;
    }

    public void setTipoOrla(String tipoOrla) {
        this.tipoOrla = tipoOrla;
    }

    @Override
    public String toString() {
        return super.toString() + " | Própria para banho: " + propriaParaBanho
                + " | Perigo de tubarão: " + perigoTubarao
                + " | Orla: " + tipoOrla;
    }
}
