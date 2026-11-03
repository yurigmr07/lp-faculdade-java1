package titureco;

import java.util.List;

public class TiturecoList implements TiturecoInterface{

    private List<AtrativoTuristico> atrativos;


    @Override
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
        return false;
    }

    @Override
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado) {
        return false;
    }

    @Override
    public List<AtrativoTuristico> getAtrativo() {
        return List.of();
    }

    @Override
    public List<AtrativoTuristico> pesquisaAtrativoDaCidade(String cidade, String estado) {
        return List.of();
    }
    //TODO:




}
