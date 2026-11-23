package titureco;

import java.util.ArrayList;
import java.util.List;

public class TiturecoList implements TiturecoInterface{

    private List<AtrativoTuristico> atrativos;

    public TiturecoList() {
        this.atrativos = new ArrayList<AtrativoTuristico>();
    }

    @Override
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
        if (atrativo == null || atrativos.contains(atrativo)) {
            return false;
        }
        return atrativos.add(atrativo);
    }

    @Override
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado) {
        AtrativoTuristico procurado = new AtrativoTuristico();
        procurado.setNome(nomeAtrativo);
        procurado.setCidade(cidade);
        procurado.setEstado(estado);
        return atrativos.remove(procurado);
    }

    @Override
    public List<AtrativoTuristico> getAtrativo() {
        return atrativos;
    }

    @Override
    public List<AtrativoTuristico> pesquisaAtrativoDaCidade(String cidade, String estado) {
        List<AtrativoTuristico> resultado = new ArrayList<AtrativoTuristico>();
        for (AtrativoTuristico a : atrativos) {
            if (a.getCidade().equalsIgnoreCase(cidade) && a.getEstado().equalsIgnoreCase(estado)){
                resultado.add(a);
            }
        }
        return resultado;
    }

}
