package titureco;

import java.util.List;

public interface TiturecoInterface {
    boolean cadastrarAtrativo(AtrativoTuristico atrativo);

    boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado);

    List<AtrativoTuristico> getAtrativo();

    List<AtrativoTuristico> pesquisaAtrativoDaCidade(String cidade, String estado);
}
