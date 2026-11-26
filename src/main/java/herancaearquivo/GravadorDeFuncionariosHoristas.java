package herancaearquivo;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GravadorDeFuncionariosHoristas {
    private static final String SEPARADOR = "###";

    public static List<FuncionarioHorista> lerFuncionarios(String caminho) throws IOException {
        List<FuncionarioHorista> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;
                String[] d = linha.split(SEPARADOR);
                lista.add(new FuncionarioHorista(
                        d[0],
                        d[1],
                        LocalDate.parse(d[2]),
                        Double.parseDouble(d[3]),
                        Integer.parseInt(d[4])));
            }
        }
        return lista;
    }

    public static void gravarFuncionarios(List<FuncionarioHorista> lista, String caminho) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
            for (FuncionarioHorista f : lista) {
                bw.write(f.getNome() + SEPARADOR
                        + f.getCpf() + SEPARADOR
                        + f.getDataNascimento() + SEPARADOR
                        + f.getValorHora() + SEPARADOR
                        + f.getHorasTrabalhadas());
                bw.newLine();
            }
        }
    }
}
